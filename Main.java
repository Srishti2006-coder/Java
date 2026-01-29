
// import java.util.Scanner;

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();

// int sum = n + m;
// System.out.println("Sum is : " +sum);
// }
// }

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int fact = 1;
// for (int i = 2; i <= n; i++) {
// fact = fact * i;
// }
// System.out.print("Factorial is : " + fact);
// }
// }

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int is_prime = 1;
// for (int i = 2; i <= n / 2; i++) {
// if (n % i == 0) {
// is_prime = 0;
// break;
// }
// }
// if (is_prime == 1) {
// System.out.print("is prime");
// } else {
// System.out.print("Not prime");
// }
// }
// }

// calculate avg and total marks

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int marks_maths = sc.nextInt();
// int marks_science = sc.nextInt();
// int marks_java = sc.nextInt();

// int total = marks_maths + marks_java + marks_science;
// int avg = total / 3;

// if (avg >= 90){
// System.out.println("Grade A");
// }
// else if (avg >= 80 && avg < 90){
// System.out.println("Grade B");
// }
// else if (avg >= 65 && avg < 80){
// System.out.println("Grade C");
// }
// else {
// System.out.println("Grade D");
// }
// // int total = marks_maths + marks_java + marks_science;
// // int average = total / 3;

// System.out.println("Total marks : " +total);
// System.out.println("Average : " +avg);
// }
// }

// Calculate ODD numbers SUM

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// int sum = 0;
// for (int i = 0; i<=n; i++){
// if (i % 2 != 0){
// sum = sum + i;
// }
// }
// System.out.print("Sum is : " +sum);
// }
// }

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// float radius = sc.nextFloat();

// float area = 3.14f * radius * radius;
// System.out.print("Area is : " +area);
// }
// }

// q.) Power (x,n)

// class Main {
// public static void main (String args[]) {
// Scanner sc = new Scanner (System.in);
// int x = sc.nextInt();
// int n = sc.nextInt();

// double result = 1;
// for (int i = 1; i<=n; i++) {
// result = result * x;
// }
// System.out.println(result);
// }
// }

// q.) GCD of two numbers

// class Main {
// public static int gcd(int x , int y){
// if (x == 0){
// return y;
// }
// if (y == 0){
// return x;
// }
// else if (x > y){
// return gcd(x - y, y);
// }
// else {
// return gcd(x, y - x);
// }
// }
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int x = sc.nextInt();
// int y = sc.nextInt();

// System.out.println("Gcd is : " +gcd(x,y));
// }
// }

// q.) Fibonnaci series
// import java.util.Scanner;

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// sc.close();

// // if (n <= 0){
// // return ;
// // }

// int a = 0;
// System.out.print(" " + a + " ");
// int b = 1;
// System.out.print(" " + b + " ");

// for (int i = 2; i <= n; i++) {
// int c = a + b;
// System.out.print(" " + c + " ");
// a = b;
// b = c;
// }
// }
// }

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// float radius = sc.nextFloat();

// float area = 3.14f * radius * radius;
// System.out.print("Area is : " +area);
// }
// }

// q.) print numbers from n to 1 with recursion

// class Main {
// public static void printNum(int n){

// if (n == 0){
// return ;
// }
// System.out.println(n);
// printNum(n - 1);
// }
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// System.out.println(" Counting from n to 1 : ");
// printNum(n);
// }
// }

// class Main {
// public static void printNum(int n) {
// if (n == 11){
// return ;
// }
// System.out.println(n);
// printNum(n + 1);
// }
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// printNum(n);
// }
// }

// q.) Fibonacci using recursion

// class Main {
// public static int fibonacci (int n){
// if (n == 0){
// return 0;
// }
// if (n == 1){
// return 1;
// }
// else {
// return fibonacci(n-1) + fibonacci(n-2);
// }
// }
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// System.out.print("fibonacci: " +fibonacci(n));
// }
// }

// Questions pdf

// 1.) Count no of positive numbers

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// int arr[] = new int[n];
// for (int i = 0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int count = 0;
// for (int i = 0; i<arr.length; i++){
// if (arr[i] > 0){
// count ++;
// }
// }
// System.out.print("Count of positive numbers : " +count);
// }
// }

// 2.) Count no. of vowels in strings

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// String str = sc.nextLine();

// int count = 0;
// for (int i = 0; i<str.length(); i++){
// char ch = str.charAt(i);

// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
// 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
// count ++;
// }
// }
// System.out.print(count);
// }
// }

// 4.) Find sum of all odd numbers in array

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// int arr[] = new int[n];
// for (int i= 0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int sum = 0;
// for (int i = 0; i<arr.length; i++){
// if (arr[i] % 2 != 0){
// sum = sum + arr[i];
// }
// }
// System.out.print("Sum of odd numbers : " +sum);
// }
// }

// 5.) Reverse a string

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// String str = sc.nextLine();

// String reversed = " ";
// for (int i = str.length()-1; i>=0; i--){
// reversed = reversed + str.charAt(i);
// }
// System.out.print(reversed);
// }
// }

// 7.) linear search

// class Main {
// public static int linear (int arr[] , int target){
// for (int i = 0; i<arr.length; i++){
// if (arr[i] == target ){
// return i;
// }
// }
// return -1;
// }

// public static void main (String args []){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// int arr[] = new int[n];
// for (int i = 0; i<n; i++){
// arr[i] = sc.nextInt();
// }
// int target = sc.nextInt();
// int result = linear(arr, target);

// if (result != 1){
// System.out.print(result);
// }
// else {
// System.out.print(-1);
// }
// }
// }

// 8.) done

// 10.) Sum , difference , * , %

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// int sum = a + b;
// int difference = a - b;
// int product = a * b;

// System.out.print("Sum : " +sum + " ");
// System.out.print("Difference : " +difference + " ");
// System.out.print("Product : " +product + " ");

// if (b!=0){
// int quotient = a / b;

// if (a % b == 0){
// System.out.print("Quotient: " +quotient + "Is divisible : true");
// }
// else {
// System.out.print("Quotient: " +quotient + " Is divisible : false");
// }
// }
// }
// }

// 11.) print Triangular pattern

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// if (n == 1){
// System.out.println("1");
// }
// else if (n == 2){
// System.out.println("1");
// System.out.println("12");
// }
// else if ( n== 3){
// System.out.println("1");
// System.out.println("12");
// System.out.println("123");
// }
// }

// 13.) check palindrome True/false

// import java.util.*;

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int rev = 0;
// int original = n;

// while (n > 0) {
// int digit = n % 10;
// rev = rev * 10 + digit;
// n = n / 10;
// }
// if (rev == original) {
// System.out.print(rev + "true");
// } else {
// System.out.print(rev + " false");
// }
// }
// }

// 14.) Factorial

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// int fact = 1;
// for (int i = 2; i<=n; i++){
// fact = fact * i;
// }
// System.out.print("factorial : " +fact);
// }
// }

// 16.) Prints sum 123 = 6;

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// int sum = 0;
// while (n > 0) {
// int digit = n % 10;
// sum = sum + digit;
// n = n / 10;
// }
// System.out.print("Sum is : " +sum);
// }
// }

// 17.) Largest element in array

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int arr[] = new int[n];
// for (int i = 0; i<n; i++){
// arr[i] = sc.nextInt();
// }

// int largest_elemnt = arr[0];

// for (int i = 0; i<arr.length; i++){
// if (arr[i] > largest_elemnt){
// largest_elemnt = arr[i];
// }
// }
// System.out.print("largest element : " +largest_elemnt);
// }
// }

// 18.) hello --> HELLO upperCase

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// String str = sc.nextLine();

// String upperStr = str.toUpperCase();
// System.out.println(upperStr);
// }
// }

// 19.) smallest elemnt

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int arr[] = new int[n];
// for (int i = 0; i < n; i++){
// arr[i] = sc.nextInt();
// }

// int smallest_element = arr[0];

// for (int i = 1; i < arr.length; i++){
// if (arr[i] < smallest_element){
// smallest_element = arr[i];
// }
// }

// System.out.println("Smallest element: " + smallest_element);
// sc.close();
// }
// }

// 21.) Second largest digit find

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

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
// System.out.print("Second largest : " +secondLargest);

// }
// }

// 24 .) COunt words in a string

// import java.util.Scanner;
// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// String str = sc.nextLine();

// int count = 1;
// for (int i = 0; i<str.length(); i++){
// char ch = str.charAt(i);
// if (ch == ' '){
// count ++;
// }
// }
// System.out.println("Number of words: " + count);
// }
// }

// 6.) Sum of each column

// import java.util.Scanner;

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();

// int arr[][] = new int[n][m];

// for (int i = 0; i<n; i++){
// for (int j = 0; j<m; j++){
// arr[i][j] = sc.nextInt();
// }
// }
// // sum of each columns

// for (int j = 0; j<m; j++){

// int sum = 0;
// for (int i = 0; i<n; i++){
// sum = sum + arr[i][j];
// }
// System.out.print(sum + " ");
// }
// }
// }

/// Diagonal sum

// import java.util.*;

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);

// int n = sc.nextInt();
// int arr [][] = new int[n][n];

// // input matrix
// for(int i = 0; i < n; i++){
// for (int j = 0; j < n; j++){
// arr[i][j] = sc.nextInt();
// }
// }

// int sum = 0;

// // sum of both diagonals
// for(int i = 0; i < n; i++){
// sum += arr[i][i]; // primary diagonal
// if (i != n - i - 1) { // avoid double-counting center
// sum += arr[i][n - i - 1]; // secondary diagonal
// }
// }
// System.out.print(sum);
// }
// }

// q.) Infix to Prefix expression STACKS

// public class Main {
// public static void main(String args[]) {

// String infix = "9 - (5+3) * 4 / 6";
// System.out.println("Infix: " + infix);

// Stack<String> val = new Stack<>();
// Stack<Character> op = new Stack<>();
// for (int i = 0; i < infix.length(); i++) {
// char ch = infix.charAt(i);
// int ascii = (int) ch; // '0' -> 48 and '9' -> 57
// if (ascii >= 48 && ascii <= 57) { // 0 to 9
// String s = "" + ch;
// val.push(s);
// } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
// op.push(ch);
// } else if (ch == ')') {
// while (op.peek() != '(') {
// // work
// String v2 = val.pop();
// String v1 = val.pop();
// char o = op.pop();
// String t = o + v1 + v2;
// val.push(t);
// }
// op.pop(); // '(' ye hta diya
// } else {
// if (ch == '+' || ch == '-') {
// // work
// String v2 = val.pop();
// String v1 = val.pop();
// char o = op.pop();
// String t = o + v1 + v2;
// val.push(t);
// // push
// op.push(ch);
// }
// if (ch == '*' || ch == '/') {
// if (op.peek() == '*' || op.peek() == '/') {
// // work
// String v2 = val.pop();
// String v1 = val.pop();
// char o = op.pop();
// String t = o + v1 + v2;
// val.push(t);

// // push
// op.push(ch);
// } else {
// op.push(ch);
// }
// }
// }
// }
// // val stack size = 1 krna hai
// while (val.size() > 1) {
// // work
// String v2 = val.pop();
// String v1 = val.pop();
// char o = op.pop();
// String t = o + v1 + v2;
// val.push(t);
// }
// String Prefix = val.pop();
// System.out.println("Prefix: " + Prefix);
// }
// }

// q.) Missing element in array

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int T = sc.nextInt(); // number of test cases

// while (T-- > 0) {

// int m = sc.nextInt();
// int n = sc.nextInt();

// int[] arr1 = new int[m];
// int[] arr2 = new int[n];

// int sum1 = 0;
// int sum2 = 0;

// // Read first array and calculate sum
// for (int i = 0; i < m; i++) {
// arr1[i] = sc.nextInt();
// sum1 += arr1[i];
// }

// // Read second array and calculate sum
// for (int i = 0; i < n; i++) {
// arr2[i] = sc.nextInt();
// sum2 += arr2[i];
// }

// // Missing element = sum1 - sum2
// System.out.println(sum1 - sum2);
// }
// }
// }

// q.) Count pairs in sorted array whose sum is equal to k

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int T = sc.nextInt(); // number of test cases

// while (T-- > 0) {
// int N = sc.nextInt();
// int K = sc.nextInt();

// int arr[] = new int[N];
// for (int i = 0; i < N; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(countPairs(arr, N, K));
// }
// }

// static int countPairs(int arr[], int N, int K) {
// int left = 0; // start
// int right = N - 1; // end
// int count = 0;

// while (left < right) {
// int sum = arr[left] + arr[right];

// if (sum == K) {
// count++;
// left++;
// right--;
// }
// else if (sum < K) {
// left++; // sum chota hai → bada number chahiye
// }
// else {
// right--; // sum bada hai → chhota number chahiye
// }
// }

// return count;
// }
// }

// Insert in an array

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int[] arr = new int[n + 1];

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// int pos = sc.nextInt();
// int val = sc.nextInt();

// for (int i = n; i >= pos; i--) {
// arr[i] = arr[i - 1];
// }
// arr[pos - 1] = val;
// for (int i = 0; i <= n; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// Find missing element from an array

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n - 1];
// for (int i = 0; i < n - 1; i++) {
// arr[i] = sc.nextInt();
// }
// int total = n * (n + 1) / 2;
// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
// sum = sum + arr[i];
// }
// int missing = total - sum;
// System.out.println("Missing element is : " + missing);
// }
// }

// check string is a palindrome

// class Main {

// static boolean isPalindrome(String str) {
// int left = 0;
// int right = str.length() - 1;

// while (left < right) {
// if (str.charAt(left) != str.charAt(right)) {
// return false;
// }
// left++;
// right--;
// }
// return true;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// if (isPalindrome(str)) {
// System.out.println("The string is a palindrome.");
// } else {
// System.out.println("The string is not a palindrome.");
// }
// }
// }

// // Count frequency of each character in a string.

// import java.util.Scanner;

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// int freq[] = new int[256]; // ASCII characters

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// freq[ch]++; // increase count
// }

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// if (freq[ch] != 0) {

// System.out.println(ch + " : " + freq[ch]);
// freq[ch] = 0; // so it prints only once
// }
// }
// }
// }

// Check if two strings are anagrams

// import java.util.Scanner;

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// String s1 = sc.nextLine();
// String s2 = sc.nextLine();

// if (s1.length() != s2.length()) {
// System.out.println("Not Anagram");
// return;
// }

// int freq[] = new int[256];

// for (int i = 0; i < s1.length(); i++) {
// freq[s1.charAt(i)]++;
// freq[s2.charAt(i)]--;
// }

// for (int i = 0; i < 256; i++) {
// if (freq[i] != 0) {
// System.out.println("Not Anagram");
// return;
// }
// }

// System.out.println("Anagram");

// }
// }

// count vowels and consonants in a string

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// int vowels = 0;
// int consonants = 0;

// for (int i = 0; i < str.length(); i++) {

// char ch = Character.toLowerCase(str.charAt(i));

// if (ch >= 'a' && ch <= 'z') {
// if (ch == 'a' || ch == 'e' || ch == 'i' ||
// ch == 'o' || ch == 'u') {
// vowels++;
// } else {
// consonants++;
// }
// }
// }

// System.out.println("Vowels: " + vowels);
// System.out.println("Consonants: " + consonants);
// }
// }

import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // input: single character
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
