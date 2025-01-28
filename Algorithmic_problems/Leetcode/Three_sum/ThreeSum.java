package Three_sum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ThreeSum {
    /*
        """
    TWO POINTER SOLUTION
    Given an integer array nums, return all the triplets
    [nums[i], nums[j], nums[k]] such that i != j, i != k,
    and j != k, and nums[i] + nums[j] + nums[k] == 0.

    Notice that the solution set must not contain duplicate triplets.

    SOLUTION:
    We set the first number as fixed and apply the two sum solution to the
    problem. We order the array to make accounting for duplicates easier since
    with the hash map solution we would have to order the array or write a custom
    hash function anyway.

    To get all unique combinations we make use of the sorted array.
    [-4, -1, -1, -1, 0, 1, 2, 2] for example.
    We start at -4. We find combinations.
    We start at -1. We find first combination. -1 -1 2
    We don't break the loop but we continue to find all combinations.
    How? Well the second number was already -1. If we choose -1 again, we end up with 2.
    So we need to move the pointer all the way to a new number: 0. We have -1 0 1
    We then move to 1, to 2 till the end.
    We then encounter -1 for our first number again (2 more times) but we say: Hey, I already have
    all of the combinations, I don't need them again so we skip.
    """
     */
    public static List<List<Integer>> three_sum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nums_list = new ArrayList<>(Arrays.asList(nums));
        Collections.sort(nums_list);
        return result;
    }
}
