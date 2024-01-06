import java.util.ArrayList;
import java.util.Scanner;

public class Solution704 {
    public int search(int[] nums, int target) {
        if (target < nums[0]||target > nums[nums.length-1]){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left + ((right-left)>>2);
            if (nums[mid]>target){
                right = mid-1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数组的长度:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("请输入 " + n + " 个升序整数:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("请输入目标值:");
        int target = scanner.nextInt();
        Solution704 solution = new Solution704();
        int result = solution.search(nums, target);
        if (result != -1) {
            System.out.println("元素 " + target + " 的索引为: " + result);
        } else {
            System.out.println("元素 " + target + " 不在数组中");
        }

        scanner.close();
    }
}
