package main;

import java.util.LinkedList;

public class Cities {
    LinkedList<String> list=new LinkedList<>();

    public Cities() {
    }
    public LinkedList<String> getList(){
        list.add("NADOR");
        list.add("OUJDA");
        list.add("ARUIT");
        list.add("AGADIR");
        list.add("HOCIMA");
        list.add("BERKANE");
        list.add("FES");
        list.add("RABAT");
        list.add("TANGER");
        list.add("SALE");
        return list;
    }
}
