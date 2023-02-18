package week2;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5){
            if(i!=3) System.out.println(i);
            i++;
            if(i==5)
            break;
        }

        i=1;
        while(true){
            System.out.println("Count # " + (i+1));
            System.out.println("Hello, I am infinite.");
            if(i==10)
                break;
            i++;
        }
    }
}
