package guru.qa;
import java.util.HashMap;
import java.util.Map;

public class MapMethod {

    private static Map<String,String> stringMap;

    public static void addElementInMap(Map<String,String> stringMap, String key, String value) {
        stringMap.put(key, value);
    }

    public static void removeElementByKey(Map<String,String> stringMap, String key) {
        stringMap.remove(key);
    }

    public static String getEntry(Map<String,String> stringMap, String key) {
        for (Map.Entry<String, String> entry:
                stringMap.entrySet()) {
            if (entry.getKey().equals(key)) return String.format("%s %s",entry.getKey() ,entry.getValue());
        }
        return "None elements";
    }

    public static void main(String[] args) {
        // создаем map
        stringMap = new HashMap<>();
        // добавляем элементы
        addElementInMap(stringMap, "1", "Sports");
        addElementInMap(stringMap, "2", "Reading");
        addElementInMap(stringMap, "3", "Music");
        System.out.println("Весь список: "+stringMap);
        // получаем пары ключ/значение
        System.out.println("Значение пары ключ/значение 1: "+ getEntry(stringMap, "1"));
        // удалим элемент
        removeElementByKey(stringMap, "2");
        System.out.println("Удалим элемент 2: "+stringMap);

    }
}