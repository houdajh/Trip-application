package util;

import java.util.Scanner;

public class Util {
    public static String enterString(String title){
        System.out.println(title);
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();

    }
    public static String filUserInfo (){
        String nameSurname=enterString("Enter your name,your surname \n");
        String email=enterString("Enter your email");
        String phone=enterString("Enter your phone number");
        return "name:"+nameSurname+"\t"+"email"+email+"\t"+"phone"+phone;
    }

    public static int enterInteger(String title){
        System.out.println(title);
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public static String filTripInfo(){
        String location =enterString("your current location :");
        int passengers=enterInteger("how many passengers will travel?");
        String time=enterString("time:");
        String requires=enterString("Enter Requires :(SMOKING-NO\tPET-YES\tLUGGAGE-NO)");
        return "your destination from "+location+"\t"+"with"+passengers+"\t"+"passengers and with these requires"
                +requires+"\t"+"time"+time;

    }
}
