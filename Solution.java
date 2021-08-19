package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}
public class Solution {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
    }
    public int getImportance(List<Employee> employees, int id) {
        int count = 0;
        HashMap<Integer, Employee> map = new HashMap<>();
        for (Employee em : employees) {
            map.put(em.id, em);
        }
        return getCount(map,id);
    }
    public int getCount(Map<Integer,Employee> map,int id){
        Employee employee = map.get(id);
        int count = employee.importance;
        for (Integer subordinate : employee.subordinates) {
            count += getCount(map,subordinate);
        }
        return count;
    }
}
