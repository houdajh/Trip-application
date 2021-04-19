package servicesUtil;

import main.Cities;
import util.Util;

import java.util.LinkedList;

public class Services {
    public static void menu1(){
        System.out.println(Util.filUserInfo());
        System.out.println("welcome....");
        String city= Util.enterString("where do you want to go ?");
        System.out.println("checking destination for "+city.toUpperCase());
        Cities cities=new Cities();
        LinkedList<String> list=cities.getList();
        if (list.contains(city.toUpperCase())){
            System.out.println("there are available trips for "+city.toUpperCase()+"...");
            System.out.println(Util.filTripInfo());

        }
        else {
            System.out.println("there are no available trips\t here are the active trips");
            Cities cities1=new Cities();
            LinkedList<String> list1 = cities1.getList();
            for (String s:list1){
                System.out.println(s);

            }
        }
    }
    public static void menu2() {
        System.out.println(Util.filUserInfo());
        String carType=Util.enterString("please enter your car type");
        String placeTo=Util.enterString("where do you ride?");
        String placeFrom=Util.enterString("your current location:");
        int capacity=Util.enterInteger("how many passengers you can carry?");
        String requires=Util.enterString("enter requires::(SMOKING-NO\tPET-YES\tLUGGAGE-NO)");
        System.out.println("car type:"+carType+"\tfrom"+placeFrom+"\t to"+placeTo+"\t capacity:"+capacity+"\tRequires:"+requires);
    }
    public static void menu3(){
        System.out.println("BlaBlaCar is a French online marketplace for carpooling.\n" +
                " Its website and mobile apps connect drivers and passengers willing to travel together " +
                "between cities and share the cost of the journey.\n" +
                "The platform had 70 million users in 2019 and is available in 22 countries." +
                " \nAlmost all of which are in Europe and Latin America – countries include:\n " +
                "Belgium, Brazil, Croatia," +
                " Czech Republic, France, Germany, Hungary, India, Italy, Luxembourg, Mexico, \nThe Netherlands, " +
                "Poland, Portugal, Romania, Russia, Serbia, Slovakia, Spain, Turkey, Ukraine, " +
                "and the United Kingdom.");
    }
}
