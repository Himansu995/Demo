// Encapsulation(like hiding some data , keeping variables and methods together in class etc)

class human{
    // protected is only used in the same class only 
    private int age;
    private String name;

    // getter and setter
    void getage(){
        System.out.println(age);
    }
    void setage(int a){
        age=a;
        // for input age(local)
        // this.age=age; (this keyword will tell that the age is instance variable here)(this referes to the current object)
    }
    void getname(){
        System.out.println(name);
    }
    void setname(String name){
        this.name=name;
    }


    // constructor with method overloading
    human(){
        this.age=0;
        this.name="";
    }
    human(int age){
        this.age=age;
        this.name="";
    }
    human(String name){
        this.age=0;
        this.name=name;
    }
    human(int age,String name){
        this.age=age;
        this.name=name;
    }

    // dispaly
    void dispaly(){
        System.out.println("age is :"+age+", name is :"+name);
    }
}


// super && inheritance(is(it is like B is A) ,has(it like Human has age,name))
// multi-level inheritance is possible but multi-inheritance is not possible (c extends a,b is not possible)
// this is ambiguity problem(if c use a method y but it is in both a,b so cannot decide which to use)
class A{
    // this constructor will also be called with creating object of class B
    // it is bcz even if we don't declare each constructor have  a method named super() that calls default constructor of parent class
    A(){
        // super() it is here as default
        System.out.println("this is class A constructor");
    }
    A(int a){
        System.out.println("In A a is :"+a);
    }
}
class B extends  A{
    B(){
        // super() default
        // super(5) if wanna use parameterized constructor of A
        System.out.println("this is class B constructor");
    }
    B(int a){
        // super() default
        // use super(a) if wanna call the parameterized constructor of parent class
        // this() if wanna call default constructor of B also in parametrized
        // ***************can only call this() or super() or super(a) in 1 constructor
        super(a);
        System.out.println("In B a is :"+a);
    }
}

public class Encapsul {
    public static void main(String[] args) {

        human h1=new human();
        h1.setage(10);
        h1.setname("Himansu");
        h1.getage();
        h1.getname();

        human h2=new human(20,"Himansu Sheoran");
        h2.getage();
        h2.getname();

        h2.dispaly();



        B b1=new B();
        B b2=new B(3);

        new B();// anonymous objects(no refernce & no reuse)
    }
}
