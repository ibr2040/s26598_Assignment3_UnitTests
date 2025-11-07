package Part1_Tests;

import Part1_Shapes.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    public void testCylinderCalculateArea(){
        Cylinder cylinder=new Cylinder(6,20);
        assertEquals(980.177,cylinder.calculateArea(),0.001);
    }

    @Test
    public void testCylinderCalculateVolume(){
        Cylinder cylinder=new Cylinder(9,34);
        assertEquals(8651.946,cylinder.calculateVolume(),0.001);
    }
}