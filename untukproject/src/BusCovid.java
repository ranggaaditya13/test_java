import java.util.Scanner;

public class BusCovid {

    public static void main(String[] args) {

        System.out.print(needBuss(5));
    }

    public static String needBuss(int familyNumb ){
        Scanner input = new Scanner(System.in);
        familyNumb = input.nextInt();
        int totalPenumpang = 0;
        int totalBus = 0;
       if (familyNumb <=0){
           System.out.println("Inputan Tidak Boleh dibawah 0");
       }else{
           System.out.print("Input the number of members in the family : ");
           for (int i=0;i<familyNumb;i++){
               int inputan = input.nextInt();
               //
               if (inputan > 4){
                  return "Input must be equal with count of family";
               }else{
                   totalPenumpang += inputan;
               }
           }
            int count =0;
           for (int i =1;i<=totalPenumpang;i++){
               count++;
               if (count %4==0){
                   count = 0;
                   totalBus++;
               }
           }
           if (count > 0){
               totalBus++;
           }
       }
        return "Minimum bus required is : "+ totalBus;
    }
}
