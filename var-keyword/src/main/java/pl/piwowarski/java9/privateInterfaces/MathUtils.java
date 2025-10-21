package pl.piwowarski.java9.privateInterfaces;

interface MathUtils {
    static int addAndLog(int a, int b) {
        log(a, b);
        return a + b;
    }

    private static void log(int a, int b) {
        System.out.println("Adding: " + a + " + " + b);
    }
}
