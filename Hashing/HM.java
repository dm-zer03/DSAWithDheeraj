
import java.util.*;

public class HM {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
        /*  int population = hm.get("China");
        System.out.println("Population:" + population);

        System.out.println(hm.get("USA"));

        System.out.println(hm.containsKey("USA"));
        System.out.println(hm.containsValue(150));
        int removeKey = hm.remove("US");
        System.out.println("RemoveKey:" + removeKey);
        System.out.println(hm);

        System.out.println("Size:" + hm.size());

        hm.clear();
        System.out.println(hm.isEmpty());
         */
        //Iteration on HashMap O(1)
        Set<String> Keys = hm.keySet();
        System.out.println(Keys);

        for (String k : Keys) {
            System.out.println("Key=" + k + ",Value=" + hm.get(k));
        }

        Set<Map.Entry<String, Integer>> Key = hm.entrySet();  // Corrected type
        System.out.println(Key);

        for (Map.Entry<String, Integer> k : Key) {  // Corrected iteration type
            System.out.println("Key=" + k.getKey() + ", Value=" + k.getValue());
        }

    }
}
