package week2;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the T-shirt size (29, 42, 44, 48): ");
        int size = scan.nextInt();
        String sizeWord ="small";

        switch (size){
            case 29 :
                sizeWord = "small";
                break;
            case 42 :
                sizeWord = "medium";
                break;
            case 44:
                sizeWord = "large";
                break;
            case 48:
                sizeWord = "ExtraLarge";
                break;
            default:
                sizeWord = "Unknown";
                break;

        }
        System.out.println("T-shirt size is: " + sizeWord);
    }
}
