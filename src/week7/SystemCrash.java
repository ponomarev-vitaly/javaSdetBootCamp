package week7;

public class SystemCrash {
    public static void main(String[] args) {
        // This is the example of System Crash Error.
        for(int i = 0; i < 3; i--){
            System.out.println(i);
        // We added if statement to solve this infinite loop.
            if(i == -5) i=4;
        }
    }
}
