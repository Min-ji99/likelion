package com.line;

import com.line.domain.Hospital;
import com.line.parser.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController<T> {
    Parser<T> parser;
    public FileController(Parser<T> parser){
        this.parser=parser;
    }

    public List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        br.readLine();
        String str;
        while((str=br.readLine())!=null){
            result.add(parser.parse(str));
        }
        return result;
    }
    public void writeLines(List<String> sqlStatements, String filename) throws IOException {
        File file=new File(filename);
        //BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));

        for(String sqlStatement : sqlStatements){
            bw.write(sqlStatement);
        }
        bw.close();
    }
}
