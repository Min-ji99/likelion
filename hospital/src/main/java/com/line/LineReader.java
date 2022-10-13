package com.line;

import com.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
    Parser<T> parser;
    public LineReader(Parser<T> parser){
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
}
