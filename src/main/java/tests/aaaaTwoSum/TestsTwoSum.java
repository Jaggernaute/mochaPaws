package tests.aaaaTwoSum;

import com.jaggernaute.mochaPaws.aaaaTwoSum.TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestsTwoSum {
    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = new TwoSum().twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] actual = new TwoSum().twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = new TwoSum().twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

}

