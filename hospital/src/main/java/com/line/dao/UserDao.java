package com.line.dao;


import com.line.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDao {
    AwsConnectionMaker awsConnectionMaker;
    public UserDao(){
        this.awsConnectionMaker=new AwsConnectionMaker();
    }
    public void add(User user) {
        try {
            Connection conn=awsConnectionMaker.makeConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            int status = ps.executeUpdate();
            ps.close();
            conn.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }

    }
    public User searchId(String id) {
        try {
            Connection conn=awsConnectionMaker.makeConnection();

            String query = "Select * from users where id='" + id + "';";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);
            result.next();
            User user = new User(result.getString("id"), result.getString("name"), result.getString("password"));

            conn.close();

            return user;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public List<User> findAll(){
        try {
            Connection conn = awsConnectionMaker.makeConnection();
            List<User> users = new ArrayList<>();

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("Select * from users;");

            while (result.next()) {
                users.add(new User(result.getString("id"), result.getString("name"), result.getString("password")));
            }
            return users;
        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add(new User("2", "Ruru", "1234qwer"));
        /*
        User user=userDao.searchId("0");
        user.printUserInfo();
        */

        List<User> users=new ArrayList<>();
        for(User user : users){
            user.printUserInfo();
        }
    }
}
