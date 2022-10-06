package ra.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
    void getAbsoluteNumberTest1() {
        // du lieu dau vao
        int number =1;
        // du lieu mong muon nhan duoc sau khi thuc hien phuong thuc
        int exspected =1;
        // ket qua thuc te sau khi thuc hien phuong thuc
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        // thuc hien so sanh
        assertEquals(exspected,result);
    }
    @Test
    void getAbsoluteNumberTest2() {
        // du lieu dau vao
        int number =0;
        // du lieu mong muon nhan duoc sau khi thuc hien phuong thuc
        int exspected =0;
        // ket qua thuc te sau khi thuc hien phuong thuc
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        // thuc hien so sanh
        assertEquals(exspected,result);
    }
    @Test
    void getAbsoluteNumberTest3() {
        // du lieu dau vao
        int number =-1;
        // du lieu mong muon nhan duoc sau khi thuc hien phuong thuc
        int exspected =1;
        // ket qua thuc te sau khi thuc hien phuong thuc
        int result = AbsoluteNumber.getAbsoluteNumber(number);
        // thuc hien so sanh
        assertEquals(exspected,result);
    }
}