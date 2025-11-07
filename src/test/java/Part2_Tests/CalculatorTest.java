package Part2_Tests;

import Part2_Calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator=new Calculator(10,4,'+');
        assertEquals(14,calculator.calculate());
    }

    @Test
    public void testSub(){
        Calculator calculator=new Calculator(3,2,'-');
        assertEquals(1,calculator.calculate());
    }

    @Test
    public void testMul(){
        Calculator calculator=new Calculator(98,4,'*');
        assertEquals(392,calculator.calculate());
    }

    @Test
    public void testDiv(){
        Calculator calculator=new Calculator(84,4,'/');
        assertEquals(21,calculator.calculate());
    }

    @Test
    public void testDivByZero(){
        assertThrows(ArithmeticException.class,()->{
           new Calculator(10,0,'/');
        });
    }

    @Test
    public void testInvalidOperation(){
        assertThrows(IllegalArgumentException.class,()->{
           new Calculator(9,4,'%');
        });
    }
}