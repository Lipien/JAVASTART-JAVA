package exercisesandtests.interfacesinheritancewiththesamemethodssignature;

public class TestClass implements One, Two {

    //Overrading the same signature default methods with super
    @Override
    public void show() {
        One.super.show();
        Two.super.show();
    }

    public static void main(String[] args) {
        TestClass d = new TestClass();
        d.show();
    }
}
