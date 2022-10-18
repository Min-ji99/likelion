package com.line.dao;

import com.line.FileController;
import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Map;

public class HospitalDao {
    public void add(Hospital hospital, Map<String, String> env){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(env.get("DB_HOST"),
                    env.get("DB_USER"), env.get("DB_PASSWORD"));
            PreparedStatement pstmt=conn.prepareStatement(
                    "INSERT INTO seoul_hospital(id, address, district, category, emergency_room, name, subdivision) VALUES (?, ?, ?, ?, ?, ?, ?);");
            pstmt.setString(1, hospital.getId());
            pstmt.setString(2, hospital.getAddress());
            pstmt.setString(3, hospital.getDistrict());
            pstmt.setString(4, hospital.getCategory());
            pstmt.setInt(5, hospital.getEmergencyRoom());
            pstmt.setString(6, hospital.getName());
            pstmt.setString(7, hospital.getSubdivision());

            int status = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public void searchSubdivision(String subdivision, Map<String, String> env){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(env.get("DB_HOST"),
                    env.get("DB_USER"), env.get("DB_PASSWORD"));
            String query="Select * from seoul_hospital where subdivision='"+subdivision+"';";
            Statement stmt = conn.createStatement();
            ResultSet result=stmt.executeQuery(query);
            while(result.next()){
                System.out.println(result.getString("name"));
            }
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        HospitalDao hospitalDao = new HospitalDao();
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        String readFilename="/Users/minji/Documents/likelion/file/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(readFilename);
    }
}
