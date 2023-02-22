package programming;

import java.util.List;
public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 13, 4, 6, 2, 12, 4, 5, 8);
        //printAllNumbersInListFunctional(numbers);
        //printEvenNumbersInListFunctional(numbers);
        printSquaresOfNumbersInListFunctional(numbers);
    }

    public static void print(int number) {
        System.out.println(number);
    }
    public static void square(int number){
        System.out.println(number*number);
    }
    public static boolean isEven(int number){
        return number%2==0;
    }
    private static void printAllNumbersInListFunctional(List<Integer> integerList) {
        //How to print the numbers of the list?
        //we will be using streams for that
       integerList.stream().forEach(FP01Functional::print);
       //integerList.stream().forEach(System.out::println);
        //integerList.stream().forEach(it-> System.out.println(it));
        //integerList.stream().forEach(FP01Functional::square);

    }
    private static void printEvenNumbersInListFunctional(List<Integer> integerList) {
       integerList.stream()
              // .filter(FP01Functional::isEven) //by using method referance
               .filter(number->number%2==0)  //by using lambda expression // what to check
               .forEach(FP01Functional::print);  // what to do

    }
    private static void printSquaresOfNumbersInListFunctional(List<Integer> integerList) {
       integerList.stream()
               .filter(number->number%2==0)
               .map(numbers->numbers*numbers)
               .forEach(FP01Functional::print);  // what to do

    }
}
