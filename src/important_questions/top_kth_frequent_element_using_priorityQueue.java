package important_questions;
import  java.util.*;
public class top_kth_frequent_element_using_priorityQueue {
    public static void main(String[] args) {
        int[]arr = {1,3,2,4,2,1,7,8,8,8,4,7,4,8,4};
        int k=3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer element :arr){
            map.put(element, map.getOrDefault(element, 0)+1);
        }
        System.out.println(map);
        PriorityQueue<Map.Entry<Integer, Integer> >pq = new PriorityQueue<>(
                (a,b) ->a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue()
        );
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(entry);
        }
        ArrayList<Integer>list = new ArrayList<>();
        while (k>0 && !pq.isEmpty()){
            list.add(pq.poll().getKey());
            k--;
        }
        System.out.println(list);
    }
}
