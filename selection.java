
// // public class selection {
// public static void sort(int arr[]) {

// for (int i = 0; i < arr.length - 1; i++) {
// int miniIndex = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[j] < arr[miniIndex]) {
// miniIndex = j;
// }
// }
// int temp = arr[i];
// arr[i] = arr[miniIndex];
// arr[miniIndex] = temp;
// }
// }

// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// // main function
// public static void main(String args[]) {
// int arr[] = { 5, 4, 1, 3, 2 };

// System.out.print("Original array: ");
// // printArray(arr);

// sort(arr); // sorting function call

// System.out.print("Sorted array: ");
// // printArray(arr);
// }

// You have two sorted arrays nums1 and nums2 , create a new array result and
// merge the given sorted arrays in it in such a way that the new array should
// also be in sorted order 

// import java.util.Scanner;

// class selection {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// sc.close();

// // Input size of nums1
// int n1 = sc.nextInt();
// int nums1[] = new int[n1];
// for (int i = 0; i < n1; i++) {
// nums1[i] = sc.nextInt();
// }

// // Input size of nums2
// int n2 = sc.nextInt();
// int nums2[] = new int[n2];
// for (int i = 0; i < n2; i++) {
// nums2[i] = sc.nextInt();
// }

// // New result array
// int result[] = new int[n1 + n2];

// // Two pointer approach
// int i = 0, j = 0, k = 0;
// while (i < n1 && j < n2) {
// if (nums1[i] < nums2[j]) {
// result[k++] = nums1[i++];
// } else {
// result[k++] = nums2[j++];
// }
// }

// // Copy remaining elements
// while (i < n1) {
// result[k++] = nums1[i++];
// }
// while (j < n2) {
// result[k++] = nums2[j++];
// }

// // Print result
// System.out.print("Merged Sorted Array: ");
// for (int x = 0; x < result.length; x++) {
// System.out.print(result[x] + " ");
// }
// }
// }
