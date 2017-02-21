/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teck Hock
 */
public class CarsTest {
    
    Cars validCars;
    
    public CarsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validCars = new Cars("BMW", "i3", "Electronic Vehicle", 2000, 300000, 345678.90);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Cars.
     */
    @Test
    public void testInvalidCars() {
        System.out.println("Test creation of invalid Car");
        try
        {
            Cars invalidCar = new Cars("BMW", "i3", "Electronic Vehicle", 2000, 500000, 345678.90);
        }
        catch (IllegalArgumentException e)
        { 
            System.out.println(e.getMessage());
        }
}
    /**
     * Test of getMake method, of class Person.
     */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        String expResult = "BMW";
        String result = validCars.getMake();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getFeatures method, of class Person.
     */
    @Test
    public void testGetFeatures() {
        System.out.println("getFeatures");
        String expResult = "Electronic Vehicle";
        String result = validCars.getFeatures();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getYear method, of class Person.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        int expResult = 2000;
        int result = validCars.getYear();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getMileage method, of class Person.
     */
    @Test
    public void testGetMileage() {
        System.out.println("getMileage");
        double expResult = 300000;
        double result = validCars.getMileage();
        Double.compare(expResult, result);
    }
    
    /**
     * Test of getPrice method, of class Person.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 345678.90;
        double result = validCars.getPrice();
        Double.compare(expResult, result);
    }
    
    /**
     * Test of setMileage method, of class Cars with invalid inputs.
     */
    @Test
    public void testSetMileageInvalid() {
        System.out.println("setMileage");
        int mileage = 500000;
        try
        {
            validCars.setMileage(mileage);
            fail("setMileage should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             System.out.println(e.getMessage());
        }
    }
    
    /**
     * Test of setMileage method, of class Cars with invalid inputs.
     */
    @Test
    public void testSetMileageInvalid2() {
        System.out.println("setMileage");
        int mileage = -3;
        try
        {
            validCars.setMileage(mileage);
            fail("setMileage should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             System.out.println(e.getMessage());
        }
    }
}