import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Collections;
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String tester = "";
        if (text.equals(tester)){
            return true;
        }
        int i = text.length() - 1;
        while (i >= 0){
            //System.out.println(i);
            tester += text.charAt(i);
            if (tester.equals(text)){
                return true;
            }
            i--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
