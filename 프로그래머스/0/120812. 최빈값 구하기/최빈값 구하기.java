import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();

        for(int i: array){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                int count = map.get(i);
                map.put(i,++count);
            }
        }
         List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        for(int key:keySet){
            System.out.println(key);
        }

        if(keySet.size()==1){
            return keySet.get(0);
        }
        else if(map.get(keySet.get(0)) == map.get(keySet.get(1))){
            return -1;
        }
        
            return keySet.get(0);
        
        
    }
}