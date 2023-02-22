package programming;

import java.util.List;

public class FP01Excercises {
    public static void main(String[] args) {
        List<Integer> number = List.of(12, 13, 4, 6, 2, 12, 4, 5, 8);
        //printOddNumbersInListStructured(number);
        List<String > stringList=List.of("Spring","Spring Boot" ,"Microservices","AWS", "PCF", "Azure", "Docker" );
        //stringList.stream().forEach(System.out::println);
        /*stringList.stream()
               // .filter(course->course.contains("Spring"))
                .filter(course->course.length()>=4)
                .forEach(System.out::println);*/

        //printCubesOfOddNumbersInListStructured(number);
        stringList.stream().map(course->course+" "+course.length())
                .forEach(System.out::println);
    }

    private static void printOddNumbersInListStructured(List<Integer> integerList) {
        integerList.stream()
                .filter(number->number%2!=0)
                .forEach(System.out::println);

    }
    private static void printCubesOfOddNumbersInListStructured(List<Integer> integerList) {
        integerList.stream()
                .filter(number->number%2!=0)
                .map(number->number*number*number)
                .forEach(System.out::println);

    }
}
