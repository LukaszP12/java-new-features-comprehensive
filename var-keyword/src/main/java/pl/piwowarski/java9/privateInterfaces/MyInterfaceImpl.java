package pl.piwowarski.java9.privateInterfaces;

class MyInterfaceImpl implements MyInterface{
    @Override
    public void method1() {
        MyInterface.super.method1(); // as it is a default method(), we can call it like this
    }

    @Override
    public void method2() {
        MyInterface.super.method2();
    }
}
