//interface
interface E {
    void warld ();
}
class A extends B implements E { //class A extend B implements E
   public void world (){
        System.out.println("earth");

    }
    public void continent () {
        System.out.println("america");
    }
}
//Class B extends C
class B extends C {
public void africa (){
    System.out.println("rwanda");
}
}
//Class C extends D
class C extends D {
    public void aurope(){
        System.out.println("england");
    }
}
//class D
class D {
    public void asia(){
        System.out.println("china");
    }
}
//main class
public class inhertance3{
    public static void main(String[]args){
        //object main
        A Object =new A ();
      Object.continent();//methods calling
      Object.africa();
      Object.aurope();
      Object.asia();
}
}
