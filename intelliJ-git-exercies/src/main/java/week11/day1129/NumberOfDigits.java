package week11.day1129;

import java.util.*;

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
    public static int[] sort(int[] arr, int digit){
        Queue<Integer>[] queue=new Queue[10];
        for(int i=0; i<queue.length; i++){
            queue[i]=new ArrayDeque<>();
        }
        for(int i=0; i<arr.length; i++){
            int divisor=(int)Math.pow(10, digit-1);
            queue[Math.floorDiv(arr[i], divisor) % 10].add(arr[i]);
        }

        int idx=0;
        for(int i=0; i<queue.length; i++){
            while(!queue[i].isEmpty()){
                arr[idx++]=queue[i].poll();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0, 20};
        int[] digits=getDigits(arr);
        for(var digit:digits){
            arr=sort(arr, digit);
            System.out.println(Arrays.toString(arr));
        }
    }
}