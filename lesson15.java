/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

import java.util.Scanner;

/**
* Đề bài: [Bài tập Java - Đếm số từ trong một chuỗi] Nhập một chuỗi ký tự. 
* Đếm số từ trong một chuỗi đó (mỗi từ cách nhau bởi một khoảng trắng có thể là một hoặc nhiều dấu cách,
* tab, xuống dòng). Ví dụ ” hoc java co ban den nang cao ” có 7 từ.
 */
public class lesson15 {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static void Show(){
        System.out.print("Input String: ");
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        String str1 = "hoc java     co ban den nang cao" + "      \n test";
        System.out.print("total words of : " + str + " = " + countWords(str1));
        
    }
   public static int countWords(String str){
       if(str == null){
           return 0;
       }
       int count = 0;
       int size = str.length();
       boolean isCount = true;
       boolean notCounted = true;
       for(int i=0; i < size ; i ++){
           if(str.charAt(i)!= SPACE && str.charAt(i) != TAB && str.charAt(i) != BREAK_LINE){
                if(isCount){
                   count ++;
                   isCount= false;
                }
               
           }else{
                 isCount = true;
               
           }
       }
       return count;
   } 
}
