package pl.piwowarski.java9.privateInterfaces;

interface MyInterface {
    default void method1() {
        commonLogic("Method 1");
    }

    default void method2() {
        commonLogic("Method 2");
    }

    // Private helper method
    private void commonLogic(String caller) {
        System.out.println("Called from: " + caller);
    }
}
