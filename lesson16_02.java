/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.HashMap;

/**
 * Đề bài: Nhập một chuỗi ký tự. Liệt kê số lần xuất hiện của các từ trong chuỗi đó
 */
public class lesson16_02 {
     public static final char SPACE =' ';
     public static final char BREAK_LINE = '\n';
     public static final char TAB = '\t';
     public static void show(){
        String str = "tu hoc lap trinh java tu       co ban den nang cao " +
                 "          \n tu hoc C++ co ban den nang cao";
        HashMap<String, Integer> mapWord =  countWord( str);
        System.out.println(str);
        for(String key : mapWord.keySet()){
            System.out.println(key +": " + mapWord.get(key));
        }
        
     }
     public static HashMap<String, Integer> countWord(String str){
         HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
         if(str.length() ==0 ){
             return hashMap;
         }
         else{
             int size = str.length();
             StringBuilder strBuilder = new StringBuilder();
             for(int i=0; i< size; i++){
                 if(str.charAt(i) != SPACE && str.charAt(i)!= BREAK_LINE && str.charAt(i) != TAB){
                     strBuilder.append(str.charAt(i));
                 }else{
                     addWord(hashMap,strBuilder);
                     strBuilder = new StringBuilder();
                 }
             }
            addWord(hashMap,strBuilder);
            return hashMap;
         }
     }
    
    public static void addWord(HashMap<String,Integer> hm, StringBuilder sb){
        String word = sb.toString();
        if(word.length() == 0){
            return;
        }else if(hm.containsKey(word)){
            hm.put(word,hm.get(word) +1);
        }else{
            hm.put(word,1);
        }
    }
}
