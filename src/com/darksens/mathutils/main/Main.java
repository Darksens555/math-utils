/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darksens.mathutils.main;

import com.darksens.mathutils.MathUtils;

/**
 *
 * @author Darksens
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test xem 5! có đúng 120 ko
        int n = 5;
        long expected = 120; //hi vọng 120 trả về
        long actual = MathUtils.getFactorial(n);
        //so sánh để biết đúng sai
        System.out.println("5! expected: " + expected + " "
                + "actual: " + actual);
        //muốn test 0! có đúng là 1 ko
        n = 0;
        expected = 1; //hi vọng 1 trả về
        actual = MathUtils.getFactorial(n);
        //so sánh để biết đúng sai
        System.out.println("0! expected: " + expected + " "
                + "actual: " + actual);
    }
}
//Viết code xong thì psvmz
//test ngay từng hàm từng class trước khi ráp chúng với các class khác
//test ngay sau khi xong hàm xong class thì được gọi là test mức độ 1 (mức Unit Test)
//lầm sao để test, có nhiều cách
//1. Cách 1: sout(gợi hàm) để in ra kết quả của hàm (Java OOP)
//2. Cách 2: JOptionPane để pop up lên kết quả xử lí của hàm (Java Desktop)
//3. Cách 3: ghi ra LOG file, hoặc là ra trang web (Java Web)
//3 cách này thì đều phải dùng mắt để xem kết quả, và tự kết luận đúng sai
//đúng: tức là hàm chạy ra 1 giá trị - ACTUAL VALUE
//              và ta thấy giá trị ACTUAL VALUE khớp với bảng giá trị
// mà ta mong đợi, ta tính trước = tay, gọi là EXPECTED VALUE
//Ví dụ 5! thì ta hi vọng expected hàm trả về 120
//ra kết quả đúng 120 - actual
//hàm chạy đuáng 5!

//* sai: khi test 6!, expected 720, nhưng lại ra actual 120
// hàm xủ lí sai
//4. cách 4: dùng máy so sánh rồi kết luận bằng máy luôn vì máy có thể
//=> Con người không cần nhìn từng dòng kết quả để kết luận đúng sai vì có máy sẽ lo
//nếu tất cả tình huống đều đúng --> hàm dúng --> màu xanh
// hầu hết tất cả các tình huống đều đúng có 1 cái sai --> hàm sai --> màu đỏ

//đỏ: chỉ cần 1 cái sai
//xanh: tất cả đều đúng

//để làm được điều này ta cần thư viện phụ trợ cho java xanh đỏ
//điều này cũng có ở C#, PHP, JS,...
//Java: JUnit, TestNG,..
//C#  : NUnit, xUnit, MSTest
//PHP: PHPUnit
