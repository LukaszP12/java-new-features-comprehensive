package pl.piwowarski.java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VarExample {
    public static void main(String[] args) {
        var names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        var maxLength = 4;

        for (var name : names) {
            System.out.println("Name: " + name);
        }

        System.out.println("---");

        Predicate<String> lengthFilter = (var name) -> name.length() > maxLength;

        // using the lambda
        var filtered = names.stream()
                .filter(lengthFilter)
                .collect(Collectors.toList());

    }
}
