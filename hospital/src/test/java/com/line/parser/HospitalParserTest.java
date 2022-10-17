package com.line.parser;

import com.line.domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {
    String line1="A1105895,서울특별시 서초구 서초대로77길 59 강남역 2차 I'PARK 지하1층 3층 (서초동),C,의원,G099,응급의료기관 이외,2,공휴일진료는 상황에따라 약간의변동이 있습니다.,구산역 2번 출구 도보 50미터 이내에 위치한 한의원 입니다.,신논현역 6번 출구 아이파크 2차 오피스텔,에르네의원,02-518-7591,070-4698-7811,2100,2100,2100,2100,2100,1700,1500,1400,1100,1100,1100,1100,1100,1100,930,930,66,11,127.0239803,37.5022778,2022.9.7 14:55";
    String line2="A1108059,서울특별시 강북구 도봉로 189 (미아동),N,치과의원,G099,응급의료기관 이외,2,일요일 둘째주 휴진,점심시간 : 오후 1시-오후 2시 전화 예약 가능,미아역 5번출구,강기호치과의원,02-982-8747,1811-7755,1800,1800,1800,1800,1800,1300,1500,1500,930,930,930,930,930,930,1200,1200,11,70,127.0261394,37.62563171,2022.9.7 14:55";
    HospitalParser hospitalParser = new HospitalParser();
    @Test
    void name() {
        Hospital hospital = hospitalParser.parse(this.line1);

        Assertions.assertEquals("A1105895", hospital.getId());
        Assertions.assertEquals("서울특별시 서초구 서초대로77길 59 강남역 2차 I\\'PARK 지하1층 3층 (서초동)", hospital.getAddress());
        Assertions.assertEquals("서울특별시 서초구", hospital.getDistrict());
        Assertions.assertEquals("C", hospital.getCategory());
        Assertions.assertEquals(2, hospital.getEmergencyRoom());
        Assertions.assertEquals("에르네의원", hospital.getName());
        Assertions.assertEquals("", hospital.getSubdivision());

    }
    @Test
    @DisplayName("첫 번째 SqlInsertQuery 만드는 Method")
    void testMakeSqlInsertQuery1(){
        Hospital hospital = hospitalParser.parse(this.line2);

        String sql="INSERT INTO `seoulhospital`.`seoul_hospital` (`id`, `address`, `district`, `category`, `emergency_room`, `name`, `subdivision`) VALUES ('A1108059', '서울특별시 강북구 도봉로 189 (미아동)', '서울특별시 강북구', 'N', 2, '강기호치과의원', '치과');\n";
        Assertions.assertEquals(sql, hospital.getInsert2());
    }
    @Test
    @DisplayName("두 번째 SqlInsertQuery 만드는 Method")
    void testMakeSqlInertQuery2(){
        Hospital hospital = hospitalParser.parse(this.line1);

        String sql = "INSERT INTO `seoulhospital`.`seoul_hospital` (`id`, `address`, `district`, `category`, `emergency_room`, `name`, `subdivision`) VALUES ('A1105895', '서울특별시 서초구 서초대로77길 59 강남역 2차 I\\'PARK 지하1층 3층 (서초동)', '서울특별시 서초구', 'C', 2, '에르네의원', '');\n";
        Assertions.assertEquals(sql, hospital.getInsert2());
    }

}