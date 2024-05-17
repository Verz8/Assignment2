package it.unipd.mtss;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    static RomanPrinter printer = null;

    @BeforeClass
    static public void initialize(){
        printer= new RomanPrinter();
    }

    @Test
    public void test0(){
        String expected= "\n\n\n\n\n\n";
        String actual=printer.print(0);
        assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        String expected="  _____   \n" +
                " |_   _|  \n" +
                "   | |    \n" +
                "   | |    \n" +
                "  _| |_   \n" +
                 " |_____|  \n";
        String actual=printer.print(1);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        String expected= "__      __ \n\\ \\    / / \n \\ \\  / /  \n  \\ \\/ /   \n   \\  /    \n    \\/     \n";
        String actual=printer.print(5);
        assertEquals(expected, actual);
    }

    @Test
    public void test10(){
        String expected= " __   __  \n \\ \\ / /  \n  \\ V /   \n   > <    \n  / . \\   \n /_/ \\_\\  \n";
        String actual=printer.print(10);
        assertEquals(expected, actual);
    }

    @Test
    public void test15(){
        String expected= " __   __  __      __ \n \\ \\ / /  \\ \\    / / \n  \\ V /    \\ \\  / /  \n   > <      \\ \\/ /   \n  / . \\      \\  /    \n /_/ \\_\\      \\/     \n";
        String actual=printer.print(15);
        assertEquals(expected, actual);
    }

    @Test
    public void test50(){
        String expected= "  _       \n | |      \n | |      \n | |      \n | |____  \n |______| \n";
        String actual=printer.print(50);
        assertEquals(expected, actual);
    }

    @Test
    public void test100(){
        String expected= "   _____  \n  / ____| \n | |      \n | |      \n | |____  \n  \\_____| \n";
        String actual=printer.print(100);
        assertEquals(expected, actual);
    }

    @Test
    public void test500(){
        String expected= "   _____  \n  |  __ \\ \n  | |  | |\n  | |  | |\n  | |__| |\n  |_____/ \n";
        String actual=printer.print(500);
        assertEquals(expected, actual);
    }

    @Test
    public void test1000(){
        String expected= "  __  __  \n |  \\/  | \n | \\  / | \n | |\\/| | \n | |  | | \n |_|  |_| \n";
        String actual=printer.print(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void test2367(){
        String expected= "  __  __    __  __     _____     _____     _____    _        __   __  __      __   _____     _____   \n |  \\/  |  |  \\/  |   / ____|   / ____|   / ____|  | |       \\ \\ / /  \\ \\    / /  |_   _|   |_   _|  \n | \\  / |  | \\  / |  | |       | |       | |       | |        \\ V /    \\ \\  / /     | |       | |    \n | |\\/| |  | |\\/| |  | |       | |       | |       | |         > <      \\ \\/ /      | |       | |    \n | |  | |  | |  | |  | |____   | |____   | |____   | |____    / . \\      \\  /      _| |_     _| |_   \n |_|  |_|  |_|  |_|   \\_____|   \\_____|   \\_____|  |______|  /_/ \\_\\      \\/      |_____|   |_____|  \n";
        String actual=printer.print(2367);
        assertEquals(expected, actual);
    }

    @Test
    public void test478(){
        String expected= "   _____     _____    _        __   __   __   __  __      __   _____     _____     _____   \n  / ____|   |  __ \\  | |       \\ \\ / /   \\ \\ / /  \\ \\    / /  |_   _|   |_   _|   |_   _|  \n | |        | |  | | | |        \\ V /     \\ V /    \\ \\  / /     | |       | |       | |    \n | |        | |  | | | |         > <       > <      \\ \\/ /      | |       | |       | |    \n | |____    | |__| | | |____    / . \\     / . \\      \\  /      _| |_     _| |_     _| |_   \n  \\_____|   |_____/  |______|  /_/ \\_\\   /_/ \\_\\      \\/      |_____|   |_____|   |_____|  \n";
        String actual=printer.print(478);
        assertEquals(expected, actual);
    }

}
