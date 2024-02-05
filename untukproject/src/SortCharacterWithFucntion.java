import java.util.Scanner;

public class SortCharacterWithFucntion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input one line of words (S) : ");
        String sample = input.nextLine();
        vocal(sample);
        consonant(sample);
    }

    public static void vocal(String input){
        StringBuilder vocal = new StringBuilder();
        String inputLower = input.replaceAll(" ","").toLowerCase();
        for (int i=0;i<inputLower.length();i++){
            if (inputLower.charAt(i) == 'a' || inputLower.charAt(i) == 'i' || inputLower.charAt(i) == 'u'
                    || inputLower.charAt(i) == 'e' || inputLower.charAt(i) == 'o'){
                vocal.append(inputLower.charAt(i));
            }
        }
        System.out.println("Vowel Characters :");
        System.out.print(vocal);
        System.out.println();
    }

    public static void consonant(String input) {
        StringBuilder consonant = new StringBuilder();
        String inputLower = input.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < inputLower.length(); i++) {
            if (inputLower.charAt(i) == 'a' || inputLower.charAt(i) == 'i' || inputLower.charAt(i) == 'u'
                    || inputLower.charAt(i) == 'e' || inputLower.charAt(i) == 'o') {
            } else {
                consonant.append(inputLower.charAt(i));
            }
        }

        System.out.println("Consonant Characters :");
        System.out.print(consonant);
        System.out.println();
    }
}
