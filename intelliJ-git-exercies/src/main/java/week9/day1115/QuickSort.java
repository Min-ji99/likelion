package week9.day1115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    public List<Integer> sorting(List<Integer> arr){
        if(arr.size()<=1) return arr;
        Integer pivot=arr.get(arr.size()/2);
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        List<Integer> equalPivot=new ArrayList<>();

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)<pivot) left.add(arr.get(i));
            else if(arr.get(i)>pivot) right.add(arr.get(i));
            else equalPivot.add(arr.get(i));
        }

        List<Integer> mergeList=new ArrayList<>();
        mergeList.addAll(sorting(left));
        mergeList.addAll(equalPivot);
        mergeList.addAll(sorting(right));

        return mergeList;
    }
    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();
        Integer[] arr=new Integer[]{20, 18, 5, 19, 5, 25, 40, 50};
        System.out.println(quickSort.sorting(Arrays.asList(arr)));
    }
}
