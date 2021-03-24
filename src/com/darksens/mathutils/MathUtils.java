/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darksens.mathutils;

/**
 *
 * @author Darksens
 */
public class MathUtils {

    //Welcome to Cirno Math Class, fake type 1
    //of java.util.Math
    public static final double PI = 3.1415;

    // hàm tính n!
    //kiểu long chỉ chịu được 10^18 18 con số 0, lớn hơn là sai
    //âm giai thừa không tính được
    //hàm chỉ chấp nhận từ 0 - 20!
    //0!=1!=1
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid Argument. "
                    + "N must be between 0...20!");
        }
        if (n == 1 || n == 0) {
            return 1; //không cần tính, return ngay
        }
        //qua đoạn này thì n chắn chắn sẽ bằng 2-20
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        //n! = 1 x 2 x 3 x 4... x n;
        return result;
    }
}
