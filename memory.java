// there are 2 memories stack memory(local variable like n1,n2,c1,result and store their values like n1-3,n2-4,c1-101(heap address) , result-7)
// second  is heap memory store the object(their instance variable, method name(add) only name data of method is in stack) 

class calculator{
    int a=10; //instance variable

    int sum(int n1,int n2){//local variable
        return n1+n2;
    }
}

public class memory {
    public static void main(String[] args) {
        int num1=3;
        int num2=4;

        calculator c1=new calculator();
        calculator c2=new calculator();

        c1.a=20;// this won't change value in c2 because c1 is seperate now in heap memory and same for c2
        System.out.println(c1.a);
        System.out.println(c2.a);

        int result=c1.sum(num1,num2);
    }
}
