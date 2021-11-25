import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        buddyStrings("ab","ba");
    }
    public static boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        int sum = 0;
        if (m!=n) return false;
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0;i<n;i++){
            int a = s.charAt(i)-'a';
            int b = goal.charAt(i)-'a';
            cnt1[a]++;
            cnt2[b]++;
            if (a!=b){
                sum++;
            }
        }
        boolean ok = false;
        for (int i = 0;i<26;i++){
            if (cnt1[i]!=cnt2[i]) return false;
            if (cnt1[i]>1){
                ok = true;
            }
        }
        return sum==2||(sum==0&&ok);
    }
}
