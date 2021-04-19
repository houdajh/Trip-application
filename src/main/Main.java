package main;

import servicesUtil.Services;
import util.Util;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("welcome to bla-blaCar Application\n\t your ride and your choice");
        String nationality = Util.enterString("please tell us are foreign or native?");
        Scanner sc = new Scanner(System.in);
        String services ="1:Find Ride\n"+
        "2:offer Ride\n"+
        "3:About Us\n"+
                "0:Quit";
        while (true) {
            String information = " ";
            if (nationality.equalsIgnoreCase("foreign")) {
                information = Util.enterString("enter your passport id: ");
                System.out.println("checking passport id for:" + information );
                Thread.sleep(2000);
                System.out.println("process completed successfully");

            } else if (nationality.equalsIgnoreCase("native")) {

            } else {
                System.out.println("invalid operation");
                continue;
            }

            System.out.println(services);
            int menu = sc.nextInt();
            if (menu == 1) {
                Services.menu1();
                break;
            } else if (menu == 2) {
                Services.menu2();
                break;

            } else if (menu == 3) {
                Services.menu3();
                break;
            } else if (menu == 0) {
                System.out.println("Exiting from system");
                break;
            }
        }
    }
}
