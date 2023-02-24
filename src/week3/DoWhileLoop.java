package week3;

public class DoWhileLoop {
    /*
    while (condition){ condition = true or false
        // statement
    }

    do{ The code is going to be executed although the condition is true or false in the first time.
        // statement
        //
        //
    }while (condition); If the condition is true and do while loop will continue to execute.
     */

    public static void main(String[] args) {
        // if x < 10 add the x value to total variable. the initial value of the x = 4.
        int x = 4;
        int total = 0;
        while(x<10){
            total = x + total; // total += x
            x++;
        }
        System.out.println("Total number: " + total);
    }
}
