import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

    @Test
    public void testRectangleClassExists() {
        try {
            Class.forName("Rectangle");
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        }
    }

    @Test
    public void testRectangleGetters() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Constructor<?> constructor = rectangleClass.getDeclaredConstructor(double.class, double.class);
            Object rectangle = constructor.newInstance(7.5, 15.0);
            
            Method getLengthMethod = rectangleClass.getDeclaredMethod("getLength");
            Method getWidthMethod = rectangleClass.getDeclaredMethod("getWidth");
            
            double length = (double) getLengthMethod.invoke(rectangle);
            double width = (double) getWidthMethod.invoke(rectangle);
            
            assertEquals(7.5, length, 0.01, "getLength() should return the correct value");
            assertEquals(15.0, width, 0.01, "getWidth() should return the correct value");
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle class is missing a required method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Rectangle getters: " + e.getMessage());
        }
    }

    @Test
    public void testRectangleNoArgConstructor() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Constructor<?> constructor = rectangleClass.getDeclaredConstructor();
            Object rectangle = constructor.newInstance();
            
            Method getLengthMethod = rectangleClass.getDeclaredMethod("getLength");
            Method getWidthMethod = rectangleClass.getDeclaredMethod("getWidth");
            
            double length = (double) getLengthMethod.invoke(rectangle);
            double width = (double) getWidthMethod.invoke(rectangle);
            
            assertEquals(4.0, length, 0.01, "No-arg constructor should set length to 4");
            assertEquals(8.0, width, 0.01, "No-arg constructor should set width to 8");
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Rectangle no-arg constructor: " + e.getMessage());
        }
    }

    @Test
    public void testRectangleSingleArgConstructor1() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Constructor<?> constructor = rectangleClass.getDeclaredConstructor(double.class);
            Object rectangle = constructor.newInstance(10.0);
            
            Method getLengthMethod = rectangleClass.getDeclaredMethod("getLength");
            Method getWidthMethod = rectangleClass.getDeclaredMethod("getWidth");
            
            double length = (double) getLengthMethod.invoke(rectangle);
            double width = (double) getWidthMethod.invoke(rectangle);
            
            assertEquals(10.0, length, 0.01, "Single-arg constructor should set length to the provided value");
            assertEquals(8.0, width, 0.01, "Single-arg constructor should set width to 8");
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Rectangle single-arg constructor: " + e.getMessage());
        }
    }

    @Test
    public void testRectangleSingleArgConstructor2() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Constructor<?> constructor = rectangleClass.getDeclaredConstructor(double.class);
            Object rectangle = constructor.newInstance(7.5);
            
            Method getLengthMethod = rectangleClass.getDeclaredMethod("getLength");
            Method getWidthMethod = rectangleClass.getDeclaredMethod("getWidth");
            
            double length = (double) getLengthMethod.invoke(rectangle);
            double width = (double) getWidthMethod.invoke(rectangle);
            
            assertEquals(7.5, length, 0.01, "Single-arg constructor should set length to the provided value (7.5)");
            assertEquals(8.0, width, 0.01, "Single-arg constructor should set width to 8");
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Rectangle single-arg constructor with alternate value: " + e.getMessage());
        }
    }

    @Test
    public void testRectangleTwoArgConstructor1() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Constructor<?> constructor = rectangleClass.getDeclaredConstructor(double.class, double.class);
            Object rectangle = constructor.newInstance(5.0, 12.0);
            
            Method getLengthMethod = rectangleClass.getDeclaredMethod("getLength");
            Method getWidthMethod = rectangleClass.getDeclaredMethod("getWidth");
            
            double length = (double) getLengthMethod.invoke(rectangle);
            double width = (double) getWidthMethod.invoke(rectangle);
            
            assertEquals(5.0, length, 0.01, "Two-arg constructor should set length to the first provided value");
            assertEquals(12.0, width, 0.01, "Two-arg constructor should set width to the second provided value");
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Rectangle two-arg constructor: " + e.getMessage());
        }
    }

    @Test
    public void testRectangleTwoArgConstructor2() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Constructor<?> constructor = rectangleClass.getDeclaredConstructor(double.class, double.class);
            Object rectangle = constructor.newInstance(2.5, 6.75);
            
            Method getLengthMethod = rectangleClass.getDeclaredMethod("getLength");
            Method getWidthMethod = rectangleClass.getDeclaredMethod("getWidth");
            
            double length = (double) getLengthMethod.invoke(rectangle);
            double width = (double) getWidthMethod.invoke(rectangle);
            
            assertEquals(2.5, length, 0.01, "Two-arg constructor should set length to the first provided value (2.5)");
            assertEquals(6.75, width, 0.01, "Two-arg constructor should set width to the second provided value (6.75)");
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Rectangle class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Rectangle two-arg constructor with alternate values: " + e.getMessage());
        }
    }

    

    

    @Test
    public void testChairClassExists() {
        try {
            Class.forName("Chair");
        } catch (ClassNotFoundException e) {
            fail("Chair class does not exist");
        }
    }

    @Test
    public void testChairGetters() {
        try {
            Class<?> chairClass = Class.forName("Chair");
            Constructor<?> constructor = chairClass.getDeclaredConstructor(int.class, String.class);
            Object chair = constructor.newInstance(5, "plastic");
            
            Method getLegsMethod = chairClass.getDeclaredMethod("getLegs");
            Method getMaterialMethod = chairClass.getDeclaredMethod("getMaterial");
            
            int legs = (int) getLegsMethod.invoke(chair);
            String material = (String) getMaterialMethod.invoke(chair);
            
            assertEquals(5, legs, "getLegs() should return the correct value");
            assertEquals("plastic", material, "getMaterial() should return the correct value");
        } catch (ClassNotFoundException e) {
            fail("Chair class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Chair class is missing a required method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Chair getters: " + e.getMessage());
        }
    }
    
     @Test
    public void testChairNoArgConstructor() {
        try {
            Class<?> chairClass = Class.forName("Chair");
            Constructor<?> constructor = chairClass.getDeclaredConstructor();
            Object chair = constructor.newInstance();
            
            Method getLegsMethod = chairClass.getDeclaredMethod("getLegs");
            Method getMaterialMethod = chairClass.getDeclaredMethod("getMaterial");
            
            int legs = (int) getLegsMethod.invoke(chair);
            String material = (String) getMaterialMethod.invoke(chair);
            
            assertEquals(4, legs, "No-arg constructor should set legs to 4");
            assertEquals("wood", material, "No-arg constructor should set material to 'wood'");
        } catch (ClassNotFoundException e) {
            fail("Chair class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Chair class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Chair no-arg constructor: " + e.getMessage());
        }
    }

    @Test
    public void testChairSingleArgConstructor() {
        try {
            Class<?> chairClass = Class.forName("Chair");
            Constructor<?> constructor = chairClass.getDeclaredConstructor(int.class);
            Object chair = constructor.newInstance(3);
            
            Method getLegsMethod = chairClass.getDeclaredMethod("getLegs");
            Method getMaterialMethod = chairClass.getDeclaredMethod("getMaterial");
            
            int legs = (int) getLegsMethod.invoke(chair);
            String material = (String) getMaterialMethod.invoke(chair);
            
            assertEquals(3, legs, "Single-arg constructor should set legs to the provided value");
            assertEquals("wood", material, "Single-arg constructor should set material to 'wood'");
        } catch (ClassNotFoundException e) {
            fail("Chair class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Chair class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Chair single-arg constructor: " + e.getMessage());
        }
    }

    public void testChairSingleArgConstructor2() {
        try {
            Class<?> chairClass = Class.forName("Chair");
            Constructor<?> constructor = chairClass.getDeclaredConstructor(int.class);
            Object chair = constructor.newInstance(6);
            
            Method getLegsMethod = chairClass.getDeclaredMethod("getLegs");
            Method getMaterialMethod = chairClass.getDeclaredMethod("getMaterial");
            
            int legs = (int) getLegsMethod.invoke(chair);
            String material = (String) getMaterialMethod.invoke(chair);
            
            assertEquals(6, legs, "Single-arg constructor should set legs to the provided value (6)");
            assertEquals("wood", material, "Single-arg constructor should set material to 'wood'");
        } catch (ClassNotFoundException e) {
            fail("Chair class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Chair class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Chair single-arg constructor with alternate value: " + e.getMessage());
        }
    }

    @Test
    public void testChairTwoArgConstructor() {
        try {
            Class<?> chairClass = Class.forName("Chair");
            Constructor<?> constructor = chairClass.getDeclaredConstructor(int.class, String.class);
            Object chair = constructor.newInstance(3, "metal");
            
            Method getLegsMethod = chairClass.getDeclaredMethod("getLegs");
            Method getMaterialMethod = chairClass.getDeclaredMethod("getMaterial");
            
            int legs = (int) getLegsMethod.invoke(chair);
            String material = (String) getMaterialMethod.invoke(chair);
            
            assertEquals(3, legs, "Two-arg constructor should set legs to the first provided value");
            assertEquals("metal", material, "Two-arg constructor should set material to the second provided value");
        } catch (ClassNotFoundException e) {
            fail("Chair class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Chair class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Chair two-arg constructor: " + e.getMessage());
        }
    }

    @Test
    public void testChairTwoArgConstructor2() {
        try {
            Class<?> chairClass = Class.forName("Chair");
            Constructor<?> constructor = chairClass.getDeclaredConstructor(int.class, String.class);
            Object chair = constructor.newInstance(2, "glass");
            
            Method getLegsMethod = chairClass.getDeclaredMethod("getLegs");
            Method getMaterialMethod = chairClass.getDeclaredMethod("getMaterial");
            
            int legs = (int) getLegsMethod.invoke(chair);
            String material = (String) getMaterialMethod.invoke(chair);
            
            assertEquals(2, legs, "Two-arg constructor should set legs to the first provided value (2)");
            assertEquals("glass", material, "Two-arg constructor should set material to the second provided value ('glass')");
        } catch (ClassNotFoundException e) {
            fail("Chair class does not exist");
        } catch (NoSuchMethodException e) {
            fail("Chair class is missing a required constructor or method: " + e.getMessage());
        } catch (Exception e) {
            fail("Error testing Chair two-arg constructor with alternate values: " + e.getMessage());
        }
    }
}
