package fit;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import fit.core.Aggregations;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldReduceWithSumAggregation()
    {
        // arrange
        var expectedSum = 55;
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        
        // act
        var actualSum = Aggregations.sum(numbers);

        // assert
        assertEquals(expectedSum, actualSum);
    }
}
