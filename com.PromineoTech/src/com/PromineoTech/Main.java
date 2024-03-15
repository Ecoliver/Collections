package com.PromineoTech;
public class Main {

    public static void main(String[] args) {
        // Task 1
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int difference1 = ages[ages.length - 1] - ages[0];
        System.out.println("Difference: " + difference1);

        int[] ages2 = new int[9];
        // Task 1.b.i
        for (int i = 0; i < ages2.length; i++) {
            ages2[i] = (int) (Math.random() * 100);
        }
        // Task 1.b.ii
        int difference2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Difference in ages2: " + difference2);

        // Task 1.c
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = sum / ages.length;
        System.out.println("Average age: " + averageAge);

        // Task 2
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        // Task 2.a
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average letters per name: " + averageLetters);

        // Task 2.b
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

        // Task 3
        System.out.println("Last element of ages array: " + ages[ages.length - 1]);

        // Task 4
        System.out.println("First element of ages array: " + ages[0]);

        // Task 5
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Task 6
        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println("Sum of name lengths: " + sumOfNameLengths);

        // Task 7
        System.out.println(concatenateWordNTimes("Hello", 3));

        // Task 8
        System.out.println(createFullName("John", "Doe"));

        // Task 9
        int[] testArray = {20, 30, 60};
        System.out.println(isSumGreaterThan100(testArray));

        // Task 10
        double[] doubleArray = {10.5, 20.5, 30.5};
        System.out.println(calculateAverage(doubleArray));

        // Task 11
        double[] array1 = {10.5, 20.5, 30.5};
        double[] array2 = {5.5, 15.5, 25.5};
        System.out.println(isAverageGreaterThan(array1, array2));

        // Task 12
        System.out.println(willBuyDrink(true, 15.0));
    }

    // Task 7
    public static String concatenateWordNTimes(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word+" ");
        }
        return result.toString();
    }

    // Task 8
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // Task 9
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // Task 10
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Task 11
    public static boolean isAverageGreaterThan(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2);
    }

    // Task 12
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
}

