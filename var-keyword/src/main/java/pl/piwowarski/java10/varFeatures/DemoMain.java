package pl.piwowarski.java10.varFeatures;

import java.util.ArrayList;

public class DemoMain {

    // var keyword was introduced in Java 10

    public static void main(String[] args) {
        var message = "Hello, Java";
        var number = 42;

        System.out.println(message + "num: " + number);

        var list = new ArrayList<String>();

        list.stream().forEach(System.out::println);


        var longNumber = 30L;
        System.out.println(longNumber);

//        var nullExample = null; var cannot be null
//        public var add(var a, var b) {  // ❌ Not allowed
//            return a + b;  // it cannot be neither method parameter or return type
//        }
    
    }
}
