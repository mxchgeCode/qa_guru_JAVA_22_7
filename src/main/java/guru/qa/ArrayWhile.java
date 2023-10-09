package guru.qa;

public class ArrayWhile {
    public static void main(String[] args) {

        String[] hobbyArray = new String[]{"Sports", "Reading", "Music", "Dancing"};
        int index = 0;
        while (index < hobbyArray.length) {
            System.out.println(hobbyArray[index]);
            index++;
        }
    }
}
