package week3.day1007.population;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {
    private int fromSido; //전출
    private int toSido; //전입

    //constructor 추가 fromSido, toSido를 받아서 멤버변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido){
        this.fromSido=fromSido;
        this.toSido=toSido;
    }
    public int getFromSido(){
        return fromSido;
    }
    public int getToSido(){
        return toSido;
    }
}
