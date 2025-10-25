package pl.piwowarski.java5.stringFormat;

class Main {
    public static void main(String[] args) {
        String message = String.format("Hello %s, you scored %d points.", "Alice", 95);
        System.out.println(message);

        String result = String.format("%.2f", 3.14159);
        System.out.println(result);

        String result2 = String.format("%05d", 42); // 00042
        System.out.println(result2);

        String format6 = String.format("0110d", 99);
        System.out.println(format6);

        String result3 = String.format("%,d", 1000000); // 1,000,000
        System.out.println(result3);

        String result4 = String.format("|%10s|", "Java"); // right-aligned
        System.out.println(result4);

        String result5 = String.format("|%-10s|", "Java"); // left-aligned
        System.out.println(result5);

        String format = String.format("%+10d", 99);
        System.out.println(format);
    }
}
