
// 1.) Print numbers from n to 1;

// public class recursion {
// public static void printNum(int n) {

// if (n == 0) {
// return;
// }

// System.out.println(n);
// printNum(n - 1);
// }

// public static void main(String args[]) {

// // System.out.print("Enter number : ");

// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();

// // sc.close();

// int n = 5;
// printNum(n);
// }
// }

// 2.) print numbers from 1 to 5.

// public class recursion {
// public static void printNum(int n) {
// if (n == 16) {
// return;
// }

// System.out.println(n);
// printNum(n + 1);
// }

// public static void main(String args[]) {
// int n = 10;
// printNum(n);
// }
// }

// 3.) Print sum of first n natural numbers....

// public class recursion {
// public static int sum(int n) {
// if (n == 0) { // Base case
// return 0;
// }
// return n + sum(n - 1); // recursive call
// }

// public static void main(String args[]) {

// System.out.print("Enter number : ");

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// System.out.println("The sum of first n natural numbers is : " + sum(n));
// sc.close();
// }
// }

// sharrdhaa vala code // public class recursion {
// public static void printSum(int i, int n, int sum) {
// if (i == n) {
// sum = sum + i;
// System.out.println(sum);
// return;
// }
// sum = sum + i;
// printSum(i + 1, n, sum);
// System.out.println(i);
// }

// public static void main(String args[]) {
// printSum(1, 5, 0);
// }
// }

// 4.) print factorial of a number n

// public class recursion {
// public static int factorial(int n) {
// if (n == 0 || n == 1) {
// return 1;
// }
// int fact = n * factorial(n - 1);
// // return n * factorial(n - 1);
// return fact;
// }

// public static void main(String args[]) {
// System.out.print("Enter number : ");

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// System.out.println("The factorial of is : " + factorial(n));
// sc.close();
// }
// }

// 5.) Print fibonacci nth digit of a number n....

// public class recursion {
// public static int fibonacci(int n) {
// if (n == 0) {
// return 0;
// }
// if (n == 1) {
// return 1;
// } else {
// return fibonacci(n - 1) + fibonacci(n - 2);
// }
// }

// public static void main(String args[]) {
// System.out.print("Enter number :");

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// System.out.println("The fibonacci nth digit is : " + fibonacci(n));
// sc.close();
// }
// }

// 6.) Now fibonacci series of n digits....

// public class recursion {
// public static void fibonacciSeries(int a, int b, int n) {
// if (n == 0) {
// return;
// }
// int c = a + b;
// System.out.println(c);
// fibonacciSeries(b, c, n - 1);
// }

// public static void main(String args[]) {
// System.out.print("Enter number :");

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// System.out.println("The fibonacci series is : ");
// System.out.println(0);
// System.out.println(1);
// fibonacciSeries(0, 1, n - 2);
// sc.close();
// }
// }

// Ques.) Check if an array is sorted or not....
// public class recursion {
// public static boolean isSorted(int arr[], int i) {
// if (i == arr.length - 1) {
// return true;
// }
// if (arr[i] > arr[i + 1]) {
// return false;
// }
// return isSorted(arr, i + 1);
// }

// public static void main(String args[]) {
// int arr[] = { 1, 2, 3, 4, 5 };
// System.out.println(isSorted(arr, 0));
// }
// }

// 7.) Print x^n (stack height = n)

// public class recursion {
// public static int calcPower(int x, int n) {
// if (n == 0) {
// return 1;
// }
// if (x == 0) {
// return 0;
// }
// return x * calcPower(x, n - 1);
// }

// public static void main(String args[]) {

// System.out.print("Enter number x : ");
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();

// System.out.print("Enter number n : ");
// // Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// System.out.println("The value of x^n is : " + calcPower(x, n));
// sc.close();
// }
// }

// RECURSION LEVEL 2 BEGINS HERE .........

// public class recursion {

// public static void towerOfHanoi(int n, String src, String helper, String
// dest) {
// if (n == 1) {
// System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
// return;
// }
// towerOfHanoi(n - 1, src, dest, helper);
// System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
// towerOfHanoi(n - 1, helper, src, dest);
// }

// public static void main(String args[]) {
// int n = 3;
// towerOfHanoi(n, "S", "H", "D");
// }
// }

class recursion {
    public static int pow(int a, int b) {
        if (a == 0) {
            return 0; // 0^b = 0 (for b > 0)
        }
        if (b == 0) {
            return 1; // a^0 = 1
        }
        return a * pow(a, b - 1); // recursive call
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(pow(a, b)); // 2^5 = 32
    }
}