public class Solution {
    public static void main(String[] args) {
        System.out.println(Math.ceil(4.2));
    }
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pig = 0;
        int state = minutesToTest/minutesToDie+1;
        while(Math.pow(state,pig)<buckets){
            pig++;
        }
        return pig;
    }
}
