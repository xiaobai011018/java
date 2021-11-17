public class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int ans = 0;
        for(int i = 0;i<n;i++){
            String str1 = words[i];
            for(int j = i+1;j<n;j++){
                String str2 = words[j];
                if (!isSamWord(str1,str2)){
                    ans = Math.max(str1.length()*str2.length(),ans);
                }
            }
        }
        return ans;
    }

    private boolean isSamWord1(String str1, String str2) {
        int[] count = new int[26];
        for(char ch:str1.toCharArray()){
            count[ch-'a'] = 1;
        }
        for(char ch : str2.toCharArray()){
            if (count[ch-'a']==1) return true;
        }
        return false;
    }
    private boolean isSamWord(String str1, String str2) {
        int bitMask1 = 0;
        int bitMask2 = 0;
        for(char ch:str1.toCharArray()){
            bitMask1 |= 1<<(ch-'a');
        }
        for(char ch : str2.toCharArray()){
            bitMask2 |= 1<<(ch-'a');
        }
        return (bitMask1&bitMask2)!=0;
    }
}
