package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    private static List<String> strList;

    public static String getElement(List<String> strList, String nameElement) {
        for (String element:
                strList) {
            if (element.equals(nameElement)) return element;
        }
        return "No found";
    }

    public static void addElement(List<String> strList, String nameElement) {
        strList.add(nameElement);
    }

    public static void removeElement(List<String> strList, String nameElement) {
        strList.remove(nameElement);
    }
    public static void main(String[] args) {
        // создадим список
        strList = new ArrayList<>();
        // добавим элементы
        addElement(strList, "Sports");
        addElement(strList, "Reading");
        addElement(strList, "Music");
        // проверим, что добавлены
        System.out.println("Весь список: "+strList);
        // найдем элемент
        System.out.println("Найдем элемент: "+getElement(strList, "Reading"));
        // удалим элемент
        removeElement(strList, "Music");
        System.out.println("Удалим элемент:"+strList);

    }
}