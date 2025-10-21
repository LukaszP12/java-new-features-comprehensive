package pl.piwowarski.java17.PatternMatchingForInstanceof.AfterJava17;

class DemoJava17Plus {
    public static void main(String[] args) {
        Object obj = "Hello Java";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
