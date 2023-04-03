package week8.homework.Interface;

import java.util.Scanner;

public class TryCatches {
    static Scanner scan = new Scanner(System.in);

    public int enteringNumbers(int number) {
        boolean flag = true;
        boolean flag2 = false;
        do {
            number = 0;
            try {
                if (flag2 == true) {        // Dummy1 çalışmadan exception verdigi için sürekli satır atlıyordu. bu yüzden ilk seferde çalışmayan sonrasında çalışan bir dummy yaptım.
                    scan.nextLine();     // Dummy 2
                }
                flag2 = true;
                number = scan.nextInt();
                scan.nextLine();        //Dummy 1
                flag = false;
                flag2 = false;
            } catch (Exception e) {
                System.out.println("Please reenter the data.");
            }
        } while (flag);
        return number;
    }

    public String enteringStrings(String str) {
        boolean flag = true;
        do {
            str = "";
            try {
                str = scan.next();
                scan.nextLine();        // Dummy1
                flag = false;
            } catch (Exception e) {
                System.out.println("Please reenter the data.");
            }
        } while (flag);
        return str;
    }
}
