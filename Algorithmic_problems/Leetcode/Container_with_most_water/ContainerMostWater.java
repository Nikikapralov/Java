package Container_with_most_water;

public class ContainerMostWater {
    /**
     *   You are given an integer array height of length n.
     *   There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     *   Find two lines that together with the x-axis form a container, such that the container contains the most water.
     *   Return the maximum amount of water a container can store.
     *
     *   Solution:
     *   Area = a * b
     *   I set a pointer to the right and to the left of the array.
     *   I calculate the area between the 2 columns.
     *   I move the smaller pointer one position.
     *   I calculate the area again.
     *   Repeat until the biggest area is found.
     *
     *   This works because with this approach, we are limited by the height of the smallest wall. (Water overflow)
     *   and we subsequently squeeze the container tighter and tighter until we reach out of options.
     *   We can continue to move the smaller column since the length gets shorter every time and
     *   we take the risk of either moving to a bigger column that can compensate for that or to a column
     *   that can't.
     * @param height An array of integers that holds the columns and their height.
     * @return An integer value of the most water area.
     */
    public static int container_with_most_water(int[] height){
        int area = 0;
        int left_pointer = 0;
        int right_pointer = height.length - 1;

        while (left_pointer != right_pointer){
            int left = height[left_pointer];
            int right = height[right_pointer];
            int distance = right_pointer - left_pointer;
            int smallest;

            if (left > right){
                smallest = right;
                --right_pointer;
            } else {
                smallest = left;
                ++left_pointer;
            }

            int current_area = distance * smallest;

            area = current_area > area ? current_area : area;
        }

        return area;
    }
}
