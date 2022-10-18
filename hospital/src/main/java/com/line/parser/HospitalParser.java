package com.line.parser;

import com.line.domain.Hospital;

import java.sql.*;
import java.util.Map;

public class HospitalParser implements Parser<Hospital>{ //parser T도 Hospital LineReader T도 Hospital
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
    @Override
    public Hospital parse(String str){
        //0번째 id 1번째 주소(address) 2번째 병원분류(category) 6번째 응급실운영여부(emergency room) 10번째 병원이름(name)
        if(str.contains("'")){
            str=str.replace("'", "\\'");
            //str=str.replaceAll("'", "\\\\'");
        }

        String[] splitted = str.split(",");
        String district=getDistrict(splitted[1]);
        String subdivision=getSubdivision(splitted[10]);
        //System.out.println(district);
        return new Hospital(splitted[0], splitted[1], district, splitted[2], splitted[6], splitted[10], subdivision);
    }
    public String getDistrict(String address){
        String[] splitAddress=address.split(" ");
        return splitAddress[0]+' '+splitAddress[1];
    }
    public String getSubdivision(String name){
        String[] subdivisions={"치과", "소아과", "이비인후과", "피부과", "내과", "성형외과", "외과", "산부인과", "안과", "비뇨기과", "가정", "한의원", "한방"};
        for(String subdividison: subdivisions){
            if (name.contains(subdividison)){
                return subdividison;
            }
        }
        return "";
    }

}
