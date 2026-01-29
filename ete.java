
import java.util.*;

// 1.) Reverse a singly linked list

// class Main {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// static Node head = null;

// static void add(int data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = newNode;
// }

// static void reverse() {
// Node prev = null;
// Node curr = head;
// Node next = null;

// while (curr != null) {
// next = curr.next;
// curr.next = prev;
// prev = curr;
// curr = next;
// }

// head = prev;
// }

// static void display() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// for (int i = 0; i < n; i++) {
// add(sc.nextInt());
// }

// reverse();
// display();
// }
// }

// 2.) Sum , product , diff

// class Main {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// int sum = a+b;
// System.out.println("Sum : " +sum);

// int diff = a-b;
// System.out.println("Diff : " +diff);

// int product = a*b;
// System.out.println("Product : " +product);

// if (b != 0) {
// System.out.println((a / b));
// } else {
// System.out.println("Not divisible");
// }

// }
// }

// 3.) Patteren

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 0; i<n; i++){
// for (int j = 1; j<=i; j++){
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }

// 4.) Check if a Linked List is a Palindrome

// class Main {
// class Node{
// int data;
// Node next;

// Node (int data){
// this.data = data;
// this.next = null;
// }
// }

// Node head = null;
// public void add (int data){
// Node newNode = new Node(data);
// if (head == null){
// head = newNode;
// return ;
// }
// Node temp = head;
// while (temp.next != null){
// temp = temp.next;
// }
// temp.next = newNode;
// }

// public int checkPalindrome(){
// if (head == null){
// return 0;
// }

// ArrayList<Integer> arr = new ArrayList<>();
// Node temp = head;

// // Linked list to ArrayList
// while (temp != null){
// arr.add(temp.data);
// temp = temp.next;
// }

// int i = 0;
// int j = arr.size() - 1;

// while (i < j){
// if (!arr.get(i).equals(arr.get(j))){
// return 0; // false
// }
// i++;
// j--;
// }
// return 1; // true
// }

// public void display() {
// Node temp = head;
// while (temp != null){
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("NULL");
// }

// public static void main (String args[]) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// Main list = new Main();

// for (int i = 0; i < n; i++){
// int num = sc.nextInt();
// list.add(num);
// }

// int result = list.checkPalindrome();

// if (result == 1){
// System.out.println("Palindrome");
// } else {
// System.out.println("Not a Palindrome ");
// }
// }
// }

// 5.) Merge two sorted Linkedlist into a sorted linkedlist

// import java.util.*;

// class Main {

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// Node head = null;

// public void add(int data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = newNode;
// }

// public void display() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// System.out.print("NULL");
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// // list 1
// int n1 = sc.nextInt();
// Main list1 = new Main();
// for (int i = 0; i < n1; i++) {
// list1.add(sc.nextInt());
// }

// // list 2
// int n2 = sc.nextInt();
// Main list2 = new Main();
// for (int i = 0; i < n2; i++) {
// list2.add(sc.nextInt());
// }

// ArrayList<Integer> arr = new ArrayList<>();

// Node temp = list1.head;
// while (temp != null) {
// arr.add(temp.data);
// temp = temp.next;
// }

// temp = list2.head;
// while (temp != null) {
// arr.add(temp.data);
// temp = temp.next;
// }

// Collections.sort(arr);

// Main merged = new Main();
// for (int i = 0; i < arr.size(); i++) {
// merged.add(arr.get(i));
// }

// merged.display();
// }
// }

// 6.) Binary search + sorting

import java.util.Scanner;

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int arr[] = new int[n];

// for(int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// int x = sc.nextInt();

// // Bubble Sort
// for(int i = 0; i < n - 1; i++) {
// for(int j = 0; j < n - i - 1; j++) {
// if(arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }

// // Print sorted array
// System.out.print("Sorted Array: ");
// for(int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();

// // Binary Search
// int low = 0, high = n - 1, index = -1;
// while(low <= high) {
// int mid = (low + high) / 2;

// if(arr[mid] == x) {
// index = mid;
// break;
// } else if(arr[mid] < x) {
// low = mid + 1;
// } else {
// high = mid - 1;
// }
// }

// if(index != -1)
// System.out.println("Element " + x + " found at index: " + index);
// else
// System.out.println("Element not found");
// }
// }

// 7.) Check palindrome print true / false

// class Main {
// public static void main (String args []){
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// int temp = n;
// int rev = 0;

// while (n > 0){
// int digit = n % 10;
// rev = rev * 10 + digit;
// n = n/10;
// }
// if (temp == rev){
// System.out.println("true");
// }
// else {
// System.out.println("false");
// }
// }
// }

// 8.) Factorial using recursion

// class Main {
// public static int factorial(int n){
// if (n == 0){
// return 0;
// }
// if (n == 1){
// return 1;
// }
// else {
// return n * factorial(n-1);
// }
// }
// public static void main (String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int result = factorial(n);

// System.out.println(result);
// }
// }

// 9.) Check balanced Parentheses

// class Main {
// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// Stack<Character> st = new Stack<>();
// boolean balanced = true;

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// if (ch == '(' || ch == '{' || ch == '[') {
// st.push(ch);
// }
// else {
// if (st.isEmpty()) {
// balanced = false;
// break;
// }

// char top = st.pop();

// if (ch == ')' && top != '(' ||
// ch == '}' && top != '{' ||
// ch == ']' && top != '[') {
// balanced = false;
// break;
// }
// }
// }

// if (!st.isEmpty()) {
// balanced = false;
// }

// if (balanced) {
// System.out.println("Balanced");
// } else {
// System.out.println("Not Balanced");
// }
// }
// }

// 10.) Detect Cycle or find a loop in a linked list

// class Main {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// static Node head;

// static boolean detectCycle() {
// Node slow = head;
// Node fast = head;

// while (fast != null && fast.next != null) {
// slow = slow.next;
// fast = fast.next.next;

// if (slow == fast) {
// return true;
// }
// }
// return false;
// }

// public static void main(String[] args) {

// head = new Node(1);
// head.next = new Node(2);
// head.next.next = new Node(3);
// head.next.next.next = new Node(4);

// head.next.next.next.next = head.next;

// if (detectCycle()) {
// System.out.println("Cycle Detected");
// } else {
// System.out.println("No Cycle");
// }
// }
// }

// 11.) Convert into upper case without built-in.

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
// String str = sc.nextLine();

// String rev = "";

// for (int i = 0; i<str.length(); i++){
// char ch = str.charAt(i);
// if (ch >= 'a' && ch <= 'z') {
// ch = (char)(ch - 32);
// }
// rev = rev + ch;
// }
// System.out.println(rev);
// }
// }

// 12.) Next Greater element in Stack

// class Main {
// static void NextGreaterEl(int arr[], int n) {
// Stack<Integer> st = new Stack<>();
// int[] result = new int[n];
// for (int i = n - 1; i >= 0; i--) {
// while (!st.isEmpty() && st.peek() <= arr[i]) {
// st.pop();
// }
// if (st.isEmpty()) {
// result[i] = -1;
// } else {
// result[i] = st.peek();
// }
// st.push(arr[i]);
// }
// for (int i = 0; i < n; i++) {
// System.out.print(result[i] + " ");
// }
// System.out.println();
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// NextGreaterEl(arr, n);
// }
// }

// 13.) Calculate sum of digits

// class Main {
// public static void main (String args[]) {
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// int sum = 0;
// while (n > 0) {
// int digit = n % 10;
// sum = sum + digit;
// n = n/10;
// }
// System.out.println(sum);
// }
// }

// 14.) Largest element in an array

// class Main {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// }
// System.out.println(max);
// }
// }

// q.) 15 Find the middle El of a LL.

// class Main {
// class Node {
// int data;
// Node next;

// Node (int data){
// this.data = data;
// this.next = null;
// }
// }
// Node head = null;

// public void add(int data){
// Node newNode = new Node(data);
// if (head == null){
// head = newNode;
// return ;
// }
// Node temp = head;
// while (temp.next != null){
// temp = temp.next;
// }
// temp.next = newNode;
// }

// public void middle (){
// Node slow = head;
// Node fast = head;

// while (fast != null && fast.next != null){
// slow = slow.next;
// fast = fast.next.next;
// }
// System.out.println(slow.data);  
// }

// public static void main (String args[]) {
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();

// Main list = new Main ();
// for (int i = 0; i<n; i++){
// int num = sc.nextInt();
// list.add(num);
// }
// list.middle();
// }
// }

// q.) 16 Remove Nth Node from end of a linkedlist.

// class Main {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// static Node head = null;

// static void add(int data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = newNode;
// }

// static void removeNth(int n) {
// int count = 0;
// Node temp = head;
// while (temp != null) {
// count++;
// temp = temp.next;
// } // n=5 count=5
// if (n == count) { // 10 20 30 40 50
// head = head.next;
// return;
// }
// temp = head;
// for (int i = 1; i < count - n; i++) {
// temp = temp.next;
// }
// temp.next = temp.next.next;
// }

// static void printList() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(); // pos from end
// int size = sc.nextInt(); // no of nodes

// Main list = new Main();

// for (int i = 0; i < size; i++) { // n = 2 hi hai
// int num = sc.nextInt();
// list.add(num);
// }
// list.removeNth(n);
// list.printList();
// }
// }

// q.) 17 Prints the frequency of each character in a string

// import java.util.*;

// class Main {
// public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// int freq[] = new int[26];
// for (int i = 0; i<str.length(); i++){
// char ch = str.charAt(i);
// freq[ch - 'a']++;
// }
// for (int i = 0; i<str.length(); i++){
// char ch = str.charAt(i);
// if (freq[ch - 'a'] != 0){
// System.out.println(ch + ": " +freq[ch - 'a']);
// freq[ch - 'a'] = 0;
// }
// }
// }
// }

// q. 18 Reverse a String using stack

// class Main {
// static String reverse(Stack<Character> st, String str){
// for (int i = 0; i<str.length(); i++){
// st.push(str.charAt(i));
// }
// String ans = "";

// while (!st.isEmpty()) {
// ans = ans + st.pop();
// }
// return ans;
// }
// public static void main (String args[]) {
// Scanner sc = new Scanner (System.in);
// String str = sc.nextLine();

// Stack<Character> st = new Stack<>();
// String result = reverse(st, str);
// System.out.println(result);
// }
// }

// q. 19) Print Max element from each column of 2D array

// class Main {
// public static void main (String args[]) {
// Scanner sc = new Scanner(System.in);
// int R = sc.nextInt();
// int C = sc.nextInt();

// int arr[][] = new int[R][C];
// for (int i = 0; i<R; i++){
// for (int j = 0; j<C; j++){
// arr[i][j] = sc.nextInt();
// }
// }
// for (int j = 0; j<C; j++){
// int max = arr[0][j];
// for (int i = 1; i<R; i++){
// if (arr[i][j] > max){
// max = arr[i][j];
// }
// }
// System.out.print(max + " ");
// }
// }
// }

// q. 20) Count number of words in a sentence
// class Main {
// public static void main (String args[]) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// int count = 0;

// if (str.length() > 0) {
// count = 1; // first word
// }

// for (int i = 0; i<str.length(); i++){
// char ch = str.charAt(i);
// // if (ch == ' '){ // count spaces
// // count ++;
// // }
// if (str.charAt(i) == ' '){
// count++;
// }
// }
// System.out.print(count);
// }
// }

import java.util.*;

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// StringTokenizer st = new StringTokenizer(str, " ");

// System.out.print(st.countTokens());
// }
// }

// q.) 21 Insert a newNode at the end of linkedList.

// class Main {
// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }
// Node head;

// public void add(int data){
// Node newNode = new Node(data);
// if (head == null){
// head = newNode;
// return;
// }
// Node temp = head;
// while (temp.next != null){
// temp = temp.next;
// }
// temp.next = newNode;
// }

// public void display () {
// Node temp = head;
// while (temp != null){
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// }
// public static void main (String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// Main list = new Main();

// for (int i = 0; i<n; i++){
// int num = sc.nextInt();
// list.add(num);
// }
// int val = sc.nextInt();
// list.add(val);

// list.display();
// }
// }

// q.) 22 Infix to postfix

// q.) 23 Merge Sort

// q.) 24 Create a Doubly Linked List (DLL) and write a program to delete a node
// at a given position

// q.) 25 Sum of each column in a 2D array

// class Main {
// public static void main (String args[]) {
// Scanner sc = new Scanner(System.in);
// int R = sc.nextInt();
// int C = sc.nextInt();

// int arr[][] = new int[R][C];
// for (int i = 0; i<R; i++){
// for (int j = 0; j<C; j++){
// arr[i][j] = sc.nextInt();
// }
// }
// for (int j = 0; j<C; j++){
// int sum = 0;
// for (int i = 0; i<R; i++){
// sum = sum + arr[i][j];
// }
// System.out.print(sum + " ");
// }
// }
// }

// q.) 26 Reverse a string using StringBuffer

// class Main {
// public static void main (String args[]) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// // StringBuilder sb = new StringBuilder(str);

// StringBuffer sb = new StringBuffer(str);
// sb.reverse();

// System.out.print(sb.toString());

// }
// }

// q.) 27 Check if a given string of parentheses is balanced using Stack.

// import java.util.Scanner;
// import java.util.Stack;

// class Main {
// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// Stack<Character> st = new Stack<>();
// boolean balanced = true;

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// if (ch == '(' || ch == '{' || ch == '[') {
// st.push(ch);
// } else {
// if (st.isEmpty()) {
// balanced = false;
// break;
// }

// char top = st.pop();

// if ((ch == ')' && top != '(') ||
// (ch == '}' && top != '{') ||
// (ch == ']' && top != '[')) {
// balanced = false;
// break;
// }
// }
// }

// if (!st.isEmpty()) {
// balanced = false;
// }

// if (balanced) {

// System.out.println("Balanced");
// } else {
// System.out.println("Not Balanced");
// }
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

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// StringBuilder sb = new StringBuilder();

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
// ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {

// sb.append(ch);
// }
// }

// System.out.println(sb.toString());
// }
// }

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// String ans = "";

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
// ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
// ans = ans + ch;

// }
// }
// System.out.println(ans);
// }
// }
