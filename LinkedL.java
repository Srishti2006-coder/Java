
// public class LinkedL {
// Node head; // head of the list

// // Linked list Node
// static class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// next = null;
// }
// }

// // Method to insert a new node at the end
// public void insert(int data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// } else {
// Node current = head;
// while (current.next != null) {
// current = current.next;
// }
// current.next = newNode;
// }
// }

// // Method to display the linked list
// public void display() {
// Node current = head;
// while (current != null) {
// System.out.print(current.data + " ");
// current = current.next;
// }
// System.out.println();
// }

// public static void main(String[] args) {
// LinkedL list = new LinkedL();
// list.insert(10);
// list.insert(20);
// list.insert(30);
// list.display(); // Output: 10 20 30
// }
// }

// * Code by kunal

// import java.util.LinkedList;
// import java.util.Scanner;

// public class LinkedL {

// private static class Node {

// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// private Node head;

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
// temp.next = newNode; // linking new node to last node
// }

// public void display() {
// Node temp = head;

// while (temp != null) {
// System.out.print(temp.data + "-> ");
// temp = temp.next;
// }
// System.out.println("Null");
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// LinkedL list = new LinkedL();

// System.out.println("Enter 3 numbers:");

// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// list.add(a);
// list.add(b);
// list.add(c);

// System.out.print("Linked List: ");
// list.display();

// sc.close();
// }
// }

// insert at beginning code

// public class LinkedL {

// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// static Node head;

// public void insertAtbeg(int data) {
// Node newNode = new Node(data);

// newNode.next = head; // point new node to current head
// head = newNode; // make new node as head
// }

// public void display() {
// Node temp = head;

// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.print("Null");
// }

// public static void main(String args[]) {
// LinkedL list = new LinkedL();

// list.insertAtbeg(10);
// list.insertAtbeg(20);
// list.insertAtbeg(30);

// list.display();
// }
// }

// Insert at specific position code

// public class LinkedL {

// private static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// private Node head;

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

// public void insertAtPosition(int data, int pos) {
// Node newNode = new Node(data);

// if (pos == 1) {
// newNode.next = head; // simple insertion at beginning
// head = newNode;
// return;
// }

// Node temp = head;
// int count = 1;

// while (count < pos - 1 && temp != null) {
// temp = temp.next;
// count++;
// }
// if (temp == null) {
// System.out.println("Invalid Position");
// return;
// }
// newNode.next = temp.next;
// temp.next = newNode;
// }

// public void display() {
// Node temp = head;

// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("Null");
// }

// public static void main(String args[]) {
// LinkedL list = new LinkedL();

// list.add(10);
// list.add(20);
// list.add(30);
// System.out.print("Original Linked List: ");

// list.display();

// int data = 15;
// int position = 2;
// list.insertAtPosition(data, position);
// System.out.print("Linked List after insertion at " + position + " : ");
// list.display();
// }
// }

// import java.util.Scanner;

// class Main {
// class Node {
// int data;
// Node next;

// // Node constructor
// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// static Node head = null; // head pointer

// // Add node at end
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

// // Display linked list
// public void display() {
// Node temp = head;

// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.print("NULL");
// }

// // Main function
// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(); // number of nodes

// Main list = new Main();

// for (int i = 0; i < n; i++) {
// int num = sc.nextInt();
// list.add(num);
// }

// list.display();
// }
// }

// 2.) Insert at begining

// public class Main {
// class Node {
// int data;
// Node next;

// Node (int data) {
// this.data = data;
// this.next = null;
// }
// }
// static Node head;

// public void insertAtbeg (int data) {
// Node newNode = new Node(data);

// newNode.next = head;
// head = newNode;
// }

// public void display () {
// Node temp = head;

// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.print("NULL");
// }

// public static void main (String args[]) {
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();
// Main list = new Main ();

// // list.insertAtbeg(40);
// // list.insertAtbeg(30);
// // list.insertAtbeg(20);
// // list.insertAtbeg(10);

// // list.display();
// for (int i = 0; i<n; i++) {
// int num = sc.nextInt();
// list.insertAtbeg(num);
// }
// list.display();

// System.out.print("\n");

// int newEl = sc.nextInt();
// list.insertAtbeg(newEl);
// list.display();
// }
// }

// 3.) Insert at particular position

// public class Main {
// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// Node head;

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

// public void insert(int data, int pos) {
// Node newNode = new Node(data);

// if (pos == 1) {
// newNode.next = head;
// head = newNode;
// return;
// }

// Node temp = head;
// int count = 1;

// while (count < pos - 1 && temp != null) {
// temp = temp.next;
// count++;
// }
// newNode.next = temp.next;
// temp.next = newNode;
// }

// public void display() {
// Node temp = head;

// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.print("NULL");
// }
// public static void main (String ags[]) {
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();
// Main list = new Main ();

// for (int i = 0; i<n; i++){
// int num = sc.nextInt();
// list.add(num);
// }
// list.display();

// System.out.print("\n");

// int data = sc.nextInt();
// int pos = sc.nextInt();

// list.insert(data, pos);
// list.display();
// }
// }

// 4.) Delete from begining

// public class Main {
// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// Node head;

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

// public void deleteFromBeg() {
// if (head == null) {
// System.out.print("List is empty");
// return;
// }
// head = head.next;
// }

// public void display() {
// Node temp = head;

// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.print("NULL");
// }
// public static void main (String args[]) {
// Scanner sc = new Scanner (System.in);
// int n = sc.nextInt();
// Main list = new Main();

// for (int i = 0 ; i<n; i++) {
// int num = sc.nextInt();
// list.add(num);
// }
// list.display();

// System.out.print("\n");

// list.deleteFromBeg();
// list.display();
// }
// }

// 5.) Delete from end

// import java.util.Scanner;

// public class Main {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// static Node head;

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

// public void delete() {
// if (head == null) {
// System.out.print("Invalid ");
// return;
// } else if (head.next == null) {
// head = null;
// } else {
// Node temp = head;
// while (temp.next.next != null) {
// temp = temp.next;
// }
// temp.next = null;
// }
// }

// public void display() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("null");
// }

// public static void main (String args[]) {
// Scanner sc = new Scanner (System.in);
// int n= sc.nextInt();
// Main list = new Main();

// for (int i = 0 ; i<n; i++){
// int num = sc.nextInt();
// list.add(num);
// }
// list.display();

// System.out.print("\n");

// // int element = sc.nextInt();

// list.delete();
// list.display();
// }
// }

// 6.) delete from specific position

// import java.util.*;

// public class Main {
// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// Node head;

// // Add node at end

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

// // Delete node from specific position

// public void deleteAtPos(int pos) {
// if (head == null) {
// System.out.println("List is empty!");
// return;
// }

// // If position = 1 → delete first node
// if (pos == 1) {
// head = head.next;
// return;
// }

// Node temp = head;
// int count = 1;

// // Traverse till node just before the target
// while (temp != null && count < pos - 1) {
// temp = temp.next;
// count++;
// }

// // If position is invalid (greater than list length)
// if (temp == null || temp.next == null) {
// System.out.println("Invalid position!");
// return;
// }

// // Skip the node to be deleted
// temp.next = temp.next.next;
// }

// // Display linked list
// public void display() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("NULL");
// }

// // Main method
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// Main list = new Main();

// System.out.print("Enter number of elements: ");
// int n = sc.nextInt();

// System.out.println("Enter " + n + " elements:");
// for (int i = 0; i < n; i++) {
// int num = sc.nextInt();
// list.add(num);
// }

// System.out.println("Original List:");
// list.display();

// System.out.print("Enter position to delete: ");
// int pos = sc.nextInt();

// list.deleteAtPos(pos);

// System.out.println("Updated List:");
// list.display();

// sc.close();
// }
// }

// 7.) Search an element in linked list and print its position

// public class Main {
// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// Node head;

// // Function to add element at end
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

// // Function to search an element
// void search(int key) {
// Node temp = head;
// int pos = 1;
// boolean found = false;

// while (temp != null) {
// if (temp.data == key) {
// System.out.println("Element " + key + " found at position: " + pos);
// found = true;
// break;
// }
// temp = temp.next;
// pos++;
// }

// if (!found) {
// System.out.println("Key not found");
// }
// }

// // Function to display the linked list
// void display() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("NULL");
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// Main list = new Main();

// int n = sc.nextInt();

// System.out.println("Enter " + n + " elements:");
// for (int i = 0; i < n; i++) {
// int num = sc.nextInt();
// list.add(num);
// }
// list.display();

// int key = sc.nextInt();
// list.search(key);

// sc.close();
// }
// }

// 8.) Find largest and smallest element in linked list

// class Main {
// Static class Node {
// int data;
// Node next ;

// Node (int data) {
// this.data = data;
// this.next = null;
// }
// }
// static Node head;

// static void LargestSmallest (Node head ) {
// if (head == null) {
// return ;
// }

// int largest = head.data;
// int smallest = head.data;

// Node temp = head;

// while (temp!= null){
// if (temp.data > largest) {
// largest = temp.data;
// }
// if (temp.data < smallest) {
// smallest = temp.data;
// }
// temp = temp.next;
// }

// }

// }''

// q.) Reverse a linked list

import java.util.Scanner;

class Main {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null; // head pointer

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; // save next
            curr.next = prev; // reverse link
            prev = curr; // move prev
            curr = next; // move curr
        }
        head = prev; // update head
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of nodes

        Main list = new Main();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        list.reverse();
        list.display();
    }
}
