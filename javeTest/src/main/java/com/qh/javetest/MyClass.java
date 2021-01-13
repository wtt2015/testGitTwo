package com.qh.javetest;

public class MyClass {

    public static void main(String [] args){
//        System.out.println("I am Xiao Qinwen");
//        testAdd();
        test99();
    }

    private static void testAdd(){
        int a = 1;
        int b = 5;
        int c = a+b;
        System.out.println(a+"+"+b+"= "+c);
    }
    
    private static void test99(){
        for (int i = 9; i >=1; i--) {
            for(int j = i; j <=9; j++){
                System.out.print(i + "*" + j + "=" + j * i + "\t");
            }
            System.out.println("");
        }
    }
    

}