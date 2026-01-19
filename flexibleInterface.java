// all these can be used (so flexiable)

// Interface is same as abstract class it can have abstract methods 
// class->class extends
// class->interface implements
// interface->interface extends
// *******multi inheritance is possible in interface but not in simple classes
// abstract class Computer{ // no need for abstract just use interface

interface Computer{

    // all variables are static and final so need to define values also else error
    int age=12; 

    //abstract void code();
    //all methods are by default abstract
    void code();
}
class Laptop implements Computer{
    // **************in interface implemented we need to make the void public
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run: faster");
    }
}
// any input can be accepted 
class Developer{
    void appdev(Computer c){
        c.code();
    }
}

interface cal{
    int sum(int i,int j);
}


// Types of Interface:-(methods are by defult abstract)
// 1. normal (>=2 methods)
// 2. SAM(single abstract method)/Functional (exactly 1 method)
// 3. Marker(0 methods)(it is usefully in loading data like in games)(Serialization(data first saved in the hard disk)& Deserialization(then load to game))


public class flexibleInterface {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        Desktop d1=new Desktop();

        Developer dev1=new Developer();
        dev1.appdev(d1);
        dev1.appdev(l1);



        // ********* lamda function(shortcut for abstract function/interface like anomynous object)
        // Computer c1=new Computer() {
        //     public void code(){
        //         System.out.println("hello");
        //     }
        // };
        Computer c1=()->{
            System.out.println("hello");
        };
        // if code is 1 liner and also return type
        cal cal1= (i,j)->i+j;
        System.out.println(cal1.sum(6, 9));

    }
}
