package com.line.parser;

public interface Parser<T> { //T -> 어떤 파일을 파싱하는지에 따라 Hospital이 될 수 있고 Patient가 될 수 있음
    T parse(String str);
}
