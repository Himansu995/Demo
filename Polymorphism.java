class A{
    final void show(){
        System.out.println("this is A");
    }
    void hello(){
        System.out.println("A");
    }
}
class B extends A{
    // FINAL
    // METHOD:- now cannot override the method show bcz it is final and secured
    // CLASS:- same for class if we use final word in class like "final class A" then cannot inherit A class
    // Variable:- cannot change it value(like const of c++)

    void hello2(){
        System.out.println("B");
    }
}

// to use abstract method we have to make class abstract not vise-versa
// abstract method is used to just say that this is a method but the class which will inherit me will declare it work
// it is compulsary that the class which inherit the Car must declare the drive method else error
// && cannot create the object of abstract class ************
abstract class Car{
    abstract void drive();
}
class Suv extends Car{
    void drive(){
        System.out.println("this is SUV");
    }
}


//Class inside Class
// cannot create object of Boys directly
// 1. create object of Human (Human h1=new Human())
// 2. now create object for Boys (Human.Boys b1=h1.new Boys())
// if wanna make  class static that can be inner class only
class Human{
    int age;
    void hello(){
        System.out.println("hello");
    }

    class Boys{
        void hello2(){
            System.out.println("Yo");
        }
    }
}



public class Polymorphism {
    public static void main(String[] args) {

        // 1. compile time polymorphism (method overloading)
        // 2. run time polymorphism(method overriding)
        // in this like class A has method see() and B extends A and B aslo have see() then if object of B is cretaed it will execute see() of B only 
        // && yes here see() has same input parameters and same name and same return type also possible but output will be different 

        // TypeCasting in object
        // A a1 = new B(); // it has default type casting of (A)
        // A a2 = new A();
        // a2= (B) a2;
        // a1.hello();
        // // a1.hello2(); gives error
        // a2.hello();
        // // a2.hello2();


        // Wrappered Object(like objects of int, bool,float etc)
        // Integer i=new Integer(5); 
        // int i2=4;
        // Integer i1=new Integer(i2); // boxing (storing preemitive value(i2) in the wrapped object)
        // Integer i4=i2;// this is auto-boxing
        // int i5=i4; // auto-unboxing
        String s1="23";
        int i6=Integer.parseInt(s1);
        System.out.println(i6);


        // Anomynous class
        // inbuilt overriding without crearting new class
        // it will create the class file named polymorphism(our java file name )$1(bcz it is not a proper class defined)
        // it will save us from creating new class 
        // this is bests for abstract class bcz it object cannot be created directly but by this method that will be easy
        Human h2=new Human(){
            void hello(){
                System.out.println("hello i am overriden");
            }
        };
        h2.hello();

    }
}
