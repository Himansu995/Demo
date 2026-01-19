// package LVTI;

// Types of classes :-
//               Abstract class (will be inherited)(cannot form object of it)
//               Final class(no one will inherit it)
//               Sealed Class(some can inheirt and some cannot)

// sealed class:- can be inhert by only permitted classes and
//                those must be final class/sealed/non-sealed class

class D{

}
interface E{ // interface have no objects no method body & only use for multiple inheritance

}
sealed class A extends D implements E permits B,C{

}
final class B extends A{

}
non-sealed  class C extends A{

}


// Sealed Interface:- same as class but can be inheirt by sealed or non-sealed interface bcz no final in interface

public class Inherit {
    public static void main(String[] args) {
        // 
    }
}
