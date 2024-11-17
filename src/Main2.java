import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        Map<String, Person> map = new HashMap<>();
        Map<Person, String> map2 = new HashMap<>();
        // объект key обязан иметь hashCode & equals !!!!


        map.put("jack", new Person("Jack", 10));
        map.put("lena", new Person("lena", 12));
        map.put("mike", new Person("mike", 10));
        map.put("nick", new Person("nick", 9));
        map.put("ira", new Person("ira", 13));

        System.out.println(map);

        //for (Map.Entry<String,Person> entry : map.entrySet())

        for(var entry: map.entrySet()){
            System.out.println("Имя: " + entry.getKey());
            System.out.println("Person: " + entry.getValue());
            System.out.println();
        }







    }
}
