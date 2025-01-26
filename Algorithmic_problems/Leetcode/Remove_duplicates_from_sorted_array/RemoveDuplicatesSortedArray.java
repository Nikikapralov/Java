package Remove_duplicates_from_sorted_array;

public class RemoveDuplicatesSortedArray {
    /*
        Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element
    appears only once. The relative order of the elements
    should be kept the same. Then return the number of unique elements in nums.

    Consider the number of unique elements of nums to be k,
    to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain
    the unique elements in the order they were present in nums initially.
    The remaining elements of nums are not important as well as the size of nums.

    Return k.

    Solution:
    We loop through the array:
        if current == previous.
            we set the next item pointer to current.
        we do this until the array ends and we keep track of how many unique items we have.
        We subsequently return them.

    param array: A list of numbers that will be sorted and have to be filtered of duplicates IN PLACE.
    :return: The amount of unique elements.
     */
    static public int remove_duplicates_from_sorted_array(int[] array){
        int previous_position = 0;
        int unique_items = 1;

        for (int i = 0; i < array.length; ++i){
            if (array[i] != array[previous_position]){
                ++previous_position;
                ++unique_items;
                array[previous_position] = array[i];
            }
        }
        return unique_items;
    }
}
