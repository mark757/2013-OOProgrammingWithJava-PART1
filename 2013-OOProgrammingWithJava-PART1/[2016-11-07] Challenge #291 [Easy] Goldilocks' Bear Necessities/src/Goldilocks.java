/**
 * Created by Mark on 11/11/2016.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

public class Goldilocks {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        System.out.println(reader);

    }
}
