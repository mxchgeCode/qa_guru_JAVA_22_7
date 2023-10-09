package guru.qa;

public class DoWhile {
    public static void main(String[] args) {
        String[] hobbyArray = new String[4];
        hobbyArray[0] = "Sports";
        hobbyArray[1] = "Reading";
        hobbyArray[2] = "Music";
        hobbyArray[3] = "Dancing";

        int index2 = 0;
        System.out.println("Весь список:");
        do {
            System.out.println(hobbyArray[index2]);
            index2++;
        }
        while (index2 < hobbyArray.length);
    }
}
