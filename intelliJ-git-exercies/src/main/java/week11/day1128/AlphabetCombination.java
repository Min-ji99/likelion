package week11.day1128;

public class AlphabetCombination {
    private static final String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        for(int i=0; i<alphabet.length(); i++){
            for(int j=0; j<alphabet.length(); j++) {
                System.out.println(String.valueOf(alphabet.charAt(i)) + String.valueOf(alphabet.charAt(j)));
            }
        }
    }
}
