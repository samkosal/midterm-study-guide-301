import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {
    
    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve
    @Test
    void TestLongestWordWithCharacter(){
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("lebron", "lepookie", "lebronjames", "peenersdfsdfsd"));
        String actual = Practice.LongestWordWithCharacter(stringList, 'l');

        assertEquals("lebronjames", actual);
    }

    @Test
    void TestCountWordsBetweenNM(){
        Set<String> stringList = new HashSet<>();
        stringList.add("Walter");
        stringList.add("Jesse");
        stringList.add("Skyler");
        stringList.add("Mike");
        stringList.add("Saul");

        int actual = Practice.CountWordsBetweenNM(stringList, 4,6);

        assertEquals(1, actual);
    }

    @Test
    void TestDifferenceOddEven(){
        Map<Integer, String> Map = new HashMap<>();
        Map.put(1,null);
        Map.put(2,null);
        Map.put(3,null);
        Map.put(4,null);
        Map.put(5,null);


        int actual = Practice.DifferenceOddEven(Map);

        assertEquals(1, actual);
    }
}


