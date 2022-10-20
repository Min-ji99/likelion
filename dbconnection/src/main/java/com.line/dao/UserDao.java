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

            int status = ps.executeUpdate();

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
        try {
            Connection conn=connectionMaker.makeConnection();

            String query = "Select * from users where id='" + id + "';";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);
            User user=null;
            if(result.next()) {
                user = new User(result.getString("id"), result.getString("name"), result.getString("password"));
            }
            conn.close();
            if(user==null) throw new EmptyResultDataAccessException(1);
            return user;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public List<User> findAll(){
        try {
            Connection conn = connectionMaker.makeConnection();
            List<User> users = new ArrayList<>();

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("Select * from users;");

            while (result.next()) {
                users.add(new User(result.getString("id"), result.getString("name"), result.getString("password")));
            }
            conn.close();
            return users;
        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    public void deleteAll() throws SQLException{
        Connection conn= null;
        PreparedStatement ps= null;
        try {
            conn = connectionMaker.makeConnection();
            ps = conn.prepareStatement("delete from users");
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if(conn!=null){
                try{
                    conn.close();
                }catch(SQLException e){
                }
            }
        }
    }

    public int getCount() throws SQLException{
        Connection conn= connectionMaker.makeConnection();

        PreparedStatement ps = conn.prepareStatement("select count(*) from users");
        ResultSet rs = ps.executeQuery();
        rs.next();
        int count=rs.getInt(1);
        rs.close();
        ps.close();
        conn.close();

        return count;
    }
}