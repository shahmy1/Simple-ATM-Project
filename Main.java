import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterf ai = new AtmOperationImpl();
        int atmnumber = 1234;
        int atmpin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome !!!");
        System.out.println("Enter Atm Number : ");
        int atmNumber = in.nextInt();
        System.out.println("Enter Pin : ");
        int pin = in.nextInt();
        if ((atmnumber==atmNumber)&&(atmpin==pin)){
           while (true){
               System.out.println("1.Check Balance\n2.Whithdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exite");
               int ch = in.nextInt();
               if (ch==1){
                   ai.viewBalance();
               }
               else if (ch==2){
                   System.out.println("Enter Amouunt");
                   double withdrawAmount = in.nextDouble();
                   ai.withdrawAmount(withdrawAmount);
               } 
               else if (ch==3) {
                   System.out.println("Deposite Amount :");
                   double depoitAmount = in.nextDouble();
                   ai.depositAmount(depoitAmount);
               }
               else if (ch==4) {
                   ai.viewMinistatement();
               }
               else if (ch==5) {
                   System.out.println("Thank You !! \n Collect Your Atm Card");
                   System.exit(0);
               }
           }
        }
        else {
            System.out.println("Incorect Process");
            System.exit(0);
        }
    }
}
