package week13.day1213;

import java.util.Arrays;

class Pair{
    int left;
    int right;
    public Pair(int left, int right){
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
public class OptimalStrategy {
    public static Pair calcPair(int[] coins, int i, int j){
        int left=0, right=0;
        boolean turnFlag=true;
        while(i<=j){
            if(coins[i]<coins[j]){
                if(turnFlag)
                    left+=coins[j];
                else right+=coins[j];
                j-=1;
            }else{
                if(turnFlag)
                    left+=coins[i];
                else right+=coins[i];
                i+=1;
            }
            turnFlag=!turnFlag;
        }

        return new Pair(left, right);
    }
    public static int sumFromTo(int[] coins, int from, int to){
        int sum=0;
        while(from<=to){
            sum+=coins[from];
            from+=1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] coins=new int[]{2, 7, 40, 19};
        Pair[][] dp=new Pair[coins.length][coins.length];
        int[][] dpSumFromTo=new int[coins.length][coins.length];

        for(int i=0; i<coins.length; i++){
            dp[i][i]=new Pair(coins[i], 0);
        }

        /*for(int k=1; k<coins.length; k++){
            for(int i=0; i<coins.length; i++){
                int j=i+k;
                if(j>=coins.length) break;
                dp[i][j]=calcPair(coins, i, j);
                System.out.println("i : "+i+", j : "+j+" "+dp[i][j].toString());
            }
        }*/
        for(int k=0; k<coins.length; k++){
            for(int i=0; i<coins.length; i++){
                int j=i+k;
                if(j>=coins.length) break;
                if(j==0) {
                    dpSumFromTo[i][j]=coins[j];
                    continue;
                }
                dpSumFromTo[i][j]=dpSumFromTo[i][j-1]+coins[j];
            }
        }
        for(int i=0; i<coins.length; i++){
            System.out.println(Arrays.toString(dpSumFromTo[i]));
        }
        //System.out.println(dp[0][coins.length-1].toString());
    }
}
