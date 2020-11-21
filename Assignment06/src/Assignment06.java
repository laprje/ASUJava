// CSE 110     : CSE 110
// Assignment  : Assignment06
// Author      : lansing jenkins
// Description : 10 array methods

public class Assignment06 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        printArray(myArray, ", ");
        printArray(myArray, " - ");
        getFirst(myArray);
        getLast(myArray);
        getAllButFirst(myArray);
        getIndexOfMin(myArray);
        getIndexOfMax(myArray);
        swapByIndex(myArray, 1, 4);
        removeAtIndex(myArray, 3);
        insertAtIndex(myArray, 2, 777);
        isSorted(myArray);

    }

    // 1) Write a public static method named printArray,
    //   that takes two arguments. The first argument is an Array of int
    //   and the second argument is a String. The method should print out
    //   a list of the values in the array, each separated by the value of the second argument.
    public static void printArray(int[] arr, String str) {
        String fullString = "";
        for(int i=0; i<arr.length; i++) {
            fullString += arr[i];
            fullString += str;
        }
        System.out.print(fullString);
    }


    // 2) Write a public static method named getFirst,
    //    that takes an Array of int as an argument and returns
    //    the value of the first element of the array.
    public static int getFirst(int[] arr) {
        return arr[0];
    }


    // 3) Write a public static method named getLast,
    //    that takes an Array of int as an argument and returns
    //    the value of the last element of the array.
    public static int getLast(int[] arr) {
        return arr[arr.length-1];
    }


    // 4) Write a public static method named getAllButFirst,
    //    that takes an Array of int as an argument and creates and returns
    //    a new array with all of the values in the argument array except the first value.
    public static int[] getAllButFirst(int[] arr) {
        int[] newArr = new int[arr.length -1];
        for(int i=1; i<arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }


    // 5) Write a public static method named getIndexOfMin,
    //    that takes an Array of int as an argument and returns
    //    the index of the least value in the array.
    public static int getIndexOfMin(int[] arr) {
        long lowest = 9999999;
        int lowestIdx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < lowest) {
                lowest = arr[i];
                lowestIdx = i;
            }
        }
        return lowestIdx;
    }


    // 6) Write a public static method named getIndexOfMax,
    //    that takes an Array of int as an argument and returns
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int[] arr) {
        long highest = 0;
        int highestIdx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > highest) {
                highest = arr[i];
                highestIdx = i;
            }
        }
        return highestIdx;
    }


    // 7) Write a public static method named swapByIndex,
    //    that takes three arguments. The first argument is an Array of int,
    //    and the second and third arguments are int indexes.
    //    This method will swap the values at the two given index arguments
    //    in the array, and return a reference to the array.
    public static int[] swapByIndex(int[] arr, int idx1, int idx2) {
        final int swapHold = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = swapHold;
        return arr;
    }


    //8) Write a public static method named removeAtIndex,
    //  that takes two arguments. The first argument is an Array of int,
    //  and the second argument is an int index. This method create and return
    //  a new array with all of the values in the argument array
    //  except the value at the argument index.
    public static int[] removeAtIndex(int[] arr, int idx) {
        int[] newArr = new int[arr.length-1];
        boolean pastIdx = false;
        for(int i=0; i<newArr.length; i++) {
            if(i == idx) {
                pastIdx = true;
            }
            if(pastIdx) {
                newArr[i] = arr[i+1];
            } else {
                if(i != idx) {
                    newArr[i] = arr[i];
                }
            }
        }
        return newArr;
    }


    //9) Write a public static method named insertAtIndex,
    //   that takes three arguments. The first argument is an Array of int,
    //   the second argument is an int index, and the third argument is an int value.
    //   This method create and return a new array with all of the values
    //   in the argument array and including the third argument value
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int[] arr, int idx, int val) {
        int[] newArr = new int[arr.length+1];
        boolean pastIdx = false;
        for(int i=0; i<newArr.length; i++) {
            if(i == idx) {
                pastIdx = true;
                newArr[i] = val;
            }
            else if(i != idx && pastIdx == true) {
                newArr[i] = arr[i-1];
            } else {
                if(i != idx) {
                    newArr[i] = arr[i];
                }
            }
        }
        return newArr;
    }


    //10) Write a public static method named isSorted,
    //    that takes an Array of int as an argument.
    //    This method should return the boolean value true
    //    if all the element values in the array are in ascending order;
    //    otherwise the method should return the boolean value false.
    public static boolean isSorted(int[] arr) {
        for(int i=1; i<arr.length-1; i++) {
            if(arr[i-1] > arr[i] || arr[i] < arr[i+1]) {
                return false;
            }
        }
        return true;
    }


}
