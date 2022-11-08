package week8.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int start=0;
        int end=nums.length-1;
        int targetNum=7;
        while(start<=end) {
            // 중간값 찾기
            int mid = (start + end) / 2;
            // 같은지 비교하기
            if(nums[mid]==targetNum){
                break;
            }
            // 인덱스(시작점, 끝점) 옮기기
            if(nums[mid]>targetNum){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(start);
    }
}
