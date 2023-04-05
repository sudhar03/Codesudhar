import java.util.Arrays;

public class Hackerrank4 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 4, 8, 5, 3, 1, 9, 8 };
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        frequency(arr);
    }

    public static void frequency(int[] arr) {
        int fre[] = new int[10];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fre[j] = visited;
                }

            }
            if (fre[i] != visited) {
                fre[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (fre[i] != visited) {
                System.out.println(arr[i] + " " + fre[i]);
            }
        }
    }

    public static void sort(int nums[], int low, int hi) {
        if (low > hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = (s + e) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];

                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, hi);

    }
}