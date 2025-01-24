package Two_sum;
import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    /**
     Given an array of integers nums and an integer target,
     return indices of the two numbers such that they add up to target.

     My solution:
     For each number in numbers: O(N)
     Find 9 - number and save it in map with index. (O1)
     If number in map: (O1)
     return current_index and number_index. (O1)

     @param nums: The input array.
     @param target: The number to sum up to.
     @return A list with the indexes of the two numbers that sum up to the target.
     */
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i){
            int num = nums[i];
            int number_to_find = target - num;

            if (map.containsKey(number_to_find)){
                result.add(map.get(number_to_find));
                result.add(i);
                break;
            }

            map.put(num, i);
        };
        return result;
    };
}
