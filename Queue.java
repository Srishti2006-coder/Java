
// public class Queue {
// private int arr[]; // Array to store elements
// private int size; // Maximum capacity
// private int rear; // Index of last element

// // Constructor
// public Queue(int n) {
// arr = new int[n];
// this.size = n;
// this.rear = -1; // Queue initially empty
// }

// // Check if queue is empty
// public boolean isEmpty() {
// return rear == -1;
// }

// // Check if queue is full
// public boolean isFull() {
// return rear == size - 1;
// }

// // Add element to queue (enqueue)
// public void add(int data) {
// if (isFull()) {
// System.out.println("Queue is full!");
// return;
// }
// rear++;
// arr[rear] = data;
// }

// Remove element from queue (dequeue)
// public int remove() {
// if (isEmpty()) {
// System.out.println("Queue is empty!");
// return -1;
// }
// int front = arr[0]; // Get front element
// // Shift all elements left
// for (int i = 0; i < rear; i++) {
// arr[i] = arr[i + 1];
// }
// rear--; // Reduce rear
// return front;
// }

// // Peek front element without removing
// public int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty!");
// return -1;
// }
// return arr[0];
// }

// // Optional: display queue
// public void display() {
// if (isEmpty()) {
// System.out.println("Queue is empty!");
// return;
// }
// System.out.print("Queue: ");
// for (int i = 0; i <= rear; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// // Main method to test
// public static void main(String[] args) {
// Queue q = new Queue(5);

// q.add(10);
// q.add(20);
// q.add(30);
// q.display(); // Queue: 10 20 30

// System.out.println("Removed: " + q.remove()); // 10
// q.display(); // Queue: 20 30

// System.out.println("Front element: " + q.peek()); // 20

// q.add(40);
// q.add(50);
// q.add(60); // Queue full
// q.display(); // Queue: 20 30 40 50 60
// }
// }

// q.) basic code for

// public class Queue {
// static class Queue {
// static int arr[];
// static int size;
// static int rear = -1;

// Queue(int n) {
// arr = new int[n];
// this.size = n;
// }

// public static boolean isEmpty() {
// return rear == -1;
// }

// // add
// public static void add() {
// if (rear == size - 1) {
// System.out.println("Full queue");
// return;
// }
// int data;
// rear++;
// arr[rear] = data;
// }

// // rempove first el
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Empty queue");
// return -1;
// }
// int front = arr[0];
// for (int i = 0; i < rear; i++) {
// arr[i] = arr[i + 1];
// }
// rear--;
// return front;
// }

// // peek
// public static int peak() {
// if (isEmpty()) {
// System.out.println("Empty queue");
// return -1;
// }
// return arr[0];
// }
// }

// public static void main(String args[]) {
// Queue q = new Queue(5);
// q.add(1);
// q.add(2);
// q.add(3);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }

// q.) Circular Queue using Array

// public static Queue{

// static class Queue {
// static int arr[];
// static int size;
// static int rear = -1;
// static int front = -1;

// Queue(int n) {
// arr = new int[n];
// this.size = n;
// }

// public static boolean isEmpty() {
// return rear == -1 && front == -1;
// }

// public static boolean isFull() { // full kab hoga extra cond
// return (rear + 1) % size == front;
// }

// // Enequeue add
// public static void add(int data) {
// if (isFull()) {
// System.out.println("full queue");
// return;
// }

// // 1st element add
// if (front == -1) {
// front = 0;
// }
// rear = (rear + 1) % size;
// arr[rear] = data;
// }

// // dequeue -O(1) remove
// public static int remove() {
// if (isEmpty()) {
// system.out.println("Empty queue");
// return -1;
// }
// int result = arr[front];
// if (rear == front) {
// rear = front = -1;
// } else {
// front = (front + 1) % size;
// }
// return result;
// }

// // peek ()
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Empty queue");
// return -1;
// }
// return arr[front];
// }

// public static void main (String args[]) {
// Queue q = new Queue(5);
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// System.out.println(q.remove());
// q.add(6);
// System.out.println(q.remove());
// q.add(7);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove;
// }
// }
// }

// // q.) Queue using linked list

// public class Queue {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// next = null;
// }
// }

// static class Queue {
// static Node head = null;
// static Node tail = null;

// public static boolean isEmpty() {
// return head == null && tail; == null;
// }

// // Enequeue

// public static void add(int data) {
// Node newNode = new Node(data);
// if (tail == null) {
// tail = head = newNode;
// return;
// }
// tail.next = newNode;
// tail = newNode;
// }

// // dequeue - O(1)
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Empty queue");
// return -1;
// }
// int front = head.data;
// if (head == tail) {
// tail = null;
// }
// head = head.next;
// return front;
// }

// // peek()
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Empty queue");
// return -1;
// }
// return head.data;
// }
// }

// public static void main (String args[]) {
// Queue q = new Queue;
// q.add(1);
// q.add(2);
// q.add(3);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }