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
    RowMapper<User> rowMapper=new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user=new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));

            return user;
        }
    };
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

        return this.jdbcTemplate.queryForObject("select * from users where id=?", rowMapper, id);
    }
    public List<User> findAll(){

        return this.jdbcTemplate.query("select * from users", rowMapper);
    }

    public int getCount(){
        return this.jdbcTemplate.queryForObject("select count(*) from users;", Integer.class);
    }
}
