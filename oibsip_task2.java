import java.util.*;
public class oibsip_task2{
    public static void main(String[] args ){
Scanner sc = new Scanner(System.in);
        int rndnum = (int)(Math.random()*100);
        int userNum = 0;

        do{
            System.out.println("Guess the number : ");
            userNum = sc.nextInt();
            if (userNum > rndnum) {
                System.out.println("THE NUMBER IS SMALL");
            }

            else if(userNum == rndnum){
                System.out.println("CONGOOO!!....YOU ARE CORRECT!");
                break;
            }

            else{
                System.out.println("THE NUMBER IS LARGE");
            }
        }while(userNum >= 0);

        System.out.print("The number is : ");
        System.out.println(rndnum);
        sc.close();
     }
     
}