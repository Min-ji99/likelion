package week10.day1112;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {
    public int sum(List<Integer> nums){
        if(nums.isEmpty()) return 0;
        return nums.remove(nums.size()-1)+sum(nums);
    }
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(List.of(1,2,3,4,5));
        SumOfList sumOfList=new SumOfList();
        System.out.println(sumOfList.sum(nums));
    }
}
