package week11.day1128;

public class AlphabetCombination {
    public static void printCombination(String prefix, int n){
        if(prefix.length()>n-1) {
            System.out.println(prefix);
            return;
        }
        for(char c='A'; c<='Z'; c++){
            printCombination(prefix+c, n);
        }
    }
    public static void main(String[] args) {
        printCombination("", 2);
    }
}
