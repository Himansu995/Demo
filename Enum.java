// Enum are for constants
// no inheritance

enum  Status{
    Processing , Failed , Successful;
}


enum Laptop{
    hp(1000), mac(2000);

    private int price;

    private Laptop(int price){
        this.price=price;
    }
}


public class Enum {
    public static void main(String[] args) {
        Status s1=Status.Failed;
        System.out.println(s1);
        System.out.println(s1.ordinal()); // it indexing in enum

        Status[] s2=Status.values();
        System.out.println(s2[2]);


        Laptop l1=Laptop.hp;
        System.out.println(l1);
    }
}
