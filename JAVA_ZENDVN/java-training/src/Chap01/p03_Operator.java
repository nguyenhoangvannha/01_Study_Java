package Chap01;

import org.omg.CORBA.PUBLIC_MEMBER;
public class p03_Operator{
    public static void main(String[] args) {
        soNgauNhien();
    }

    public static void soNgauNhien(){
        //Random from 14 - 19
        //Fomular: int randomNumber = (int)(Math.random() *(MAX - MIN + 1) + MIN);
        int Max = 19;
        int Min = 14;
        for(int i = 14; i <= 19;i++){
            int rNumber = (int)(Math.random()*(Max - Min + 1)) + Min;
            System.out.println(rNumber);
        }

    }
    public static void hamToanHoc(){
        int a = 12;
        int b = 15;
        int max = Math.max(a, b);
        System.out.println("Max = " + max);
        float c = 12.34f;
        Math.ceil(c);
        System.out.println(c);
        System.out.println(Math.ceil(c));
        System.out.println(Math.floor(c));
        System.out.println(Math.round(c));
        //int randomNumber = Math.random();
    }
    public static void soSanh(){
        int a = 1;
        int b = 3;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
    }
    public static void tangGiam(){
        int a = 1;
        int b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a++ = " + (++a));
        System.out.println("b-- = " + (--b));
    }
    public static void congTru(){
        int a = 10;
        int b = 3;
        int s = 0;
        s = a + b;
        System.out.println("Tong: " + s);
        s = a - b;
        System.out.println("Hieu: " + s);
        s = a * b;
        System.out.println("Tich: " + s);
        System.out.println("Thuong: " + ((double) a/b));
    }
    public static void gan(){
        int a = 1;
        int b = 10;
        System.out.println("a = " +  a + "\nb = " + b);
        a += b;
        System.out.println("a += b = " + a);

    }
}