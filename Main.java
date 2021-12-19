package 比赛;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int nums = Integer.parseInt(str.split(" ")[0]);
        int k = Integer.parseInt(str.split(" ")[1]);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0;i<k;i++){
            lists.add(new ArrayList<>());
        }
        for (int i = 0;i<nums;i++){
            String data = sc.nextLine();
            String[] strs = data.split(" ");
            int num = Integer.parseInt(strs[0]);
            if (num==1){
                int length = strs.length;
                for (int j = 2;j<length-1;j += 2){
                    int index = Integer.parseInt(strs[j]);
                    int val = Integer.parseInt(strs[j+1]);
                    lists.get(index).add(val);
                }
            }else {
                int ans = 0;
                for (int value:lists.get(Integer.parseInt(strs[1]))){
                    if (value>=Integer.parseInt(strs[2])&&value<=Integer.parseInt(strs[3])){
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
