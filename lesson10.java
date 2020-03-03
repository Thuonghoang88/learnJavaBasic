/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

/**
 * viết chương trình liệt kê tất cả số nguyên tố có 5 chữ số trong java.
 */
public class lesson10 {
    public static void showNumberHasFiveNuber(){
        System.out.println("list of number has five number: ");
        int count =0;
        for(int i = 10001; i<= 99999; i +=2){
            if(isPrimeNumber(i) && i< 99999){
                System.out.print(i+",");
                if(count == 9){
                    System.out.print("\n");
                    count = 0 ;
                }else{
                    count ++;
                }
            }else if(isPrimeNumber(i)){
                System.out.print(i);
            }
        }
    }
    public static boolean isPrimeNumber(int number ){
        if(number < 0 ){
            return false;
        }else{
            int square =(int) Math.sqrt(number);
            for(int i =2 ; i<= square ; i ++){
                if(number % i == 0) return false ;
            }
        }
        return true;
    } 
}
