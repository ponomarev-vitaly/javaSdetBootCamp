package week9;

public class Varargs {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        varargsMethod(a,b);
        varargsMethod(a,b,c);
        varargsMethod(a,b,c,d,e);
    }

    public static void varargsMethod(int... number){
        int sum = 0;
        for (int v: number
             ) {
            sum += v;
        }
        System.out.println(sum);
    }

    public static void varargsMethod(int number1, int number2){
        int sum1 = 0;
        sum1 += (number1 + number2);
        System.out.println(sum1);
    }

    public static void varargsMethod(int number3, int number4, int number5){
        int sum2 = 0;
        sum2 += (number3+number4+number5);
        System.out.println(sum2);
    }

}
