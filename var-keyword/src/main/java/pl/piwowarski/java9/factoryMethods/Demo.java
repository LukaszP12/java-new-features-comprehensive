package pl.piwowarski.java9.factoryMethods;

import java.util.List;
import java.util.Map;
import java.util.Set;

class Demo {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C", "D");
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");
    }
}
