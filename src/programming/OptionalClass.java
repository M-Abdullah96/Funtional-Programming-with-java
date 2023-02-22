package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClass {

    public static void main(String[] args) {
        List<String> fruits= List.of("Apple", "Bnana", "Orange","Pine Apple");

        Predicate<? super String> predicate = item->item.startsWith("B"); //this is lambda function that will be used to filter out the items from the fruits list
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Optional<String> optionalFruit= Optional.of("Banana");
        Optional<String> optionalEmpty= Optional.empty();

        System.out.println("Optional class: "+optionalFruit);
        System.out.println("Optional empty class: "+optionalEmpty);
    }
}
