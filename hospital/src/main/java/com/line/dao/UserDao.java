package com.line.dao;


import com.line.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDao {
    private Connection makeConnection() throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD")); //db연결

        return conn;
    }
    public void add(User user) {
        try {
            Connection conn=makeConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            int status = ps.executeUpdate();
            ps.close();
            conn.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    public User searchId(String id) {
        try {
            Connection conn=makeConnection();

            String query = "Select * from users where id='" + id + "';";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);
            result.next();
            User user = new User(result.getString("id"), result.getString("name"), result.getString("password"));

            conn.close();

            return user;
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    public List<User> findAll() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String dbHost=env.get("DB_HOST");
        String dbUser=env.get("DB_USER");
        String dbPassword=env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword); //db연결

        List<User> users=new ArrayList<>();

        Statement stmt=conn.createStatement();
        ResultSet result=stmt.executeQuery("Select * from users;");

        while(result.next()){
            users.add(new User(result.getString("id"), result.getString("name"), result.getString("password")));
        }

        return users;
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
