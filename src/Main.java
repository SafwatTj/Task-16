import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        /*  key   ,  value */

        map.put("jack", 30);
        map.put("john", 23);
        map.put("georg", 31);
        map.put("lena", 31);
        map.put("nata", 26);

        System.out.println(map);

        System.out.println("map.get(\"john\")  :" + map.get("john"));

        map.put("jack",60);
        System.out.println(map);

        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        Collection<Integer> values = map.values();
        System.out.println(values);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);

        // 1)
        for ( String key : map.keySet()){
            System.out.println("key = '" + key + "' value = "+ map.get(key));
        }
        // 2) лучше, т.к. не бегает по map, а получает сразу entry
        System.out.println("___________________________");
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key="+entry.getKey() + " value: " + entry.getValue());
        }


        Map< String, List<Person> > map1 = new HashMap<>();
        Set<Map.Entry<String, List<Person>>>  entries1 = map1.entrySet();

        var s = "qwe"; // s - String
        var i = 10; // i - int
        var p1 = new Person("Jack",10);  // p1 - Person

        for(var entry: entries1){

        }

    }
}