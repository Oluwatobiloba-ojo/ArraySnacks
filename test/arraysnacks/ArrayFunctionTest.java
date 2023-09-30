package arraysnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFunctionTest {
    @Test
    public void testThatLargestElementInAnArrayCanBePointOut(){
        int [] integers = {1, 3, 5, 6, 7, 8, 9, 10};
        int largest =  ArrayFunction.largestElement(integers);
        assertEquals(10, largest);
    }
    @Test
    public void testThatLargestElementInAnArrayCanBePointOuts(){
        int [] integers = {1,4,6,8,9,9,910, 1000};
        int largest = ArrayFunction.largestElement(integers);
        assertEquals(1000, largest);
    }
    @Test
    public void testLargest2(){
        int [] integers = {1000, 5, 8, 9, 20, 50, 56, 67, 78, 200};
        int largest = ArrayFunction.largestElement(integers);
        assertEquals(1000, largest);
    }
    @Test
    public void testReverse1(){
        int [] integers = {1, 3, 5, 6, 7, 8, 9, 10};
        String reverse =  ArrayFunction.reverseList(integers);
        String result = " 10 9 8 7 6 5 3 1";
       assertEquals(result, reverse);
    }
    @Test
    public void testReverse2(){
        int [] integers = {1000, 2000, 4000, -200, -500};
        String result = " -500 -200 4000 2000 1000";
        String reverse = ArrayFunction.reverseList(integers);
        assertEquals(result, reverse);
    }
    @Test
    public void testWhetherAnyElementOccurInAList(){
        int [] integers = {10, 20, 40, 60, 70, 50};
        boolean result =  ArrayFunction.checkListElement(integers, 50);
        assertTrue(result);
    }
    @Test
    public void testThatAnElementDoesNotOccurInAList(){
        int [] integers = {10, 20, 40, 50, 60, 80};
        boolean result = ArrayFunction.checkListElement(integers, -20);
        assertFalse(result);
    }
    @Test
    public void testForOddPositionInAList(){
        int [] integers = {1, 3, 5, 7, 8, 9, 10, 12, 15, 16};
        String result = ArrayFunction.oddPosition(integers);
        String answer = " 3 7 9 12 16";
        assertEquals(result, answer);
    }
    @Test
    public void testOddPosition2(){
        int [] integers = {19, 2, 5, 4, 7, 8, 9, 10};
        String result = ArrayFunction.oddPosition(integers);
        String answer = " 2 4 8 10";
        assertEquals(result, answer);
    }
    @Test
    public void testForEvenPosition(){
        int [] integers = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        String evenResult = ArrayFunction.evenPosition(integers);
        String answer = " 0 2 4 6 8";
        assertEquals(evenResult, answer);
    }
    @Test
    public void testForEvenPositionInAnArray(){
        int [] integers = {0, 11, 21, 33, 44, 55, 67, 78, 80};
        String evenResult = ArrayFunction.evenPosition(integers);
        String answer = " 0 21 44 67 80";
        assertEquals(evenResult, answer);
    }
    @Test
    public void testForFunctionThatComputeTotalOfAList(){
        int[] array = {1, 3, 5, 8, 9, 10};
        int result = ArrayFunction.totalArray(array);
        int answer = 1 + 3 + 5 + 8 + 9 + 10;
        assertEquals(result, answer);
    }
    @Test
    public void testForTotal(){
        int[] array = {1,3,150,350};
        int result = ArrayFunction.totalArray(array);
        int answer = 1 + 3 + 150 + 350;
        assertEquals(result,answer);
    }
    @Test
    public void testThatAStringIsAPalindrome(){
        String name = "dad";
        boolean result = ArrayFunction.isPalindrome(name);
        assertTrue(result);
    }
    @Test
    public void testThatItIsAPalindrome(){
        String name = "Moses";
        boolean result = ArrayFunction.isPalindrome(name);
        assertFalse(result);
    }
    @Test
    public void testForSumOfAListUsingForLoop(){
        int [] integers = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int result = ArrayFunction.forLoopSum(integers);
        int answer = 1 + 2 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        assertEquals(result, answer);
    }
    @Test
    public void testForSumOfAListUsingWhileLoop(){
        int [] integers = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int result = ArrayFunction.whileLoopSum(integers);
        int answer = 1 + 2 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        assertEquals(result, answer);
    }
    @Test
    public void testForSumOfAListUsingDoWhileLoop(){
        int [] integers = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int result = ArrayFunction.doWhileLoopSum(integers);
        int answer = 1 + 2 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        assertEquals(result, answer);
    }
//    @Test
}