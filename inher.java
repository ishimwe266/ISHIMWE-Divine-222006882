// Define an interface
interface MyInterface {
    void interfaceMethod();
}

// Create a class that implements the interface
class InterfaceClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("hello");
    }
}

// Create a superclass
class SuperClass {
    void superMethod() {
        System.out.println("kigali");
    }
}

// Create a subclass that extends SuperClass
class SubClass extends SuperClass {
    void subMethod() {
        System.out.println("name");
    }
}

// Create another class
class AnotherClass {
    void kam2() {
        System.out.println("vedaste");
    }
}

public class inher {
    public static void main(String[] args) {
        // Create objects of each class
        InterfaceClass interfaceObj = new InterfaceClass();
        SubClass subObj = new SubClass();
        AnotherClass anotherObj = new AnotherClass();

        // Call methods on the objects
        interfaceObj.interfaceMethod();
        subObj.superMethod();
        subObj.subMethod();
        anotherObj.kam2();
    }
}
