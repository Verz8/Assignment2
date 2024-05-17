package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerToRomanTest {
    static IntegerToRoman translate = null;

    @BeforeClass
    static public void initialize(){
        translate= new IntegerToRoman();
    }


    @Test
    public void test0(){
        String expected="";
        String actual=translate.convert(0);
        assertEquals(expected, actual);
    }

    @Test
    public void test9(){
        int testnumber=9;
        String expected="IX";
        String actual=translate.convert(9);
        assertEquals(expected, actual);
    }

    @Test
    public void test420(){
        String expected="CDXX";
        String actual=translate.convert(420);
        assertEquals(expected, actual);
    }

    @Test
    public void test1000(){
        String expected="M";
        String actual=translate.convert(1000);
        assertEquals(expected, actual);
    }


}