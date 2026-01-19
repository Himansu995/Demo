// types of error:-
//                 1.Compile time error(like string here is small s)(compilation error)
//                 2.Run time error(like file is missing or some data is missing)(exception)
//                 3. Logical error(like some logic mistake or formula mistake so utput will be there but not as expected)


// object:-
//        Throwable:-
//                  1. Error(cann't be handled)
//                          a. thread error
//                          b. jvm error
//                  2. Exception
//                          a. Unchecked (compiler will handle it if we don't)(run time exception)
//                                    - ArithmeticException
//                                    - ArrayIndexOutOfBoundary
//                          b. Checked (we have to handle it)
//                                    - I/O exception
import java.lang.reflect.Array;
import java.util.*;

class HimansuException extends Exception{

    public HimansuException(String s) {
        super(s);
    }
    
}


public class Errors {
    public static void main(String[] args) {
        

        int a=2;
        int b=5;
        
        int arr[]=new int[3];
        try{
            b=b/a;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("do not divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("in limit only");
        }
        catch(Exception e){// for any  new error if happens
            System.out.println("something is wrong ..");
        }
        System.out.println(b); // give 5(previous value) if exception occurs else the try value
        System.out.println("Done");




        // creating own exceptions cases
        try{
            int xy=12/24;
            if(xy<=0) throw new ArithmeticException("have some mercy");
        }
        catch(ArithmeticException e){
            System.out.println("don't divide by greater element "+e);
        }
        // creating own exceptions 
        try{
            int xy=12/24;
            if(xy<=0) throw new HimansuException("have some mercy"); // need to make class named himansuexception
        }
        catch(HimansuException e){
            System.out.println("don't divide by greater element "+e);
        }
        



        //throws(it is different from throw)(here a void that has a exception will use it to tell that i have it but will not handle it who will use me will handle it)
        class A{
            void a() throws Exception{
                int j=10/0;
            }
        }
        class B extends A{
            void callA() {
                try {
                    a();  // calling parent method
                } catch (Exception e) {
                    System.out.println("I handled exception of class A");
                    e.printStackTrace();// to tell flow of inheritance type something
                }
            }
        }
        B b1=new B();
        b1.callA();


        // finally 
        try {
            
        } catch (Exception e) {

        } finally {
            // this will execute even if try works or not
        }
    }
}
