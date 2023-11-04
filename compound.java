public class compound{
    public static double compound(double p,double r,double t,double n){
        double result=p*Math.pow(1+(r/n),n*t);
        return result;
  
  }
public static void main(String[] args) {
    compound f1=new compound();
    double compound=f1.compound(500000,0.18,3,12);
    System.out.println("the compound interest of mr bob is"+" "+compound);
}
}
