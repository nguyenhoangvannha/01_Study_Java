package Chap01;

public class p04_IfElse{
    public static void main(String[] args) {
        bangCuuChuong();
    }
    public static void bangCuuChuong(){
        for(int i = 1; i <= 10; i++){
            for(int j = 2; j <= 9; j++){
                System.out.print("\t|" + j + " * " + i + " = " + (j*i) + " |");
            }
            System.out.println();
        }
    }

}