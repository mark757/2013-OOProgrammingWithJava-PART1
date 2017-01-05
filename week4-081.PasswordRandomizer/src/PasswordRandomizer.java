import java.util.Random;

public class PasswordRandomizer {
    // Define the variables here
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // Write the code here which returns the new password
        String characters = "abcdefghijklmnopqrstuvwxyz"; //list of characters string

        String password = ""; //intitliaze empty password

        int numberOfCharacters = this.length; //set numberOfCharacters to the size of given length

        while (numberOfCharacters > 0){ //while the size of the length (numberOfCharacters is larger than 0
            int setChars = this.random.nextInt(characters.length()); //set the int rand to a random character using the length
            char readChar = characters.charAt(setChars); //set a char c to a random charracter at random rand
            password += readChar; //add character c to string
            numberOfCharacters--; //deincrement
        }
        return password;
    }
}
