import java.util.Arrays;
import java.util.Scanner;

public class BussCovidInputDeret {

    public static void main(String[] args) {
        System.out.print("Input the number of families : ");
    System.out.print(bussCheck());
    }

    public static String bussCheck(){
        int totalFamily = 0;
        int totalPenumpang =0;
        int totalBuss = 0;
        Scanner input = new Scanner(System.in);
        totalFamily = input.nextInt();
        input.nextLine();
        System.out.print("Input the number of members in the family ( separated by a space) : ");
        String inputan = input.nextLine().replaceAll(" ","");
        if (inputan.length() < totalFamily){
             return "Input must be equal with count of family";
        }else{
            int count = 0;
            for (int i=0;i<inputan.length();i++){
                int temp = Integer.parseInt(String.valueOf(inputan.charAt(i)));
                totalPenumpang += temp;
            }

            for (int i=1;i<=totalPenumpang;i++){
                count++;
                if (i %4==0) {
                    totalBuss++;
                    count = 0;
                }
            }
            if(count > 0){
                totalBuss++;
            }
        }
         return "Minimum bus required is : " + totalBuss;
    }

}
