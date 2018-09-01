package niel905g;

import java.util.Scanner;

/**
 * @Author niels on 01-Sep-18.
 */
public class SimpleEncryptAndDecrypt {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your msg: ");
        String msg = input.nextLine();

        String encrypted = "";
        String decrypted = "";
        for (int i = 0; i < msg.length(); i++){
            encrypted += Character.toString((char)(msg.charAt(i)+1));
        }

        for (int i = 0; i < encrypted.length(); i++){
            decrypted += Character.toString((char)(encrypted.charAt(i)-1));
        }
        System.out.println("Message entered: " + msg);
        System.out.println("Message encrypted: " + encrypted);
        System.out.println("Message decrypted: " + decrypted);
    }
}