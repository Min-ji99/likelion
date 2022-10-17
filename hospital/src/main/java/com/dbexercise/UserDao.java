package com.dbexercise;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    public List<User> searchId(String id) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost=env.get("DB_HOST");
        String dbUser=env.get("DB_USER");
        String dbPassword=env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword); //db연결

        String query="Select * from users where id='"+id+"';";
        Statement stmt = conn.createStatement();
        ResultSet result=stmt.executeQuery(query);

        List<User> users = new ArrayList<>();
        while(result.next()){
            users.add(new User(result.getString("id"), result.getString("name"), result.getString("password")));
        }

        conn.close();
        return users;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        //userDao.add();
        List<User> users=new ArrayList<>();
        users=userDao.searchId("0");
        for(User user : users){
            user.printUserInfo();
        }
    }
}
