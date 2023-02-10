package important_questions;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int leftMax = 0, rightMax = 0;
        int left = 0, right = height.length - 1;
        int waterSum = 0;
        while (left <= right) {
            if (leftMax <= rightMax) {
                waterSum += Math.max(leftMax - height[left], 0);
                leftMax = Math.max(leftMax, height[left]);
                left++;
            } else {
                waterSum += Math.max(rightMax - height[right], 0);
                rightMax = Math.max(rightMax, height[right]);
                right--;

            }

        }
        return waterSum;
    }
}
