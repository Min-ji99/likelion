package com.line.dao;


import com.line.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class UserDaoAbstract {
    public abstract Connection makeConnection() throws SQLException;
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
        }

    }
    public User searchId(String id) {
        try {
            Connection conn=makeConnection();

            String query = "Select * from users where id='" + id + "';";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);
            User user;
            if(result.next()) {
                user = new User(result.getString("id"), result.getString("name"), result.getString("password"));
            }else{
                user=new User();
            }
            conn.close();

            return user;
        }catch(SQLException e){
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

}
