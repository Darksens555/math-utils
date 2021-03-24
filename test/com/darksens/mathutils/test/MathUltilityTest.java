/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darksens.mathutils.test;

import static com.darksens.mathutils.MathUtils.*; //muốn các hàm trong class này gọi được trực tiếp 
import java.sql.SQLException;
//ko cần phải class.hàm (chỉ static mới có)
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darksens
 */
public class MathUltilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        long expected = 120; //120 hay không
        int n = 5; //test 5! gõ đúng là 120 hay không
        long actual = getFactorial(n);
        assertEquals(expected, actual);//so sánh xem expected có giống

        //mình test tiếp các trường hợp khác đứng đầu vào đúng đầu ra
        //không cần biến trung gian , làm luôn 
        assertEquals(720, /*MathUtils.*/ getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
    }

    //điều gì sẽ xảy nếu ta đưa tham số xamlol <0 hoặc >20
    //theo thiết kế của hàm, đưa vào xamlol sẽ ném ra ngoại lẹ 
    //và ta cần test xem ngoại lệ có được ném ra không nếu ta xamlol
    //XUẤT HIỆN NGOẠI LỆ TỨC LÀ HÀM CHẠY ĐÚNG
    //THẤY ĐƯỢC NGOẠI LỆ NGHĨA LÀ ĐÚNG
    @Test(expected = IllegalArgumentException.class)
    //có đúng hàm này chạy thì ném ra ngoại lệ tên là IllegalArg...
    //nếu đúng nó ném ra ngoại lệ cùng tên, code đúng rồi thì sẽ xanh
    public void testFactorialWrongArgumentThrowsException() {
        //test tình huống hàm phải ném ra ngoại lệ nếu tham số xamlol
        //ngoại lệ không phải là value đẻ so sánh không dùng assertEqual()
        //phải dùng cái chiêu khác, JUnit 4 khác JUnit 5 ở chỗ bắt ngoại lệ
        //DI (Dependecy Injection / SOLID), Lamda Expression liên quan đến testing của JUnit 5
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }
}
