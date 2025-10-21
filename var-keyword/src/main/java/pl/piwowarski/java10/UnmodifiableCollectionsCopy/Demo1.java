package pl.piwowarski.java10.UnmodifiableCollectionsCopy;

import java.util.List;

class Demo1 {
    public static void main(String[] args) {
        List<String> original = List.of("A", "B");
        List<String> copy = List.copyOf(original);
    }
}
