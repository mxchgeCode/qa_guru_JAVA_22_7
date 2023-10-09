package guru.qa;

import java.util.Locale;

public class ForArray {
    public static void main(String[] args) {

        String[] hobbyArray = new String[4];
        hobbyArray[0] = "Sports";
        hobbyArray[1] = "Reading";
        hobbyArray[2] = "Music";
        hobbyArray[3] = "Dancing";

        System.out.println("Lets print it in UpperCase:");
        for (int i = 0; i < hobbyArray.length; i++) {
            hobbyArray[i] = hobbyArray[i].toUpperCase(Locale.ROOT);
            System.out.println(hobbyArray[i]);
        }
    }
}
