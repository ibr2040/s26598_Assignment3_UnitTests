package Part1_Tests;

import Part1_Shapes.Cube;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    @Test
    public void testCubeCalculateArea(){
        Cube cube =new Cube(6);
        assertEquals(216,cube.calculateArea());
    }

    @Test
    public void testCubeCalculateVolume(){
        Cube cube=new Cube(9);
        assertEquals(729,cube.calculateVolume());
    }
}