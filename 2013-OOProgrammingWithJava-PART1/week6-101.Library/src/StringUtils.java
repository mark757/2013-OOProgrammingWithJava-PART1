/**
 * Created by Mark on 12/11/2016.
 */
public class StringUtils {

    public static boolean included(String word, String searched) {

        if (word.toUpperCase().contains(searched.toUpperCase()) || word.toUpperCase().trim().contains(searched.toUpperCase().trim())) {
            return true;
        } else {
            return false;
        }

    }

}
