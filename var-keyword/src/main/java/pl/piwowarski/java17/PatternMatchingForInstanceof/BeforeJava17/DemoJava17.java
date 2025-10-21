package pl.piwowarski.java17.PatternMatchingForInstanceof.BeforeJava17;

class DemoJava17 {
    public static void main(String[] args) {
        Object obj = "Hello Java";

        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }
    }
}
