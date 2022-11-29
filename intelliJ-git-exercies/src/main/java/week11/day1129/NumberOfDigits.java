package week11.day1129;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDigits {
    public static int[] getDigits(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) set.add(1);
            else set.add((int)Math.log10(arr[i])+1);
        }
        int[] answer=new int[set.size()];
        int idx=0;
        for(Integer num:set){
            answer[idx++]=num;
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0, 20};
        int[] digit=getDigits(arr);
        System.out.println(Arrays.toString(digit));
    }
}
