public class SortCharacter {

    public static void main(String[] args) {
        String input = "Sample Case";
        StringBuilder vocal = new StringBuilder();
        StringBuilder consonant =new StringBuilder();
        String inputLower = input.replaceAll(" ","").toLowerCase();
        for (int i=0;i<inputLower.length();i++){
            if (inputLower.charAt(i) == 'a' || inputLower.charAt(i) == 'i' || inputLower.charAt(i) == 'u'
            || inputLower.charAt(i) == 'e' || inputLower.charAt(i) == 'o'){
                vocal.append(inputLower.charAt(i));
            }else{
                consonant.append(inputLower.charAt(i));
            }
        }

        System.out.println(vocal);
        System.out.println(consonant);
    }
}
