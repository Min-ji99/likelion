package com.line.dao;

import com.line.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public UserDao(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public void setDataSource(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
    }
    public void deleteAll(){
        this.jdbcTemplate.update("delete from users");
    }
    public void add(final User user){
        this.jdbcTemplate.update("insert into users(id, name, password) values (?, ?, ?)",
                user.getId(), user.getName(), user.getPassword());

    }
    public User findById(String id) {
        RowMapper<User> rowMapper=new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user=new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
                return user;
            }
        };
        return this.jdbcTemplate.queryForObject("select * from users where id=?", rowMapper, id);
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

    public int getCount(){
        return this.jdbcTemplate.queryForObject("select count(*) from users;", Integer.class);
    }
}
