package com.line.dao;

import com.line.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private ConnectionMaker connectionMaker;
    public UserDao(){
        this.connectionMaker=new AwsConnectionMaker();
    }
    public UserDao(ConnectionMaker connectionMaker){
        this.connectionMaker=connectionMaker;
    }
    public void add(User user) {
        Connection conn=null;
        PreparedStatement ps = null;
        try {
            conn=connectionMaker.makeConnection();
            ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            ps.executeUpdate();

        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            if (ps != null) {
                try{
                    ps.close();
                }catch(SQLException e){}
            }
            if(conn!=null){
                try{
                    conn.close();
                }catch(SQLException e){}
            }
        }

    }
    public User findById(String id) {
        Connection conn=null;
        ResultSet result=null;
        try {
            conn=connectionMaker.makeConnection();

            String query = "Select * from users where id='" + id + "';";
            Statement stmt = conn.createStatement();
            result = stmt.executeQuery(query);
            User user=null;
            if(result.next()) {
                user = new User(result.getString("id"), result.getString("name"), result.getString("password"));
            }
            if(user==null) throw new EmptyResultDataAccessException(1);
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(conn!=null){
                try{
                    conn.close();
                }catch(SQLException e){

                }
            }
            if(result!=null){
                try{
                    result.close();
                }catch(SQLException e){

                }
            }
        }
    }
    public List<User> findAll(){
        Connection conn=null;
        ResultSet result=null;
        try {
            conn = connectionMaker.makeConnection();
            List<User> users = new ArrayList<>();

            Statement stmt = conn.createStatement();
            result = stmt.executeQuery("Select * from users;");

            while (result.next()) {
                users.add(new User(result.getString("id"), result.getString("name"), result.getString("password")));
            }
            return users;
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                try{
                    conn.close();
                }catch(SQLException e){
                }
            }
            if(result !=null){
                try{
                    result.close();
                }catch(SQLException e){
                }
            }
        }

        return null;
    }

    public void deleteAll(){
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            conn= connectionMaker.makeConnection();
            ps=new DeleteAllStrategy().makePreparedStatement(conn);
            ps.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if (conn != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public int getCount(){
        Connection conn= null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count= 0;
        try {
            conn = connectionMaker.makeConnection();

            ps = conn.prepareStatement("select count(*) from users");
            rs = ps.executeQuery();
            if(rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            if(ps!=null){
                try{
                    ps.close();
                }catch(SQLException e){}
            }
            if(conn!=null){
                try{
                    conn.close();
                }catch(SQLException e){}
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException e){}
            }
        }

        return count;
    }
}
