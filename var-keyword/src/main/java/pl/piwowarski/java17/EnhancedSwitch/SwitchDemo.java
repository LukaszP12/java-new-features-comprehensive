package pl.piwowarski.java17.EnhancedSwitch;

import pl.piwowarski.java17.SealedClasses.Circle;
import pl.piwowarski.java17.SealedClasses.Shape;
import pl.piwowarski.java17.SealedClasses.Square;

class SwitchDemo {
    public static void main(String[] args) {

        Shape shape = new Circle();

        switch (shape) {
            case Circle c -> System.out.println("Circle");
            case Square s -> System.out.println("Square");
            default -> System.out.println("Unknown shape");
        }
    }
}
