
// 1.) Binary Search in java (array should be sorted)

public class binary {
    public static int binarySearch(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (target == arr[mid]) {
                return mid; // found
            } else if (target > arr[mid]) {
                st = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 45 };
        int target = 23;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not Found");
        }
    }
}

// 2.) Ceiling of a number in a sorted array

// class binary { // Ceiling q return graeter than or equal to target
// public static void main(String args[]) {
// int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
// int target = 159;
// int result = ceiling(arr, target);
// System.out.println("Ceiling is at index: " + result);
// }

// static int ceiling(int arr[], int target) {

// if (target > arr[arr.length - 1]) {
// return -1;
// }

// int start = 0;
// int end = arr.length - 1;

// while (start <= end) {
// int mid = start + (end - start) / 2;

// if (target > arr[mid]) {
// start = mid + 1;
// } else if (target < arr[mid]) {
// end = mid - 1;
// } else {
// return mid;
// }
// }
// return start;
// }
// }

// 3.) Floor of a number in a sorted array

// class binary { // greatest element smaller than or equal to target
// public static void main(String args[]) {
// int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
// int target = 13;
// int result = floor(arr, target);
// System.out.println("Floor is at index: " + result);
// }

// static int floor(int arr[], int target) {

// if (target > arr[arr.length - 1] && target < arr[0]) {
// return -1;
// }

// int start = 0;
// int end = arr.length - 1;

// while (start <= end) {
// int mid = start + (end - start) / 2;

// if (target > arr[mid]) {
// start = mid + 1;
// } else if (target < arr[mid]) {
// end = mid - 1;
// } else {
// return mid;
// }
// }
// return end;
// }
// }

// 4.) Return the smallest character in letters that is greater than target.

// class binary {
// public char nextGreatestLetter(char[] arr, char target) {
// int st = 0, end = arr.length - 1;

// while (st <= end) {
// int mid = st + (end - st) / 2;

// if (target >= arr[mid]) {
// st = mid + 1;
// } else {
// end = mid - 1;
// }
// }

// // Agar st array ke size ke equal ho jaye → wrap around
// return st < arr.length ? arr[st] : arr[0];
// }
// }

// 5.) Find first and last position of an element in sorted array

// class binary {
// public static int[] searchRange(int nums[], int target) {
// int First = findFirst(nums, target);
// int Last = findLast(nums, target);
// return new int[] { First, Last };
// }

// public static int findFirst(int nums[], int target) {
// int start = 0;
// int end = nums.length - 1;
// int ans = -1;

// while (start <= end) {
// int mid = start + (end - start) / 2;
// if (target == nums[mid]) {
// ans = mid;
// end = mid - 1;
// } else if (target > nums[mid]) {
// start = mid + 1;
// } else {
// end = mid - 1;
// }
// }
// return ans;
// }

// public static int findLast(int nums[], int target) {
// int start = 0;
// int end = nums.length - 1;
// int ans = -1;

// while (start <= end) {
// int mid = start + (end - start) / 2;
// if (target == nums[mid]) {
// ans = mid;
// start = mid + 1;
// } else if (target > nums[mid]) {
// start = mid + 1;
// } else {
// end = mid - 1;
// }
// }
// return ans;
// }

// // ✅ main method
// public static void main(String args[]) {
// int arr[] = { 5, 7, 7, 8, 8, 10 };
// int target = 8;
// int result[] = searchRange(arr, target);
// System.out.println("First and Last index are: " + result[0] + " " +
// result[1]);
// }
// }

// 6.) Position of an elemnt in infinite sorted array

// class binary {
// public static void main(String args[]) {

// }

// }