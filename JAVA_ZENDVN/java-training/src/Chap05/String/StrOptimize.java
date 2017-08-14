/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap05.String;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class StrOptimize {
    public static void main(String[] args) {
        optimizeV2();
    }
    
   /*Chuỗi đạt chuẩn dạng 1.
    • Không có khoảng trắng ở đầu và cuối chuỗi
    • Giữa các từ trong chuỗi chỉ tồn tại một khoảng trắng duy nhất
    • Ký tự đầu tiên trong chuỗi phải là ký tự in hoa
    • Các ký tự còn lại phải ở dạng chữ thường
    • Hết câu bằng dấu chấm
    • Các ký tự đầu tiên ở mỗi từ phải viết được viết hoa
    */
    public static void optimizeV2(){
        String str = "   java PrOgraming    languagE   .   ";
        
        str = str.trim();
        System.out.println("Stock:" + str);
        str = str.replaceAll(" +", " ");
        str = str.replaceAll(" .$", ".");
        
        String[] temp = str.split(" ");
        str ="";
        for(String elm: temp){
            String tmpstr = elm.substring(0, 1).toUpperCase() + elm.substring(1).toLowerCase();
            str += tmpstr + " ";
        }
        str.trim();
        System.out.println("Stock:" + str);
    }
    
   /*Chuỗi đạt chuẩn dạng 1.
    • Không có khoảng trắng ở đầu và cuối chuỗi
    • Giữa các từ trong chuỗi chỉ tồn tại một khoảng trắng duy nhất
    • Ký tự đầu tiên trong chuỗi phải là ký tự in hoa
    • Các ký tự còn lại phải ở dạng chữ thường
    • Hết câu bằng dấu chấm
    */
    public static void optimizeV1(){
        String stockStr = "   java PrOgraming    languagE   . ";
        System.out.println("Stock:" + stockStr);
        stockStr = stockStr.trim();
        System.out.println(stockStr);
        stockStr = stockStr.replaceAll(" {2,}", " ");
        System.out.println(stockStr);
        stockStr = stockStr.toLowerCase();
        String a = stockStr.substring(0, 1);
        a = a.toUpperCase();
        String end = stockStr.substring(1);
        stockStr = a + end;
        System.out.println(stockStr);
        
        stockStr = stockStr.replaceAll(" .$", ".");
        System.out.println(stockStr);
    }
}
