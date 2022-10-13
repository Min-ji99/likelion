package com.line;

import com.line.domain.Hospital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateFile {
    private String filename;

    public CreateFile(String filename){
        this.filename=filename;
    }
    public void write(List<Hospital> hospitals) throws IOException {
        File file=new File(filename);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for(Hospital hospital:hospitals){
              bw.write(getInsert(hospital));
        }
        bw.close();
    }
    public String getInsert(Hospital hospital) {
        return "INSERT INTO `seoulhospital`.`seoul_hospital` (`id`, `address`, " +
                "`district`, `category`, `emergency_room`, `name`, `subdivision`) VALUES ('"
                + hospital.getId() + "', '" + hospital.getAddress() + "', '" + hospital.getDistrict() + "', '" + hospital.getCategory()
                + "', " + hospital.getEmergencyRoom() + ", '" + hospital.getName() + "', null);\n";

    }
}
