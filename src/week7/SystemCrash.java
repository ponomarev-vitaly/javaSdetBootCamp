package week7;

public class SystemCrash {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i--){
            System.out.println(i);
            if(i == -5) i=4;
        }
    }
}
