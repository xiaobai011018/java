package com.bsc.leetcode;

public class Test implements Comparable {
    public static void main(String[] args) {
        System.out.println(compareVersion("10.4.9", "104.9"));
//        String[] split = "011.231".split(".");
//        for (String s : split) {
//            System.out.println(s);
//        }
        //System.out.println(compareVersion("00.1", "1.01"));
    }
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int length1 = v1.length;
        int length2 = v2.length;
        if(length1!=length2){
            if (length1>length2){
                for (int i= 0; i < length2; i++) {
                    if(compare1(v1[i],v2[i])>0){
                        return 1;
                    }else if (compare1(v1[i],v2[i])<0){
                        return -1;
                    }
                }

                for (int i = length2; i < length1; i++) {
                    int i1 = Integer.parseInt(v1[i]);
                    if (i1!=0){
                        return 1;
                    }
                }
                return 0;
            }else {
                for (int i= 0; i < length1; i++) {
                    if(compare1(v1[i],v2[i])>0){
                        return 1;
                    }else if (compare1(v1[i],v2[i])<0){
                        return -1;
                    }
                }
                for (int i = length1; i < length2; i++) {
                    int i1 = Integer.parseInt(v2[i]);
                    if (i1!=0){
                        return -1;
                    }
                }
            }
        }
        for(int i = 0;i<v1.length;i++){
            if(compare1(v1[i],v2[i])>0){
                return 1;
            }else if (compare1(v1[i],v2[i])<0){
                return -1;
            }
        }
        return 0;
    }
    private static int compare1(String v1,String v2) {
        int s1 = Integer.parseInt(v1);
        int s2 = Integer.parseInt(v2);
        return s1-s2;
    }
//    public String name="abc";
//    public static void main(String[] args){
//        int i = Integer.parseInt("001");
//        System.out.println(i);
//        Object o=new Object(){
//            public boolean equals(Object obj){
//                return true;
//            }
//        };
//        System.out.println(o.equals("Fred"));
//    }
//    public static void main1(String[] args){
//        Test test=new Test();
//        Test testB=new Test();
//        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
//    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
