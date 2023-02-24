package important_questions;
import java.util.*;
import java.util.HashMap;

public class Top_K_Frequent_Words {
    public static void main(String[] args) {
        String[]arr = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k =4;
        HashMap<String, Integer> map = new HashMap<>();
        for(String str :arr){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        System.out.println(map);
       // PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a,b) -> a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()): b.getValue()-a.getValue()
        );

       for(Map.Entry<String ,Integer> entry : map.entrySet()){
           pq.offer(entry);
       }
       ArrayList<String> list = new ArrayList<>();
       while(k>0 && !pq.isEmpty()){
           list.add(pq.poll().getKey());
           k--;

       }
        System.out.println(list);

    }
}
