/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap09.adv;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class PatternAndMatcher {
    public static void main(String[] args) {
        main008();
    }
    public static void main008(){
        String input  = "java=20;php=140;android=90";
        Map<String, Integer> mapObj = new HashMap();
        
        Pattern pattern = Pattern.compile("(?<name>.+?)=(?<price>\\d+);*");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            mapObj.put(matcher.group("name"), Integer.parseInt(matcher.group("price")));
            System.out.println(matcher.group("name") + "\t" + matcher.group("price"));
        }
        mapObj.get("android");
    }
    
    public static void main007() {
        String inputOne = "Name 01 > Name 02 > Name 03 > Name 04";
        
        Pattern pattern = Pattern.compile("(?<name>.*?)>");
        Matcher matcher = pattern.matcher(inputOne);
        System.out.println(matcher.groupCount());
        while(matcher.find()){
            System.out.println(matcher.group("name"));
        }
    }
    
    //find group id
    public static void main006() {
        String inputOne = "abc-12453";
        
        Pattern pattern = Pattern.compile("[A-z]{3}-(?<id>\\d+)");
        Matcher matcher = pattern.matcher(inputOne);
        System.out.println(matcher.groupCount());
        while(matcher.find()){
            System.out.println(matcher.group("id"));
        }
    }
    //find  
    public static void main005() {
        String inputOne = "hello---window------mathc";
        
        Pattern pattern = Pattern.compile("-+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputOne);
        while(matcher.find()){
            matcher.start();
            matcher.end();
            matcher.group();
        }
    }
    //lookingAt
    public static void main004() {
        String inputOne = "hello_w";
        
        Pattern pattern = Pattern.compile("hell", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputOne);
        
        if(matcher.lookingAt()){
            System.out.println("Du lieu hop le");
        }
    }
    
    //replaceAll
    public static void main003() {
        String inputOne = "hello_w";
        
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(inputOne);
        matcher.replaceAll("\t");
    }
    
    //ignore case 
    public static void main002() {
        String inputOne = "hello_w";
        
        Pattern pattern = Pattern.compile("[A-z_]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputOne);
        
        String inputTwo = "fick03";
        matcher.reset(inputTwo);
        if(matcher.matches()){
            System.out.println("Du lieu hop le");
        }
    }
    
    
    
    //normal regex
    public static void main001(){
        String input = "hello_w";
        
        Pattern pattern = Pattern.compile("[A-z_]");
        Matcher matcher = pattern.matcher(input);
    }
}
