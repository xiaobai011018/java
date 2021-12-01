import java.util.HashMap;

public class Solution {
    public int maxPower(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans = 0;
        for (Character ch:map.keySet()){
            ans = Math.max(ans,map.get(ch));
        }
        return ans;
    }
}
