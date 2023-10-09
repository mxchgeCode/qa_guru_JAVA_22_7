package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {

    public static void addElementInSet(Set<String> stringSet, String nameElement) {
        stringSet.add(nameElement);
    }

    public static String getElement(Set<String> stringSet, String nameElement) {
        for (String element:
                stringSet) {
            if (element.equals(nameElement)) return element;
        }
        return "No found";
    }

    public static void removeElement(Set<String> stringSet, String nameElement) {
        stringSet.remove(nameElement);
    }

    public static void main(String[] args) {
        // создадим set
        Set<String> stringSet = new HashSet<>();
        // добавим элементы
        addElementInSet(stringSet, "Sports");
        addElementInSet(stringSet, "Reading");
        addElementInSet(stringSet, "Music");
        System.out.println("Вывод списка: "+ stringSet);
        // найдем элемент
        System.out.println("Найдем элемент: "+ getElement(stringSet, "Reading"));
        // удалим элемент
        removeElement(stringSet, "Sports");
        System.out.println("Удалим элемент:"+ stringSet);
    }
}
