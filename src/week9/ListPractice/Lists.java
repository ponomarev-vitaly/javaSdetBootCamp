package week9.ListPractice;

import java.util.LinkedList;

public class Lists {
    private String lName;
    private LinkedList<String> list;

    public Lists(String lName) {
        this.lName = lName;
        this.list = new LinkedList<String>();
    }

    public void A(String in){
        list.add(in);
    }

    public void AF(String in){
        list.addFirst(in);
    }

    public void AL(String in){
        list.addLast(in);
    }

    public void R(String in){
        list.remove(in);
    }

    public void RF(String in){
        list.removeFirst();
    }

    public void RL(String in){
        list.removeLast();
    }

    public int S() {return list.size();}

    public void SW(int F, int N){
        String temp = list.get(F);
        list.set(F, list.get(N));
        list.set(N, temp);
    }

    public void D(){
        int counter = 1;
        System.out.println("---------------------"+this.lName+"--------------------");
        for (String str: list
             ) {
            System.out.println((counter++)+". "+str);
        }
    }

    public String getlName() {
        return lName;
    }
}
