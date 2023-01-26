package RecursionTest;

import org.junit.jupiter.api.Test;
import org.snchzmltn.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/***
 * Test class for org.snchzmltn.Recursion
 */
public class RecursionTest {

    private Recursion underTest = new Recursion();

    @Test
    public void shouldReturnSumOfList() {
        List<Integer> testCase = IntStream.range(1, 4).boxed().collect(Collectors.toList());
        int expected = 6;

        int result = underTest.recursiveSum(testCase);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturn0IfInputIsNull() {
        int result = underTest.recursiveSum(null);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnNumberOfElements() {
        List<Integer> testCase = IntStream.range(1, 6).boxed().collect(Collectors.toList());

        int result = underTest.recursiveCount(testCase);

        assertEquals(5, result);
    }

    @Test
    public void shouldReturn0IfInputOfSumIsNull() {
        int result = underTest.recursiveCount(null);

        assertEquals(0, result);
    }

    @Test
    public void shouldFindMaxInList() {
        List<Integer> testCase = new ArrayList<>(List.of(1, 5, 3, 2));
        List<Integer> testCase2 = new ArrayList<>(List.of(1, 5, 3, 20));

        int result = underTest.recursiveFindMaxNum(testCase);

        assertEquals(5, result);

        result = underTest.recursiveFindMaxNum(testCase2);

        assertEquals(20, result);
    }

    @Test
    public void shouldFindIndexUsingRecursiveBinarySearch() {
        int target = 9;
        int[] testCase = IntStream.of(1,2,6,9,1,3,5).toArray();

        int result = underTest.recursiveBinarySearch(testCase, target);

        assertEquals(3, result);
    }

    @Test
    public void shouldNotFindIndexUsingRecursiveBinarySearch() {
        int target = 9;
        int[] testCase = IntStream.range(1, 5).toArray();

        int result = underTest.recursiveBinarySearch(testCase, target);

        assertEquals(-1, result);
    }
}
