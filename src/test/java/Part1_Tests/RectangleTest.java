package Part1_Tests;

import Part1_Shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void testRectangleCalculateArea(){
        Rectangle rectangle=new Rectangle(15,12);
        assertEquals(180,rectangle.calculateArea());
    }

    @Test
    public void calculateRectangleCalculateVolume(){
        Rectangle rectangle=new Rectangle(12,12);
        assertEquals(0,rectangle.calculateVolume());
    }
}