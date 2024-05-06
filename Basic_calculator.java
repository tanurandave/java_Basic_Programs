//Basic calulator
class Calculate{
    public void addition(int a,int b){
        int result=a+b;
        System.out.println("Addition is: "+result);
    }
public void sub(int a,int b){
        int result=a-b;
        System.out.println("substraction is: "+result);
    }
public void mult(int a,int b){
        int result=a*b;
        System.out.println("multiplication is: "+result);
    }
public void division(int a,int b){
        int result=a/b;
        System.out.println("division is: "+result);
    }
}
public class Basic_calculator{
    public static void main(String args[]){
        Calculate c1=new Calculate();
        c1.addition(10,20);
        c1.sub(10,20);
        c1.mult(10,20);
        c1.division(10,20);
    }
}
