package week13.day1213;

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
    public static void main(String[] args) {
        int[] coins=new int[]{2, 7, 40, 19};
        Pair[][] dp=new Pair[coins.length][coins.length];

        for(int i=0; i<coins.length; i++){
            dp[i][i]=new Pair(coins[i], 0);
        }
        for(int i=0; i<coins.length;i++){
            int j=i+1;
            if(j>=coins.length) break;
            if(dp[i][j-1].left<dp[i+1][j].left){
                dp[i][j]=new Pair(dp[i+1][j].left, dp[i][j-1].left);
            }else{
                dp[i][j]=new Pair(dp[i][j-1].left, dp[i+1][j].left);
            }
            System.out.println(dp[i][j].toString());
        }
    }
}
