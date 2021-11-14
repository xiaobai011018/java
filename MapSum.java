package com.bsc.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapSum {

    HashMap<String,Integer> map;
    public MapSum() {
        this.map = new HashMap<>();
    }
    public void insert(String key, int val) {
        map.put(key,val);
    }
    public int sum(String prefix) {
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        int ans = 0;
        next:while (iterator.hasNext()){
            String str = iterator.next();
            if (prefix.length()>str.length()){
                continue next;
            }
            String substring = str.substring(0, prefix.length());
            if (substring.equals(prefix)){
                ans += map.get(str);
            }
        }
        return ans;
    }
}
