
// import java.util.Scanner;

// public class Arrays {
// public static void main(String args[]) {
// // int marks[] = new int[3];
// // marks[0] = 98;
// // marks[1] = 96;
// // marks[2] = 95;

// // System.out.println(marks[0]);
// // System.out.println(marks[1]);
// // System.out.println(marks[2]);

// int marks[] = {89, 88, 90};

// for (int i = 0; i < 3; i++) {

// System.out.println(marks[i]);

// }
// }
// }

// public class Arrays {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();

// int numbers[] = new int[size];

// for (int i = 0; i < size; i++) { // Input
// numbers[i] = sc.nextInt(); // ith index par
// }

// sc.close();

// for (int i = 0; i < size; i++) { // Output

// System.out.println("Numbers output : " + numbers[i]);

// }
// }
// }

// 1.) Take an array as input from the user. Search for a given number x and
// print the index at which it occurs.

// Linear Search

// public class Arrays {
// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();

// int numbers[] = new int[size];

// for (int i = 0; i < size; i++) { // Input
// numbers[i] = sc.nextInt(); // ith index par
// }

// sc.close();

// int x = sc.nextInt();

// for (int i = 0; i < numbers.length; i++) {
// if (numbers[i] == x) {
// System.out.println("X found at index: " + i);
// }
// }
// }
// }

// 2-D ARRAYS

// 1.) Take as input a 2-d array. Print the 2-d array in matrix format.

// public class Arrays {

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int rows = sc.nextInt();
// int cols = sc.nextInt();

// int numbers[][] = new int[rows][cols];

// // Input
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// numbers[i][j] = sc.nextInt();
// }
// }

// sc.close();

// // Output
// System.out.println("2-D Arrays is : ");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// System.out.print(numbers[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

// 2.) Take a matrix as input from the user. Search for a given number x and
// print the indices at which it occurs.

// public class Arrays {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// int rows = sc.nextInt();
// int cols = sc.nextInt();

// int numbers[][] = new int[rows][cols];

// for (int i = 0; i < rows; i++) { // Input
// for (int j = 0; j < cols; j++) {
// numbers[i][j] = sc.nextInt();
// }
// }
// sc.close();

// int x = sc.nextInt();

// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// if (numbers[i][j] == x) {
// System.out.println("X found at index : " + i + " " + j);
// }
// }
// }
// }
// }

// 1.) practise questions program to traverse and print all elements of an array

// class Arrays {
// public static void main(String args[]) {
// System.out.println("Input : ");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// System.out.println("elements : ");
// int arr[] = new int[n];

// // sc.close();
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.print("all elements are : ");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// }

// 4.) Max product in array[].

import java.util.Scanner;

// 5.) Insert an element into array....

// public class Arrays {
//     public static void main(String args[]) {
//         System.out.print("Enter number : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int arr[] = new int[n + 1];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter position : ");
//         int pos = sc.nextInt();

//         System.out.print("Enter new element : ");
//         int element = sc.nextInt();

//         sc.close();

//         for (int i = n; i > pos; i--) {
//             arr[i] = arr[i - 1];
//         }
//         arr[pos] = element;
//         n++;

//         System.out.print("after insertion result : ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//}

// deletion
public class Arrays {
    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("enter postion : ");
        // int new_element = sc.nextInt();
        int pos = sc.nextInt();

        sc.close();

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        System.out.print("After deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Second largest number in an array
// import java.util.Scanner;

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
//
// int firstLargest = Integer.MIN_VALUE;
// int secondLargest = Integer.MIN_VALUE;

// for (int i = 0; i < n; i++) {
// if (arr[i] > firstLargest) {
// secondLargest = firstLargest;
// firstLargest = arr[i];
// } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
// secondLargest = arr[i];
// }
// }
// if (secondLargest == Integer.MIN_VALUE) {
// System.out.print("Not exists : ");
// } else {
// // System.out.print("First largest is : " +firstlargest);
// System.out.print(+secondLargest);
// }
// }
// }

// public class Arrays {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter rows and columns : ");
// int r = sc.nextInt();
// int c = sc.nextInt();

// System.out.print("Array elements : ");
// int arr[][] = new int[r][c];
// for (int i = 0; i < r; i++) {
// for (int j = 0; j < c; j++) {
// arr[i][j] = sc.nextInt();
// }
// }
// int even = 0;
// int odd = 0;

// sc.close();

// for (int i = 0; i < r; i++) {
// for (int j = 0; j < c; j++) {
// if (arr[i][j] % 2 == 0) {
// even++;
// } else {
// odd++;
// }
// }
// }
// System.out.println("even count : " + even);
// System.out.println("odd count : " + odd);
// }
// }