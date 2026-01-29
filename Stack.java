
import java.util.*;

// class Main {
// public static void main(String args[]) {
// Stack<Integer> st = new Stack<>();

// System.out.println(st.isEmpty()); // true
// System.out.println(st.size()); // 0
// System.out.println(st); // []
// st.push(1);
// st.push(23);
// System.out.println(st.size()); // 2
// st.push(90);
// st.push(5);
// st.push(34);

// // Scanner sc = new Scanner (System.in);
// // int n = sc.nextInt();

// // for (int i = 0 ; i<n; i++){
// // int num = sc.nextInt();
// // System.out.print(num);
// // }
// System.out.println(st.peek()); // last el shown -> 34
// System.out.println(st); // 1 23 90 5 34
// st.pop();
// System.out.println(st); // 1 23 90 5

// System.out.println("Size is : " + st.size()); // 4
// System.out.println(st.isEmpty()); // false
// }
// }

// // 2.) copy contents of one stack to another in same order ....

// class Main {
// public static void main(String args[]) {

// Stack<Integer> st = new Stack<>();
// st.push(1);
// st.push(2);
// st.push(3);
// st.push(4);
// st.push(5);
// System.out.println("print in original one : " + st);

// // reverse order
// Stack<Integer> rt = new Stack<>();
// while (st.size() > 0) {
// rt.push(st.pop());
// }
// System.out.println("print in reverse order first : " + rt);

// Stack<Integer> gt = new Stack<>();
// while (rt.size() > 0) {
// gt.push(rt.pop());
// }
// System.out.println("print in original order again : " + gt);
// }
// }

// 3.) insert at index in stack

// class Main {
// public static void main(String args[]) {
// Stack<Integer> st = new Stack<>();
// st.push(1);
// st.push(2);
// st.push(3);
// st.push(4);
// st.push(5);
// System.out.println(st);

// int idx = 3;
// int x = 80;

// Stack<Integer> temp = new Stack<>();
// while (st.size() > idx) {
// temp.push(st.pop());
// }
// st.push(x);
// System.out.println(st);

// while (temp.size() > 0) {
// st.push(temp.pop());
// }
// System.out.println(st);
// }
// }

// 4.) reverse in stack

// class Main {
// public static void main (String args[]) {
// Stack<Integer> st = new Stack<>();

// st.push(1);
// st.push(2);
// st.push(3);
// st.push(4);
// st.push(5);
// System.out.println(st);

// // reverse order
// Stack<Integer> rt = new Stack<>();
// while (st.size() > 0){
// rt.push(st.pop());
// }
// System.out.println(rt);
// }
// }

// import java.util.*;

// 5.) Stack st ko reverse karna + phir print karna + phir wapas original order
// me laana.

// class Main {
// public static void main(String args[]) {
// Stack<Integer> st = new Stack<>();
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 0; i < n; i++) {
// int x = sc.nextInt();
// st.push(x);
// }

// Stack<Integer> rt = new Stack<>();
// while (st.size() > 0) {
// rt.push(st.pop());
// }
// while (rt.size() > 0) {
// int x = rt.pop();
// System.out.print(x + " ");
// st.push(x);
// }
// System.out.println(st);
// }
// }

// 6.) Call by reference

// class Main {
// public static void ref(Stack<Integer> st) {
// st.push(6);
// }

// public static void main(String args[]) {
// Stack<Integer> st = new Stack<>();

// st.push(100);
// st.push(200);
// st.push(400);
// System.out.println(st);
// ref(st); // call fun
// System.out.println(st);
// }
// }

// 7.) reverse

// class Main {
// public static void reverse(Stack<Integer> st) {
// if (st.size() == 0) {
// return;
// }
// int top = st.pop();
// System.out.print(top + " ");
// reverse(st);

// System.out.println("\n");

// st.push(top); // push back to original stack jab size == 0 a gya uske bahd
// yeh run hoga
// System.out.print(st);
// }

// public static void main(String args[]) {
// Stack<Integer> st = new Stack<>();
// st.push(100);
// st.push(200);
// st.push(300);
// st.push(400);
// reverse(st);
// }
// }

// 8.) reverse with recursion

// class Main {
// public static void reverse(Stack<Integer> st) {

// if (st.size() == 0) {
// return;
// }
// int top = st.pop();
// System.out.println(top);

// reverse(st); // rev ko call phila

// System.out.print(top + " "); // print badh me
// }

// public static void main(String args[]) {
// Stack<Integer> st = new Stack<>();
// st.push(100);
// st.push(200);
// st.push(300);
// st.push(400);

// System.out.println("pushed items : " + st);
// reverse(st);
// }
// }

// 9.) Delete from bottom/index/top

// class Main {
// public static int remove(Stack<Integer> st, int idx) {

// if (idx == 0) {
// return st.pop(); // yahi actual delete
// }

// int top = st.pop();
// int removedElement = remove(st, idx - 1);
// st.push(top);
// return removedElement;
// }
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// Stack<Integer> st = new Stack<>();

// int n = sc.nextInt();
// for (int i = 0; i < n; i++) {
// int x = sc.nextInt();
// st.push(x);
// }

// int idx = sc.nextInt();
// int removed = remove(st, idx);

// System.out.println(removed);
// System.out.println(st);
// }
// }

// class Main {
// public static void main(String args[]) {

// Stack<Integer> st = new Stack<>();
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// for (int i = 0; i < n; i++) {
// int x = sc.nextInt();
// st.push(x);
// }
// System.out.println(st);

// Stack<Integer> rt = new Stack<>();
// while (st.size() > 0) {
// rt.push(st.pop());
// }
// System.out.println(rt);

// Stack<Integer> qt = new Stack<>();
// while (rt.size() > 0) {
// qt.push(rt.pop());

// // System.out.println(qt);
// }
// }
// }

// class Main {
// public static void pushAtBottom(Stack<Integer> st, int x){
// if (st.size() == 0){
// st.push(x);
// return;
// }
// int top = st.pop();
// pushAtBottom(st,x);
// st.push(top);
// }
// public static void reverse (Stack<Integer> st){
// if (st.size() == 1){
// return ;

// int top = st.pop();
// reverse(st);
// pushAtBottom(st,top);
// }
// public static void main (String args[]) {
// Stack<Integer> st = new Stack<>();
// st.push(1);
// st.push(2);
// st.push(3);
// st.push(4);
// }
// }
// }

// 10.) if we pop more than size then error UNDERFLOW CONCEPT

// class Main {
// public static void main(String args[]) {
// Stack<Integer> st = new Stack<>();
// st.push(1);
// st.push(2);
// st.push(3);
// st.push(4);
// System.out.println(st);
// st.pop();
// System.out.println(st);
// st.pop();
// System.out.println(st);
// st.pop();
// System.out.println(st);
// st.pop();
// System.out.println(st);
// st.pop();
// System.out.println(st);
// }
// }

// IMP: 11.) next greater element in stack

// IMP : Array Implementation of Stack Q: "Write a Java program to implement a
// Stack using array.
// Include methods: push(), pop(), peek(), display().
// In main(), perform the operations:
// push(4), push(5), push(1), pop(), display().
// Show the output."

// import java.util.*;

// class Main {

// public static class Stack {
// int[] arr = new int[3];
// int i = 0;

// void push(int x) {
// if (isFull()) {
// System.out.println("Stack is full !");
// return;
// }
// arr[i] = x; // Inserting
// i++;
// }

// int peek() {
// if (i == 0) {
// System.out.println("Stack is Empty!");
// return -1;
// }
// return arr[i - 1];
// }

// int pop() {
// if (i == 0) {
// System.out.println("Stack is Empty!");
// return -1;
// }
// int top = arr[i - 1];
// arr[i - 1] = 0; // By default value is zero in stack
// i--;
// return top;
// }

// void display() {
// for (int p = 0; p < i; p++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// int size() {
// return i;
// }

// boolean isEmpty() {
// if (i == 0) {
// return true; // Mtlab isEmpty hai
// } else {
// return false;
// }
// }

// boolean isFull() {
// if (i == arr.length) {
// return true;
// } else {
// return false;
// }
// }

// int capacity() {
// return arr.length;
// }
// }

// public static void main(String args[]) {
// Stack st = new Stack();
// st.push(4);
// st.display(); // 4

// st.push(5);
// st.display(); // 5

// st.push(10);
// st.display(); // 4 5 10

// System.out.println(st.size()); // 3
// st.pop();

// st.display(); // 4 5

// st.push(7);
// // st.push(0);

// System.out.println(st.isFull());
// st.push(100);
// }
// }

// import java.util.*; General solution for array implementation of stack

// class Main {

// public static class Stack {
// private int[] arr;
// private int idx = 0;

// Stack(int capacity) {
// arr = new int[capacity];
// }

// void push(int x) {
// if (idx == arr.length) {
// System.out.println("Stack is Full!");
// return;
// }
// arr[idx++] = x;
// }

// void display() {
// for (int i = 0; i < idx; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Stack capacity input
// int capacity = sc.nextInt();
// Stack st = new Stack(capacity);

// // Push count input
// int n = sc.nextInt();

// // Elements input
// for (int i = 0; i < n; i++) {
// st.push(sc.nextInt());
// }

// // Display stack
// st.display();
// }
// }

// q) Linked list with stack implementation

// class Main {
// public static class Node { // user defined datq type
// int val ;
// Node next;

// Node () {
// this.val = val;
// }
// }
// public static class LLStack { // user defined data structure
// Node head = null;
// int size = 0;

// void push (int x) {
// Node temp = new Node(x);
// temp.next = head;
// head = temp; // adding element as x
// size ++;
// }

// int pop () {
// if (head == null){
// System.out.println("Stack is empty ");
// return -1;
// }
// int x = head.val;
// head = head.next;
// return x;
// }

// int peek () {

// }

// void display () {
// Node temp = head;
// while (temp!= null){
// System.out.print(temp.val + " ");
// }
// }

// int size () {
// return size;
// }

// }
// }
// }

// 1.) INFIX

// class Main {
// public static void main(String args[]) {
// String str = "9 - 5 + 3 * 4 / 6";

// Stack<Integer> val = new Stack<>();
// Stack<Character> op = new Stack<>();

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i); // ch = '5';

// if (ch == ' ')
// continue;

// int ascii = (int) ch; // ascii = 53

// // '0' -> 48 and '9' -> 57

// if (ascii >= 48 && ascii <= 57) { // This checks ki value integer hi hai na
// val.push(ascii - 48); // 53 - 48 = 5
// } else if (op.size() == 0) {
// op.push(ch);
// }

// else {
// if (ch == '+' || ch == '-') {
// // work
// int v2 = val.pop();
// int v1 = val.pop();
// if (op.peek() == '-')
// val.push(v1 - v2);
// if (op.peek() == '+')
// val.push(v1 + v2);
// if (op.peek() == '*')
// val.push(v1 * v2);
// if (op.peek() == '/')
// val.push(v1 / v2);
// op.pop(); // jo number bcha vo op me se pop
// // push
// op.push(ch);
// } else if (ch == '*' || ch == '/') {
// if (op.peek() == '*' || op.peek() == '/') {
// // work;
// int v2 = val.pop();
// int v1 = val.pop();

// if (op.peek() == '*')
// val.push(v1 * v2);
// if (op.peek() == '/')
// val.push(v1 / v2);

// op.pop();
// op.push(ch);
// } else
// op.push(ch);
// }
// }
// }
// // val stack size -> 1
// while (val.size() > 1) {
// int v2 = val.pop();
// int v1 = val.pop();
// if (op.peek() == '-')
// val.push(v1 - v2);
// if (op.peek() == '+')
// val.push(v1 + v2);
// if (op.peek() == '*')
// val.push(v1 * v2);
// if (op.peek() == '/')
// val.push(v1 / v2);
// op.pop();
// }
// System.out.println(val.peek());
// }
// }

// 2 q.) INFIX with parenthesis

// class Main {
// public static void main(String args[]) {
// String str = "9 - (5 + 3) * 4 / 6"; // 9 - 8 * 4 / 6 = 4

// Stack<Integer> val = new Stack<>();
// Stack<Character> op = new Stack<>();

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i); // ch = '5';

// if (ch == ' ')
// continue;

// int ascii = (int) ch; // ascii = 53

// // '0' -> 48 and '9' -> 57

// if (ascii >= 48 && ascii <= 57) { // This checks ki value integer hi hai na
// val.push(ascii - 48); // 53 - 48 = 5
// } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
// op.push(ch);
// }

// else if (ch == ')') {
// while (op.peek() != '(') {
// // work
// int v2 = val.pop();
// int v1 = val.pop();
// if (op.peek() == '-')
// val.push(v1 - v2);
// if (op.peek() == '+')
// val.push(v1 + v2);
// if (op.peek() == '*')
// val.push(v1 * v2);
// if (op.peek() == '/')
// val.push(v1 / v2);
// op.pop();
// }
// op.pop(); // ( yeh bhi remove
// }

// else if (ch == ')') {
// while (op.peek() != '(') {
// // work
// int v2 = val.pop();
// int v1 = val.pop();
// if (op.peek() == '-')
// val.push(v1 - v2);
// if (op.peek() == '+')
// val.push(v1 + v2);
// if (op.peek() == '*')
// val.push(v1 * v2);
// if (op.peek() == '/')
// val.push(v1 / v2);
// op.pop();
// }
// op.pop(); // '(' opening bracket ko bhi remove krdiya
// }

// else {
// if (ch == '+' || ch == '-') {
// // work
// int v2 = val.pop();
// int v1 = val.pop();
// if (op.peek() == '-')
// val.push(v1 - v2);
// if (op.peek() == '+')
// val.push(v1 + v2);
// if (op.peek() == '*')
// val.push(v1 * v2);
// if (op.peek() == '/')
// val.push(v1 / v2);
// op.pop(); // jo number bcha vo op me se pop
// // push
// op.push(ch);
// } else if (ch == '*' || ch == '/') {
// if (op.peek() == '*' || op.peek() == '/') {
// // work;
// int v2 = val.pop();
// int v1 = val.pop();

// if (op.peek() == '*')
// val.push(v1 * v2);
// if (op.peek() == '/')
// val.push(v1 / v2);

// op.pop();
// op.push(ch);
// } else
// op.push(ch);
// }
// }
// }
// // val stack size -> 1
// while (val.size() > 1) {
// int v2 = val.pop();
// int v1 = val.pop();
// if (op.peek() == '-')
// val.push(v1 - v2);
// if (op.peek() == '+')
// val.push(v1 + v2);
// if (op.peek() == '*')
// val.push(v1 * v2);
// if (op.peek() == '/')
// val.push(v1 / v2);
// op.pop();
// }
// System.out.println(val.peek());
// }
// }

// 3. q) Infix to Prefix Expression

// Infix to Prefix Expression
// import java.util.*;

// class Main {
// public static void main(String args[]) {
// String infix = "9-(5+3)*4/6";
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

// // 4.) q.) Infix to Postfix Expression
// class Main {
// public static void main(String args[]) {

// String infix = "9-(5+3)*4/6";
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
// String t = v1 + v2 + o;
// val.push(t);
// }
// op.pop(); // '(' ye hta diya
// } else {
// if (ch == '+' || ch == '-') {
// // work
// String v2 = val.pop();
// String v1 = val.pop();
// char o = op.pop();
// String t = v1 + v2 + o;
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
// String t = v1 + v2 + o;
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
// String t = v1 + v2 + o;
// val.push(t);
// }
// String postfix = val.pop();
// System.out.println("Postfix: " + postfix);
// }
// }

// Postfix Evaluation
// 5.) q.) Postfix to Infix to final ans.
// import java.util.*;

// class Main {
// public static void main(String args[]) {
// String str = "953+4*6/-";
// Stack<Integer> val = new Stack<>();
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// int ascii = (int) ch;
// if (ascii >= 48 && ascii <= 57) {
// val.push(ascii - 48);
// } else {
// int v2 = val.pop();
// int v1 = val.pop();
// if (ch == '+')
// val.push(v1 + v2);
// if (ch == '-')
// val.push(v1 - v2);
// if (ch == '*')
// val.push(v1 * v2);
// if (ch == '/')
// val.push(v1 / v2);
// }
// }
// System.out.println(val.peek());
// }
// }

// 6.) q.) conversion of prefix to postfix+

// class Main {
// public static void main(String args[]) {
// String str = "-9/*+5346";
// Stack<String> val = new Stack<>();
// for(int i = str.length()-1; i >= 0; i--) {
// char ch = str.charAt(i);
// if(Character.isDigit(ch)) {
// val.push(ch + "");
// } else {
// String v1 = val.pop(); // left
// String v2 = val.pop(); // right
// String t = v1 + v2 + ch; // postfix = left right operator
// val.push(t);
// }
// }
// System.out.println("Postfix: " + val.peek());
// }
// }

// 7.) q.) //conversion of postfix to prefix

// class Main {
// public static void main(String args[]) {
// String str = "953+4*6/-";
// Stack<String> val = new Stack<>();
// for(int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// if(Character.isDigit(ch)) {
// val.push(ch + "");
// } else {
// String v2 = val.pop();
// String v1 = val.pop();
// String t = ch + v1 + v2;
// val.push(t);
// }
// }
// System.out.println("Prefix: " + val.peek());
// }
// }

// 8.) q.) Conversion of Postfix to Infix

// class Main {
// public static void main(String args[]) {
// String str = "953+4*6/-";
// Stack<String> val = new Stack<>();
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// int ascii = (int) ch;
// if (ascii >= 48 && ascii <= 57) {
// val.push(ch + "");
// } else {
// String v2 = val.pop();
// String v1 = val.pop();
// char op = ch;
// String t = "(" + v1 + op + v2 + ")";
// val.push(t);
// }
// }
// System.out.println(val.peek());
// }
// }

// 9.) q.) Conversion of Prefix to Infix

// class Main {
// public static void main(String args[]) {
// String str = "-9/*+5346";
// Stack<String> val = new Stack<>();
// for (int i = str.length() - 1; i >= 0; i--) {
// char ch = str.charAt(i);
// int ascii = (int) ch;
// if (ascii >= 48 && ascii <= 57) {
// val.push(ch + "");
// } else {
// String v1 = val.pop();
// String v2 = val.pop();
// char op = ch;
// String t = "(" + v1 + op + v2 + ")";
// val.push(t);
// }
// }
// System.out.println(val.peek());
// }
// }