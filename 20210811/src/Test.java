public class Test {
    public static void main(String[] args) {
        String s1 = "a" + new String("b");
        s1.intern();
        String s2 = "ab";
        System.out.println(s1==s2);
    }
}
