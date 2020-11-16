// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>

public class Assignment05 {

    public static void main(String[] args) {
        // Codes below will test your methods:
        displayGreeting();
        displayText("test");
        printTotal(1,2,3);
        int total = getTotal(1,2,3);
        System.out.println(total);
        double average= getAverage(1,2,3);
        System.out.println(average);
        average= averageLength("test","test21", "testtest");
        System.out.println(average);
        int shortest = lengthOfShortest("test","test21");
        System.out.println(shortest);
        String stars=stringOfStars("test");
        System.out.println(stars);
        stars=maxStringOfStars("test","test21");
        System.out.println(stars);
        stars=midStringOfStars("test","test21", "testtest");
        System.out.println(stars);

    }

    // 1) Write (define) a static method named displayGreeting,
    //  that takes no arguments and returns no value.
    //  When this function is called, it should print the text "Hello, and welcome!".
    public static void displayGreeting(){
        System.out.println("Hello, and welcome!");
    }


    //2) Write (define) a static method named displayText,
    //  that takes a single String argument and returns no value.
    //  When this function is called, it should print the value of the argument that was passed to it.
    public static void displayText(String argument) {
        System.out.println(argument);
    }


    //3) Write (define) a static method named printTotal,
    //  that takes three int arguments.
    //  When this function is called, it should print the sum of the three arguments passed to it.
    //  This function should return no value.
    public static void printTotal(int one, int two, int three) {
        int total = one+two+three;
        System.out.println(total);
    }


    //4) Write (define) a static method named getTotal,
    //  that takes three int arguments.
    //  When this function is called, it should return the sum
    //  of the three arguments passed to it as an int.
    public static int getTotal(int one, int two, int three) {
        int total = one+two+three;
        return(total);
    }


    //5) Write (define) a static method named getAverage,
    //  that takes three int arguments.
    //  When this function is called, it should return the average
    //  of the three arguments passed to it as a double.
    public static int getAverage(int one, int two, int three) {
        int average = (one+two+three)/3;
        return average;
    }


    //6) Write (define) a static method named averageLength,
    //  that takes three String arguments.
    //  When this function is called, it should return the average length (number of characters)
    //  of the String arguments passed to it as a double.
    public static int averageLength(String one, String two, String three) {
        int One = one.length();
        int Two = two.length();
        int Three = three.length();
        int average = (One+Two+Three)/3;
        return average;
    }


    //7) Write (define) a static method named lengthOfShortest,
    //  that takes two String arguments. When this function is called,
    //  it should return the length (number of characters)
    //  of the shortest String argument passed to it as an int.
    public static int lengthOfShortest(String one, String two) {
        if(one.length() > two.length()) {
            return two.length();
        }
        else {
            return one.length();
        }
    }


    //8) Write (define) a static method named stringOfStars,
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*)
    //  that is the same length as the string argument passed to it.
    public static String stringOfStars(String one) {
        String str = "";
        for(int i=1; i<=one.length(); i++) {
            str += "*";
        }
        return str;
    }


    //9) Write (define) a static method named maxStringOfStars,
    //  that takes two String arguments.
    //  When this function is called, it should return a String of asterisks (*)
    //  that is the same length as the longest string argument passed to it.
    public static String maxStringOfStars(String one, String two) {
        String str = "";
        int x;
        if(one.length() > two.length()) {
            x = one.length();
        } else {
            x = two.length();
        }
        for(int i=1; i<=x; i++) {
            str += "*";
        }
        return str;
    }


    //10) Write (define) a static method named midStringOfStars,
    //   that takes three String arguments.
    //   When this function is called, it should return a String of asterisks (*)
    //   that is the same length as the string argument with the length
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
    public static String midStringOfStars(String one, String two, String three) {
        int x = 0;
        String str = "";
        if(one.length() > two.length() && one.length() < three.length()) {
            x=one.length();
        } else if(one.length() > three.length() && one.length() < two.length()) {
            x=one.length();
        } else if(two.length() > one.length() && two.length() < three.length()) {
            x=one.length();
        } else if(two.length() > three.length() && two.length() < one.length()) {
            x=one.length();
        } else if(three.length() > two.length() && three.length() < one.length()) {
            x=one.length();
        } else if(three.length() > one.length() && three.length() < two.length()) {
            x=one.length();
        }
        for(int i=1; i<=x; i++) {
            str += "*";
        }
        return str;
    }


}
