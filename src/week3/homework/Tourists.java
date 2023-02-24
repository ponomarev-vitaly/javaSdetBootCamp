package week3.homework;

import week3.AccountInfo;

import javax.sound.midi.Soundbank;

public class Tourists {

    public static void main(String[] args) {
        // Create an object.
        AccountInfo accountInfo = new AccountInfo();
        // Call the methods.
        accountInfo.getInfo();
        System.out.println("Please enter the information about the tourist and tourist package: ");
        accountInfo.printInfo();
        System.out.println("We've got the information in our base considering your inquiry: ");


    }
}
