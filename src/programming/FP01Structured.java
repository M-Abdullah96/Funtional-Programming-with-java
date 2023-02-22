package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> number = List.of(12, 13, 4, 6, 2, 12, 4, 5, 8);
        //printAllNumbersInListStructured(number);
        printEvenNumbersInListStructured(number);
    }

    private static void printAllNumbersInListStructured(List<Integer> integerList) {
        //How to print the numbers of the list?
        //method 01
        for(int number: integerList){
            System.out.println(number);
        }

    }
    private static void printEvenNumbersInListStructured(List<Integer> integerList) {
        //How to print the numbers of the list?
        for(int number: integerList){
            if(number%2==0){
                System.out.println(number);
            }

        }

    }
}
