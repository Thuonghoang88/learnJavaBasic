/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

/**
* Bài 02:
* Viết một chương trình tính giai thừa của một số nguyên dương n. 
* Với n được nhập từ bàn phím. 
* Ví dụ, n = 8 thì 
* kết quả đầu ra phải là 1*2*3*4*5*6*7*8 = 40320
 */
public class lesson2 {
    // su dung de quy
    public static long dequygiaithua(int n){
        if(n<= 0){
            return 1 ;
        }else {
            return n * giaithua(n-1);
        }
    }
    // khong su dung de quy
    public static long giaithua(int n){
        long gt =1;
        if(n <= 0) {
            return 1;
        }else {
            for (int i= 2; i<= n; i ++){
                gt *= i;
            }
        }
        return gt;
    }
    
}
