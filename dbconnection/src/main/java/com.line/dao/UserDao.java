package com.line.dao;

import com.line.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private DataSource dataSource;
    private JdbcContext jdbcContext;
    public UserDao(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public void setJdbcContext(JdbcContext jdbcContext){
        this.jdbcContext=jdbcContext;
    }

    public void add(final User user) throws SQLException {
        StatementStrategy st =new AddStrategy(user);
        this.jdbcContext.workWithStatementStrategy(new StatementStrategy() {
            public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps=connection.prepareStatement("Insert into users(id, name, password) values (?, ?, ?)");
                ps.setString(1, user.getId());
                ps.setString(2, user.getName());
                ps.setString(3, user.getPassword());
                return ps;
            }
        });

    }
    public User findById(String id) {
        Connection conn=null;
        ResultSet result=null;
        try {
            conn=dataSource.getConnection();

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
            conn = dataSource.getConnection();
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

    public void deleteAll() throws SQLException {
        this.jdbcContext.workWithStatementStrategy(new StatementStrategy() {
            public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps=connection.prepareStatement("delete from users");
                return ps;
            }
        });
    }


    public int getCount(){
        Connection conn= null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count= 0;
        try {
            conn = dataSource.getConnection();

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
