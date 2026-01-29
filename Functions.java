
// Functions & Methods

// public class lec7 {
// public static void printMyName(String name) {
// System.out.println(name);
// return;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// String name = sc.next();
// printMyName(name);
// }
// }

// 1.) Make a function to add 2 numbers and return the sum

// public class Functions {
// public static int claculateSum(int a, int b) {
// int sum = a + b;
// return sum;
// }

// public static void main(String args[]) {
// // Scanner sc = new Scanner(System.in);
// // int a = sc.nextInt();
// // int b = sc.nextInt();

// int a = 9;
// int b = 0;

// // sc.close();

// //int sum = claculateSum(a, b);
// System.out.println("Sum of two numbers is : " + claculateSum(a, b));

// }
// }

// 2.) Make a function to multiply 2 numbers and return the product

// public class Functions {
// public static int multiply(int a, int b) {
// int mul = a * b;
// return mul;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter number a : ");
// int a = sc.nextInt();

// System.out.print("Enter number b : ");
// int b = sc.nextInt();

// sc.close();

// int product = multiply(a, b);
// System.out.println("Product of two numbers is :" + product);
// }
// }

// 3.) Find the factorial of a number

// public class Functions {
// public static int Factorial(int n) {
// if (n == 0) {
// return 1;
// } else {
// return n * Factorial(n - 1);
// }
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number : ");
// int n = sc.nextInt();

// sc.close();

// System.out.println("Factorial of a number is :" + Factorial(n));

// }
// }

// Prime number or not
// import java.util.Scanner;

// public class Functions {
// public static boolean isPrime(int n) {
// if (n <= 1) {
// return false;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number : ");
// int n = sc.nextInt();

// sc.close();

// if (isPrime(n)) {
// System.out.println(n + " is a prime number.");
// } else {
// System.out.println(n + " is not a prime number.");
// }
// }
// }
// Questions practice

// 1.) Enter 3 numbers from the user & make a function to print their average

// import java.util.Scanner;

// public class Functions {
// public static float average(int a, int b, int c) {
// float average = (a + b + c) / 3f; // FIXED
// return average;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter number a : ");
// int a = sc.nextInt();

// System.out.print("Enter number b : ");
// int b = sc.nextInt();

// System.out.print("Enter number c : ");
// int c = sc.nextInt();

// sc.close();

// float avg = average(a, b, c);
// System.out.println("Average of three numbers is : " + avg);
// }
// }

// 2.) WAP to print the sum of all odd numbers from 1 to n

// import java.util.*;
// class functions {
// public static int Sum(int n) {
// int sum = 0;
// for (int i = 0; i < n; i++) {
// if (i % 2 != 0) {
// sum = sum + i;
// }
// }
// return sum;
// }

// public class Functions {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter numbers : ");
// int n = sc.nextInt();

// sc.close();

// System.out.print("Sum of odd numbers is : " + Sum(n));

// }
// }
// }

// 3.) WAP which takes in 2 numbers and return the greater of those two.

// public class Functions {
// public static int numbers(int a, int b, int c) {
// if (a > b && a > c) {
// return a;
// } else if (b > a && b > c) {
// return b;
// } else {
// return c;
// }
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// sc.close();

// int ans = numbers(a, b, c);
// System.out.print("Greatest of all among is : " + ans);
// }
// }

// 4.) WAP that takes in the radius as input and retruns area of a circle .

// public class Functions {
// public static float area(float r) {
// float area = 3.14f * r * r;
// return area;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int r = sc.nextInt();

// System.out.println("Area of circle is : " + area(r));
// sc.close();
// }
// }

// 5.) WAP that takes in age as as input and return id that person is eligible
// to vote or not. A person of age > 18 is eligible to vote.....

// public class Functions {
// public static void age(int a) {
// if (a >= 18) {
// System.out.println("yes you are eligible to vote");
// } else {
// System.out.println("sorry you are not eligible to vote");
// }
// }

// public static void main(String args[]) {

// System.out.print("Enter your age : ");

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();

// age(a);

// sc.close();
// }
// }

// 6.)

// 7.) WAP to display the count of postive , negative and zeroes entered by the
// user.

// public class Functions {
// public static void count(int n, Scanner sc) {
// int postive = 0;
// int negative = 0;
// int zero = 0;

// for (int i = 0; i < n; i++) {
// int num = sc.nextInt();
// if (num > 0) {
// postive++;
// } else if (num < 0) {
// negative++;
// }
// // } else if (num == 0) {
// // zero++;
// // } else {
// // System.out.println("Invalid number");
// // }

// else {
// zero ++;
// }
// }
// System.out.println("Postive numbers are : " + postive);
// System.out.println("Negative numbers are : " + negative);
// System.out.println("Zero numbers are : " + zero);
// // sc.close();
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter numbers : ");
// int n = sc.nextInt();

// count(n, sc);
// sc.close();
// }
// }

// 8.) TWo numbers are entered by the user, x and n . Write a function to find
// the vaue of one number rasied to the power of another that is x rasied to
// power n.

// public class Functions {
// public static int power(int x, int n) {
// int result = 1; // if needed use long instead of int
// for (int i = 0; i < n; i++) {
// result = result * x;
// }
// return result;
// }

// public static void main(String args[]) {
// // Scanner sc = new Scanner(System.in);

// System.out.print("Enter base number : ");
// int x = sc.nextInt();

// System.out.print("enter power number : ");
// int n = sc.nextInt();
// sc.close();

// System.out.println("Result is : " + power(x, n));
// }
// }

// 9.) WAP that calculated the greated common divisor (GCD) of two numbers .

// public class Functions {
// public static int gcd(int x, int y) {
// if (x == 0) {
// return y;
// }
// if (y == 0) {
// return x;
// } else if (x > y) {
// return gcd(x - y, y);
// } else {
// return gcd(x, y - x);
// }
// }

// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);

// System.out.print("Enter x : ");
// int x = sc.nextInt();

// System.out.print("Enter y : ");
// int y = sc.nextInt();

// sc.close();

// System.out.println("GCD is : " + gcd(x, y));
// }
// }

// 10.) WAp to print the fibonacci series of n terms where n is input by user .

// import java.util.Scanner;

// public class Functions {
// public static void fibonacci(int n) {
// int a = 0;
// System.out.print("" + a + " ");
// int b = 1;
// System.out.print("" + b + " ");

// for (int i = 2; i <= n; i++) {
// int nextNum = a + b;
// System.out.print("" + nextNum + " ");
// a = b;
// b = nextNum;
// }
// }

// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// sc.close();
// fibonacci(n);
// }
// }

// 11.) Sum of odd numbers

// public class Functions {
// public static int Sum(int n) {
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// if (i % 2 != 0) {
// sum = sum + i;
// }
// }
// return sum;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter numbers : ");
// int n = sc.nextInt();

// sc.close();

// System.out.print("Sum of odd numbers is : " + Sum(n));
// }
// }

// import java.util.Scanner;