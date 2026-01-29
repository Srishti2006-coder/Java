
// import java.util.*;

// public class strings {
// public static void main(String args[]) {
// System.out.println("Enter name : ");
// Scanner sc = new Scanner(System.in);
// // String name = sc.next(); sirf first word print hoga
// String name = sc.nextLine();
// System.out.println("Name is : " + name);
// sc.close();
// }
// }

// 1.) Concatenation + length fun + charAt(i)
// import java.util.Scanner;

// public class strings {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// String name1 = sc.nextLine();
// String name2 = sc.nextLine();
// sc.close();

// String fullname = name1 + " " + name2; // concatenation
// // System.out.print("name is : " + fullname);
// System.out.print("length is : " + fullname.length());

// System.out.println(" ");

// // // charAt
// for (int i = 0; i < fullname.length(); i++) {
// System.out.println(fullname.charAt(i));
// }
// }
// }

// public class strings { // practice set
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// String str1 = sc.nextLine();
// String str2 = sc.nextLine();
// sc.close();

// String str = str1 + " " + str2;
// System.out.println("Final string is : " + str);
// System.out.print("length is : " + str.length());

// for (int i = 0; i < str1.length(); i++) {
// System.out.println(str1.charAt(i));
// }
// }
// }

// 2.) Compare two strings

// public class strings {
// public static void main(String args[]) {

// String name1 = "abc";
// String name2 = "abc";

// // 1 s1 > s2 = +ve value
// // 2 s1 = s2 = 0
// // 3 s1 < s2 = -ve value

// // a small ,, b large

// if (name1.compareTo(name2) > 0) {
// System.out.println(" s1 big ");
// } else {
// System.out.println("s1 is not big ");
// }

// if (name1 == name2) {
// System.out.println("are = ");
// } // use less
// // else {
// // System.out.println("!= ");
// // }
// }
// }

// public class strings {
// public static void main(String args[]) { // practice
// Scanner sc = new Scanner(System.in);
// String name1 = sc.nextLine();
// String name2 = sc.nextLine();

// sc.close();
// if (name1.compareTo(name2) > 0) {
// System.out.println("+ value ");
// } else if (name1.compareTo(name2) < 0) {
// System.out.println(" - value ");
// }
// if (name1 == name2) {
// System.out.println("both are equal");
// }
// // else {
// // System.out.print("Not valid ");
// // }
// }
// }

// 3.) Substring in java

// public class strings {
// public static void main(String args[]) {

// String name1 = "Tonystark";
// // substring(begining idx, end idx);
// // String name = name1.substring(0, 8);
// String name = name1.substring(6);
// // String name = name1.substring(5);
// System.out.println(name);
// }
// }

// STRING ARE IMMUTABLE = CAN'T BE CHANGED......

// STRING BUILDER lec 12 & 13

// public class strings {
// public static void main(String args[]) {
// StringBuilder sb = new StringBuilder("Mrs Tony");
// System.out.println(sb);

// // char at index
// // for (int i = 0; i < sb.length(); i++) {
// // System.out.println(sb.charAt(i));
// // }
// System.out.println(sb.charAt(5));

// // set char a index 0
// sb.setCharAt(0, 'P');
// System.out.println(sb);
// }
// }

// public class strings {
// public static void main(String args[]) {
// StringBuilder sb = new StringBuilder("Hello");
// System.out.println(sb);
// }
// }

// Inserting & deletion

// public class strings {
// public static void main(String args[]) {
// StringBuilder sb = new StringBuilder("Tony");
// System.out.println(sb);

// sb.insert(0, "A"); // Insert
// System.out.println(sb);

// sb.delete(0, 1); // 1 is non-exclusive
// System.out.println(sb); // delete

// }
// }

// Append = means add at the end

// public class strings {
// public static void main() {
// StringBuilder sb = new StringBuilder("h");
// sb.append("e"); // str = str + "e";
// System.out.println(sb);
// sb.append("l");
// System.out.println(sb);
// sb.append("l");
// sb.append("O");
// System.out.println(sb);
// System.out.println(sb.length());
// }
// }

// REVERSE A STRING

// public class strings {
// public static void main(String args[]) {
// // StringBuilder sb = new StringBuilder("srishti");

// // StringBuilder sb = new StringBuilder(system.in);
// // String sb =

// for (int i = 0; i < sb.length() / 2; i++) {
// int front = i;
// int back = sb.length() - 1 - i;

// char frontChar = sb.charAt(front);
// char backChar = sb.charAt(back);

// sb.setCharAt(front, backChar);

// sb.setCharAt(back, frontChar);
// }
// System.out.println(sb);
// }
// }

// By taking input

// public class strings {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// // Take input as String
// System.out.print("Enter a string: ");
// String input = sc.nextLine();

// // Pass it to StringBuilder
// StringBuilder sb = new StringBuilder(input);

// // Reverse logic
// for (int i = 0; i < sb.length() / 2; i++) {
// int front = i;
// int back = sb.length() - 1 - i;

// char frontChar = sb.charAt(front);
// char backChar = sb.charAt(back);

// sb.setCharAt(front, backChar);
// sb.setCharAt(back, frontChar);
// }
// sc.close();
// System.out.println("Reversed string: " + sb);
// }
// }

public class strings {
    public static void main(String[] args) {
        System.out.print("Hello");
    }
}