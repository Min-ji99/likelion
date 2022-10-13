package com.line.parser;

import com.line.domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {
    String line="A1105895,서울특별시 서초구 서초대로77길 59 강남역 2차 I'PARK 지하1층 3층 (서초동),C,의원,G099,응급의료기관 이외,2,공휴일진료는 상황에따라 약간의변동이 있습니다.,구산역 2번 출구 도보 50미터 이내에 위치한 한의원 입니다.,신논현역 6번 출구 아이파크 2차 오피스텔,에르네의원,02-518-7591,070-4698-7811,2100,2100,2100,2100,2100,1700,1500,1400,1100,1100,1100,1100,1100,1100,930,930,66,11,127.0239803,37.5022778,2022.9.7 14:55";
    @Test
    void name() {
        HospitalParser hospitalParser = new HospitalParser();
        Hospital hospital = hospitalParser.parse(this.line);

        Assertions.assertEquals("A1105895", hospital.getId());
        Assertions.assertEquals("서울특별시 서초구 서초대로77길 59 강남역 2차 I\\'PARK 지하1층 3층 (서초동)", hospital.getAddress());
        Assertions.assertEquals("서울특별시 서초구", hospital.getDistrict());
        Assertions.assertEquals("C", hospital.getCategory());
        Assertions.assertEquals(2, hospital.getEmergencyRoom());
        Assertions.assertEquals("에르네의원", hospital.getName());
        Assertions.assertEquals("", hospital.getSubdivision());
    }

}