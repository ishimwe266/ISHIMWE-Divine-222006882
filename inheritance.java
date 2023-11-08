// Define a class named PRINE
class PRINE {
    // Define a method 'c' that takes a character 'd' as a parameter
    void c(double d){
        System.out.println("hello");
    } 
}
// Define a class named A that extends PRINE
class A extends PRINE{
     // Define a method 'kan' that takes a character 's' as a parameter
void kan(double s){
    System.out.println("welcome");
}
}
// Define a class named B that extends PRINE
  class B extends PRINE{
    // Define a method 'kas' that takes a character 'k' as a parameter
    void kas(double k){
        System.out.println("thank fo today");
    }
  }
  class C extends B{
    void kam(int p){
        System.out.println("morning");
    }
  }
  class ved extends C{
    void marks(double q){
        System.out .println("hello");
    }
  }

interface MyInterface {
    void interfaceMethod();
}

class InterfaceClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("InterfaceClass's interfaceMethod called");
    }
}
public class inheritance {
    public static void main(String[] args) {
        // Create objects of each class
        InterfaceClass interfaceObj = new InterfaceClass();
        A subA = new A();
        B subb = new B();
        C subc= new C();
        

        // Call methods on the objects
       
           subA. c(5);
        subA.kan(2);
        subb.kas(2);
        subc.kam(3);
    
         interfaceObj.interfaceMethod();
    }}