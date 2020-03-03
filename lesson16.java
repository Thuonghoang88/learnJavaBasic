/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Đề bài: Nhập một chuỗi ký tự. Liệt kê số lần xuất hiện của các từ trong chuỗi đó
 */
public class lesson16 {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    /*
    * Đếm số từ của 1 chuỗi
    * 
    */
    public static void show(){
        String str =" hoc java           co ban den         nang cao " +
                "\n       hoc  C++ co ban den nang cao";
        System.out.println(str);
        HashMap<String, Integer> mapStr = countWord(str);
        for(String key : mapStr.keySet()){
            System.out.print("\n" + key + " " + mapStr.get(key));
        }
    }
    public static HashMap<String, Integer> countWord(String str){
      
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        
        if(str == null){
            return wordMap;
        }
        int size = str.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i < size ; i ++){
            if((str.charAt(i)!=  SPACE && str.charAt(i) != TAB && str.charAt(i) != BREAK_LINE) ){
                    sb.append(str.charAt(i));
                    
            }else{
                addWord(wordMap,sb);
                sb = new StringBuilder();
            }
        }
        addWord(wordMap,sb);
        return wordMap;
    }
    /*
    * Them tu vao 1 mang Map<String, Integer>
    */
    public static void addWord(HashMap<String,Integer> wordMap, StringBuilder sb){
        String word = sb.toString();
        int count =0;
        if(word.length() == 0){
            return;
        }
        if (wordMap.containsKey(word)){
            count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        }else {
            wordMap.put(word, 1);
        }
    }
    
    
}
