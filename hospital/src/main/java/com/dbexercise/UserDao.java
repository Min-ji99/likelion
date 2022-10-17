package com.dbexercise;


import com.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String dbHost=env.get("DB_HOST");
        String dbUser=env.get("DB_USER");
        String dbPassword=env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword); //db연결
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, "1");
        ps.setString(2, "Glidong");
        ps.setString(3, "0101");

        int status = ps.executeUpdate();
        ps.close();
        conn.close();
    }
    public User searchId(String id) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost=env.get("DB_HOST");
        String dbUser=env.get("DB_USER");
        String dbPassword=env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword); //db연결

        String query="Select * from users where id='"+id+"';";
        Statement stmt = conn.createStatement();
        ResultSet result=stmt.executeQuery(query);

        User user=new User();
        while(result.next()){
            user.setId(result.getString("id"));
            user.setName(result.getString("name"));
            user.setPassword(result.getString("password"));
        }

        conn.close();
        return user;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        //userDao.add();
        User user=userDao.searchId("0");
        user.printUserInfo();
    }
}
