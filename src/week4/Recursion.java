package week4;

public class Recursion {
    public static void main(String[] args) {

    }
    static int factorial(int n){
        if(n!=0) // termination condition
            return n * factorial(n-1);
        else return 1;
    }
}
