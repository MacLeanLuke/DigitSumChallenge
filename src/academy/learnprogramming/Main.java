package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
        System.out.println(sumDigits(125));
    }
    //        Write a method with the name sumDigits that has one int parameter called number.
    public static int sumDigits(int number){
//        If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//        The numbers from 0-9 have 1 digit so we donÅft want to process them, also we donÅft want to process negative numbers, so also return -1 for negative numbers.
//        Calling the method sumDigits(1) should return -1 as per requirements described above.
        if (number < 10){
            return -1;
        }
//        For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//        Use n % 10 to extract the least-significant digit.
//        Use n = n / 10 to discard the least-significant digit.
        int total = 0;
        while (number>0){
            int single = number % 10;
            number /= 10;
            total += single;
        }
        return total;
    }
}
