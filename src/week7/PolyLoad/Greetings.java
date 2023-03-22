package week7.PolyLoad;

public class Greetings {
    public void greet(){
        System.out.println("Hello!");
    }

    public void greet(String fName){
        System.out.println("Hello " + fName);
    }

    public void greet(String fName, String lName){
        System.out.println("Hello " + fName + " " + lName);
    }

    public void greet(String fName, String lName, int hour){
        if(hour < 7){
            System.out.println("It is late " + fName + " " + lName);
        } else if (hour < 12){
            System.out.println("Good morning " + fName + " " + lName);
        } else if (hour < 18){
            System.out.println("Good afternoon " + fName + " " + lName);
        } else {
            System.out.println("Good night " + fName + " " + lName);
        }
    }

    public void greet(String fName, String lName, boolean gender){
        if(gender){
            System.out.println("Hello Mrs. " + fName + " " + lName);
        }else{
            System.out.println("Hello Mr. " + fName + " " + lName);
        }
    }
}
