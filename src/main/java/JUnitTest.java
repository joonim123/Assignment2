import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTest {
    @Test
    public void test_findMax() {
        Finder finder = new Finder();
        int[] intArray = new int[]{4,3,2,1,6,5};
        Integer expectedResult = 6;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_findMaxNull(){
        Finder finder = new Finder();
        int[] intArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void test_findMaxEmpty(){
        Finder finder = new Finder();
        int[] intArray = new int[0];
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void test_findMin() {
        Finder finder = new Finder();
        int[] intArray = new int[]{3,2,1,5,6,4};
        int expectedResult = 1;
        int actualResult = finder.findMin(intArray);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_findMinNull(){
        Finder finder = new Finder();
        int[] intArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(intArray);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void test_findMinEmpty() {
        Finder finder = new Finder();
        int[] intArray = new int[0];
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(intArray);
        assertEquals(expectedResult, actualResult);
    }
}
