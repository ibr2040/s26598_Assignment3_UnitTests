package Part1_Tests;

import Part1_Shapes.Sphere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    @Test
    public void testSphereCalculateArea(){
        Sphere sphere=new Sphere(5);
        assertEquals(314.159,sphere.calculateArea(),0.001);
    }

    @Test
    public void testSphereCalculateVolume(){
        Sphere sphere=new Sphere(5);
        assertEquals(523.598,sphere.calculateVolume(),0.001);
    }
}