package week11.day1128;

public class AlphabetCombination {
    public static void printCombination(char c){
        if(c>'Z') return;
        System.out.println(c);
        printCombination((char)(c+1));
    }
    public static void main(String[] args) {
        printCombination('A');
    }
}
