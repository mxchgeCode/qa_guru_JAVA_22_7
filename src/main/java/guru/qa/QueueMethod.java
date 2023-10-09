package guru.qa;
import java.util.PriorityQueue;

public class QueueMethod {
    public static void main(String[] args) {
        PriorityQueue<String> hobby;
        hobby = new PriorityQueue<>();

        hobby.add("Sports");
        hobby.add("Reading");
        hobby.add("Music");

        System.out.println("Весь список: ");
        for (String i : hobby){
            System.out.println(i);

        }
        System.out.println();

        hobby.remove();
        System.out.println("Удалим первый элемент:");
        for (String i : hobby){
            System.out.println(i);
        }
        System.out.println();

        hobby.offer("Dancing");
        System.out.println("Добавили Dancing:");
        for (String i : hobby){
            System.out.println(i);
        }
    }
}