import java.util.*;
public class Main {

    public static void main(String[] args) {
        // create random object
        Random num1 = new Random();
        Random num2 = new Random();

  //test
//int Number1=2;
//int Number2=2;
        // generating integer
        int Number1 = 1 + num1.nextInt(6);
       int Number2 = 1 + num2.nextInt(6);

        int num3 = Number1 + Number2;

        // Printing the random Number
        if (Number1 != Number2) {
            System.out.println("User Rolls : " + Number1 + " &" + Number2);
            System.out.println("Move up  : " + num3 + " " + "Spaces and stop");
        } else  {
            System.out.println("User Rolls :" + Number1 + "& " + Number2);
            System.out.println("DOUBLES!" + "\nMove " + num3 + " "+ " Spaces and roll again getting ...");
            while (Number1 == Number2) {
                Number1 = 1 + num1.nextInt(6);
                Number2 = 1 + num2.nextInt(6);
                // Number1= 1 + num1.nextInt(6);
                //Number2 = 1 + num2.nextInt(6);
                int num4 = Number1 + Number2;

               //second number
                if (Number1 != Number2) {
                    System.out.println("User Rolls : " + Number1 + "& " + Number2);
                    System.out.println("Move up  : " + num4 + " " + "Spaces and stop");

                }
                else if (Number1== Number2) {
                    System.out.println("User Rolls :" + Number1 + "& "+ Number2);
                    System.out.println("DOUBLES!" + "\nMove " + num4 + " Spaces and roll again getting ...");

              //Number3
                    while (Number1 == Number2) {
                        Number1 = 1 + num1.nextInt(6);
                        Number2 = 1 + num2.nextInt(6);
                        if(Number1==Number2){
                            System.out.println("User Rolls :" +  Number1 + " & " + Number2);
                            System.out.println("GO TO JAIL");
                        break;
              }
                    break;}
                break;}


           }/*
            }
            //else{
            //  return;("DOUBLES!" + "Move " + num3 + "Spaces and roll again getting ...");
*/
        }}}