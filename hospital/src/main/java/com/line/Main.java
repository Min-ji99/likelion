package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        String readFilename="/Users/minji/Documents/likelion/file/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(readFilename);
        List<String> sqlStatements= new ArrayList<>();
        for(Hospital hospital : hospitals){
            sqlStatements.add(hospital.getInsert2());
        }

        String createFilename="/Users/minji/Documents/likelion/MySQL/hospitalInsert.sql";

        hospitalFileController.writeLines(sqlStatements, createFilename);

    }
}
