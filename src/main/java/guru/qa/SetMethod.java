package guru.qa;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class SetMethod {
//    private static Set<String> stringSet;
//
//    public static void addElementInSet(Set<String> stringSet, String nameElement) {
//        stringSet.add(nameElement);
//    }
//
//    public static String getElement(String stringSet, String nameElement) {
//        for (String element:
//                stringSet)
//            if (element.equals(nameElement)) return element;
//        return "No found";
//    }
//
//    public static void removeElement(String stringSet, String nameElement) {
//        stringSet.remove(nameElement);
//    }
//
////    public static void main(String[] args) {
////        // создадим set
////        stringSet = new HashSet<>();
////        // добавим элемент
////        addElementInSet(stringSet, "Sports");
////        addElementInSet(stringSet, "Reading");
////        addElementInSet(stringSet, "Music");
////        System.out.println("Вывод списка: "+stringSet);
////        // найдем элемент
////        System.out.println("Вывод элемента 'Sports': " + getElement(stringSet.toString(), "Sports"));
////        // удалим элемент
////        removeElement(stringSet.toString(), "Reading");
////        System.out.println("Вывод списка без элемента 'Reading': "+stringSet);
//public static void main(String[] args) {
//    // создадим set
//    stringSet = new HashSet<>();
//    // добавим элемент
//    addElementInSet(stringSet, "cat");
//    addElementInSet(stringSet, "dog");
//    System.out.println(stringSet);
//    // найдем элемент
//    System.out.println(getElement(String.valueOf(stringSet), "cat"));
//    // удалим элемент
//    removeElement(String.valueOf(stringSet), "dog");
//    System.out.println(stringSet);
//
//
//    }
//}
//
import java.util.HashSet;
import java.util.Set;

public class SetMethod {
    private static Set<String> stringSet;

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
        stringSet = new HashSet<>();
        // добавим элементы
        addElementInSet(stringSet, "Sports");
        addElementInSet(stringSet, "Reading");
        addElementInSet(stringSet, "Music");
        System.out.println("Вывод списка: "+stringSet);
        // найдем элемент
        System.out.println("Найдем элемент: "+ getElement(stringSet, "Reading"));
        // удалим элемент
        removeElement(stringSet, "Sports");
        System.out.println("Удалим элемент:"+ stringSet);



    }
}
