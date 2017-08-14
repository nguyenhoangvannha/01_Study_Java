package Chap01;


public class p02_Variable {
    public static void main(String args[]){
       
        doiKieuDuLieu();
    }
    public static void bienVaHangSo(){
        int age = 0;
        final double PI = 3.14;
        System.out.println("Pi = " + PI);
        System.out.println(age);
    }
    public static void kieuDuLieu(){
        int a = 132,b = 123;
        float f = 1.23f;
        boolean bo = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(bo);
    }
    public static void doiKieuDuLieu(){
        int i = 12;
        double d  = 1.4;
        double s = i + d;
        System.out.println(s); 
    }
}
