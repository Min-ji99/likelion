package week11.day1128;

public class AlphabetCombination {
    public static void printCombination(String prefix){
        if(prefix.length()>2) return;
        System.out.println(prefix);
        for(char c='A'; c<='Z'; c++){
            printCombination(prefix+c);
        }
    }
    public static void main(String[] args) {
        printCombination("");
    }
}
