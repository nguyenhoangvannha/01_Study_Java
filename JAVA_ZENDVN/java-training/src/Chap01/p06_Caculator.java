package Chap01;

import java.util.Scanner;

public class p06_Caculator{
    public static void main(String[] args) {
        caculator();
    }
    public static void caculator(){
        double num01 = 0, num02 = 0;
        String oper;
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        num01 =  sc.nextDouble();
        sc.nextLine();
        System.out.println("Second number: ");
        num02 =  sc.nextDouble();
        sc.nextLine();
        System.out.println("Operator:");
        oper = sc.nextLine();
        double sum = 0;
        switch(oper)
        {
            case "+": sum = num01 + num02; break;
            case "-": sum = num01 - num02; break;
            case "*":
            case "x": sum = num01 * num02; break;
            case ":":
            case "/": sum = num01/num02; break;
            default: break;
        }
        
    }
}