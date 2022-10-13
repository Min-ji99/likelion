package com.line.parser;

import com.line.domain.Hospital;

import java.util.Arrays;

public class HospitalParser implements Parser<Hospital>{ //parser T도 Hospital LineReader T도 Hospital
    @Override
    public Hospital parse(String str){
        //0번째 id 1번째 주소(address) 2번째 병원분류(category) 6번째 응급실운영여부(emergency room) 10번째 병원이름(name)
        if(str.contains("'")){
            str=str.replace("'", "\\'");
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
        String result="";
        String[] subdivisions={"치과", "소아과", "이비인후과", "피부과", "내과", "성형외과", "외과", "산부인과", "안과", "비뇨기과", "가정", "한의원", "한방"};
        for(String subdividison: subdivisions){
            if (name.contains(subdividison)){
                result=subdividison;
            }
        }
        return result;
    }

}
