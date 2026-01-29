
// 1.) Linear search in array

class linear {
    public static int linear_search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }

    public static void main(String args[]) {
        int arr[] = { 23, 45, 66, 77, 100, 120 };
        int target = 9100;

        int result = linear_search(arr, target);
        if (result != -1) {
            System.out.println("Found at index : " + result);
        } else {
            System.out.println("Not Found");
        }
        // System.out.println("Found at index : " + result);
    }
}

// 2.)Linear serach in strings

// class linear {
// public static boolean search(String str, char target) {
// if (str.length() == 0) {
// return false;
// }
// for (int i = 0; i < str.length(); i++) {
// if (target == str.charAt(i)) {
// return true;
// }
// }
// return false;
// }

// public static void main(String args[]) {
// String str = "sejal";
// char target = 'e';
// System.out.print(search(str, target));
// }
// }

// q/) In array range..........

// class linear {
// public static int searchInRange(int arr[], int target, int start, int end) {
// if (arr.length == 0) {
// return -1;
// }
// for (int i = start; i <= end; i++) {
// if (arr[i] == target) {
// return i;
// }
// }
// return -1;
// }

// public static void main(String args[]) {
// int[] arr = { 12, 34, 56, 73, 100, 89, 64 };
// int target = 89;
// int start = 1;
// int end = 6;

// // System.out.print(searchInRange(arr,target,start,end));

// int result = searchInRange(arr, target, start, end);
// if (result != -1) {
// System.out.print("Element found in given range : " + result);
// } else {
// System.out.print("Element not found at index");
// }
// }
// }
