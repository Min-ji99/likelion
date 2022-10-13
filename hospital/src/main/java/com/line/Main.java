package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename="/Users/minji/Documents/likelion/file/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        String address="/Users/minji/Documents/likelion/MySQL/hospital.sql";
        CreateFile createFile = new CreateFile(address);
        createFile.write(hospitals);

    }

    public static class Query {
    }
}
