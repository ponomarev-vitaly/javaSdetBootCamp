package week9.ListPractice;

import java.util.LinkedList;

public class Lists {
    private String lName;
    private LinkedList<String> list;

    public Lists(String lName) {
        this.lName = lName;
        this.list = new LinkedList<String>();
    }

    public String getlName(){
        return lName;
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

    public void R(int in){ //String in that code was in the parenthesis in my case.
        list.remove(in);
    }

    public void RF(){
        list.removeFirst();
    } // String in that code was in the parenthesis in my case.

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
        System.out.println("\n\n\n---------------------"+this.lName+"--------------------");
        for (String str: list
             ) {
            System.out.println((counter++)+". "+str);
        }
    }

    public boolean C(String in){
        boolean flag = true;
        if(list.contains(in)) { // Ask the user, remove banana, add banana.
            if(list.indexOf(in)==0){
                System.out.println("The item is in the first place!");
            }
        } else{
            flag = false;
        }
        return flag;
    }

    public boolean ContainsMethod(String in){
        boolean flag1 = true;
        if(list.contains(in)) {

        } else{
            flag1 = false;
        }
        return flag1;
    }

//    public String getlName() {
//        return lName;
//    }
}
