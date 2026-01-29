
// 1.) Example of a class and object in Java
// import java.util.Scanner;

// class Demo {
// int a;
// int b;

// void value() { // this is not a constructor as it has void return type
// Scanner sc = new Scanner(System.in);
// a = sc.nextInt();
// b = sc.nextInt();
// }

// void show() {
// int sum = a + b;
// System.out.print("Sum is: " + sum);
// }
// }

// class Test {
// public static void main(String args[]) {
// Demo obj = new Demo(); // creating object of Demo class , constructor is
// called here
// obj.value(); // calling value method to initialize values
// obj.show(); // calling show method using the object
// }
// }

// 2.) Example of constructor in Java

// class Demo {
// int a;
// String name;

// // Demo() {
// // a = 10;
// // name = "Rahul";
// // }

// void show() {
// System.out.print(a + " " + name);
// }
// }

// class Test {
// public static void main(String args[]) {
// Demo obj = new Demo(); // yeh Demo() constructor ko call karega
// obj.show(); // yeh show() method ko call karega
// }
// }

// 3.) Example of default constructor in Java

// class Demo {
// // int a = 10;
// // String name = "Rahul"; // This is normal way to initialize variables like
// // normal object and class code
// // boolean status = true;

// // int a;
// // String name;
// // boolean status;

// // Demo() { // This is constructor
// // a = 10;
// // name = "Rahul";
// // status = true;
// // }

// void show() {
// System.out.print(a + " " + name + " " + status);
// }
// }c

// class Test {
// public static void main(String args[]) {
// Demo obj = new Demo();
// obj.show();
// }
// }

// 4.) Example of parameterized constructor in Java

// class Demo {
// int a;
// String name;
// boolean status;

// // parameterized constructor
// Demo(int num, String str, boolean stat) {
// a = num;
// name = str;
// status = stat;
// }

// void show() {
// System.out.print(a + " " + name + " " + status);
// }
// }

// class Test {
// public static void main(String args[]) {
// Demo obj = new Demo(25, "Rahul", false);
// obj.show();
// }
// }

// 5.) Another example of parameterized constructor in Java

// class A {
// int x;
// int y;

// A(int a, int b) { // parameterized constructor
// x = a;
// y = b;
// }

// void show() {
// System.out.print(x + " " + y);
// }
// }

// class B {
// public static void main(String args[]) {
// A obj = new A(10, 20);
// obj.show();
// }
// }

// 6.) How we can pass one or more paramters in parameterized constructor

// class A {
// int x;
// int y;

// A(int a, int b) {
// x = a;
// y = b;
// }

// void show() {
// System.out.println(x + " " + y);
// }

// int c;
// String b;
// A() {

// c = 10;
// b = "Hello";
// }

// void dsiplay() {
// System.out.println(c + " " + b);
// }
// }

// class B {
// public static void main(String args[]) {
// A obj1 = new A(10, 20); // via show
// obj1.show();
// // A obj2 = new A(30, "Hello"); // via constructor
// A obj2 = new A();
// obj2.dsiplay();
// }
// }

// 7.) Example of copy constructor in Java

// class A {
// int a;
// String b;

// A() {
// a = 100;
// b = "Hello";
// System.out.print("Original : ");
// System.out.println(a + " " + b);
// }

// A(A obj) { // copy constructor
// a = obj.a; // a ka value firse a mei hi a gya is obj ke through
// b = obj.b; // b ka value firse b mei hi a gya is obj ke through
// System.out.print("Copy : ");
// System.out.print(a + " " + b);
// }
// }

// class B {
// public static void main(String args[]) {
// A obj1 = new A();
// A obj2 = new A(obj1); // copy constructor called
// }
// }

// 8.) Now try with paramterized copy constructor

// class A {
// int a;
// int b;

// A(int x, int y) {
// a = x;
// b = y;
// System.out.print("Original : ");
// System.out.println(a + " " + b);
// }

// A(A ref) {
// a = ref.a;
// b = ref.b;
// System.out.print("Copy : ");
// System.out.println(a + " " + b);
// }
// }

// class B {
// public static void main(String args[]) {
// A obj1 = new A(100, 200);
// A obj2 = new A(obj1);
// }
// }

// 9.) Example of private constructor in Java

// class A {
// int a;
// String b;

// private A() {
// a = 10;
// b = "Hello";
// // System.out.println(a + " " + b);
// }

// void display() {
// System.out.println(a + " " + b);
// }

// public static void main(String args[]) {
// A obj = new A(); // object can be created inside the same class
// obj.display();
// }
// }

// CONSTRUCTOR OVERLOADING EXAMPLES ARE DONE ABOVE

// 10.) Example of construtor

// class A {
// int a;
// double b;
// String c;

// private A() {
// a = 10;
// b = 33.9;
// c = "Hello";

// System.out.println(a + " " + b + " " + c);
// }

// // A() {
// // int x;
// // a = x;
// // }

// A(double y, String z) {
// b = y;
// c = z;

// System.out.println(b + " " + c);
// }
// }

// public class object {
// public static void main(String args[]) {
// // A obj = new A();
// // System.out.println(obj.a + " " + obj.b + " " + obj.c);

// // A obj1 = new A(10);
// // System.out.println(obj1.a);

// A obj2 = new A(88.9, "Hi ");
// // System.out.println(obj2.b + " " + obj2.c);
// }
// }

// 11.) Same example with private constructor

// class A {
// int a;
// double b;
// String c;

// private A() {
// a = 10;
// b = 33.9;
// c = "Hello";
// }

// A(int x) {
// a = x;
// }

// A(double y, String z) {
// b = y;
// c = z;
// }

// public static void main(String args[]) {
// A obj = new A();
// System.out.println(obj.a + " " + obj.b + " " + obj.c);

// A obj1 = new A(10);
// System.out.println(obj1.a);

// A obj2 = new A(88.9, "Hi ");
// System.out.println(obj2.b + " " + obj2.c);
// }
// }

// 12.) Instance Block Example

// class A {
//     int a;
//     int b;

//     void show() {
//         a = 50;
//         b = 60;
//         System.out.println(a + " " + b); // simple function
//     }

//     static void show2() {
//         int c = 70;
//         int d = 80; // static function
//         System.out.println(c + " " + d);
//         // System.out.println("Learning dsa");
//     }

//     A() {
//         a = 30;
//         int b = 40; // constructor
//         System.out.println(a + " " + b);
//     }

//     {
//         a = 10;
//         b = 20; // instance block result will be printed before constructor
//         System.out.println(a + " " + b);
//     }
// }

// class B {
//     public static void main(String args[]) {
//         A Aa = new A();
//         Aa.show(); // static method call without object and display first
//         // A.show2();
//         A obj = new A();
//         obj.show();
//         // A.show2(); // agar last mein call krna hai to last mein kr skte ho yeh fye
//         // hai static ka
//     }
// }

// JAVA VARIABLES 1.) local 2.) Instance 3.) Static/ Class variable examples

// class A {
// static int b = 20; // static
// int c = 30; // Instance

// public static void main(String args[]) {
// int a = 10;
// System.out.println("Local variable: " + a); // local

// // A.b = 20 // obj ki jarurat nhi hai static variable ko access krne ke liye
// System.out.println("Static variable: " + A.b); // static

// A obj = new A();
// System.out.println("Instance variable: " + obj.c); // Instance
// }
// }

// One more example

// class Demo {
// int a;
// String name;

// // Demo() {
// // a = 10;
// // name = "Sejal";
// // }

// void show() {
// System.out.println(a + " " + name);
// }
// }

// class Test {
// public static void main(String args[]) {
// Demo obj = new Demo();
// obj.show();
// }
// }

class Test {
    void show(int x) {
        System.out.print("int ");
    }

    void show(double x) {
        System.out.print("double ");
    }
}

public class object {
    public static void main(String[] args) {
        new Test().show(5);
    }
}
