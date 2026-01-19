// our app. is platform independent but jvm is platform dependent
// JVM need bytecode so our code converted into it and JVM always need a "main" file to run
// JVM is part of JRE(java runtime environment) that connect to os then hardware
// JVM + lib = JRE 


// datatypese:- 
// int(4 byte) short(2) byte(1)
// by default is double if wanna use float a=0.5f; neeed to mention this f else error
// char take 2 byte and follows unicode(all language characters)
// boolean take truee and false not 0 1 and no bool need boolean for defining



//  Camel casing
// Class,Inheritance :- Human(1st capital then small)
// method, variable :- show, showMyName (small & if more than 1 words then 1st capital of next words)
// constant :- PIE, NEWTON_CONSTANT(all capital) 




class student{
    int age;
    String name;
}

class phone{
    int cost;
    String name;
    // Static (it means that that particular instance variable will be same for all object if we change it at any object then it will be changed for each object)
    static String type;

    void printdata(){
        System.out.println("cost is :"+ cost +", name is :"+name+", type is :"+type);
    }

    static void printdata1(){
        // it can only access the static variables bcz it will be executed with the class not the object
        System.out.println("type is: "+type);
        // and can only be called with class
        // phone.printdata1();
    }
}

class phone2{
    int cost;
    String name;
    static String type;

    // and static block will be executed first before the constructor
    static {
        type="android";
        // this will be called at once irrespective of how many objects we create
        // it is because in jvm class is loaded only once (if wanna load the class twice(add a system.println in static to check if loaded 2times) use class.forname("classname") but with try and catch bcz throws exception)
    }

    phone2(){
        cost=00;
        name="";
        // type="android"; but it is static so no need to call each time with object creating
    }

    void printdata(){
        System.out.println("cost is :"+ cost +", name is :"+name+", type is :"+type);
    }
}

public class hello {
    void getdata() {
        System.out.println(6);
    }

    public static void main(String[] args) {
        hello h1 = new hello();
        h1.getdata(); // This prints 6

        //laterals
        int a = 0b0101 ;
        int a2=0x2E;
        int a3=100_00_00_000;

        //casting
        int a4=257;// out of range for byte
        byte b=1;
        a4=b;//allowed bcz int size is bigger
        b=(byte)a4;// so byte is -128 to 127 so total 256 so b=a4%256



        //array
        int n1[]={1,2,3,4};
        int n2[]=new int[4];// all values will be 0 until defined
        // 2D array
        int n3[][]= new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                n3[i][j]=(int)(Math.random()*100);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(n3[i][j]+" ");
            }
            System.out.println("");
        }


        // ********************JAGGED ARRAY(different size of column)********
        System.out.println("");
        int n4[][]= new int[3][];
        n4[0]=new int[4];
        n4[1]=new int[3];
        n4[2]=new int[2];
        for(int i=0;i<n4.length;i++){
            for(int j=0;j<n4[i].length;j++){
                n4[i][j]=(int)(Math.random()*100);
            }
        }
        for(int n[] : n4){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println("");
        }


        // **************object array**********
        student s1=new student();
        s1.age=12;
        s1.name="himansu";
        student s2=new student();
        s1.age=13;
        s1.name="himanshi";
        student s3=new student();
        s1.age=12;
        s1.name="himanshu";

        student stu[]=new student[3];
        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;


        // String(are immutuable(in java , python)(mutuable in c++,c))
        String name=new String("Himansu");
        System.out.println(name.charAt(2));
        System.out.println(name + " Sheoran");
        System.out.println(name.concat(" Sheoran"));

        // String constant pool (this is in heap memory when we create the new string it will be new in stack but in heap it will check if same string exists or not.
        //                       if yes then same address will be used in stack to point it )
        String st1="Himansu";
        String st2="Himansu";// for st2 no extra space in heap memory but in stack it will take new space and map it address to same as st1 in heap
        String st3="himansu"; // this is new string so new space in heap memory

        st3= st3+" sheoran"; // this will take new space at new address at heap memory && 
                            //  after some time the initial value of st3 will be removed by garbage collector from heap memory


        // String Buffer/Builder(to make it mutuable) (but builder is not thread safe but better in performance)
        StringBuffer sb1=new StringBuffer("Himanshu") ;
        System.out.println(sb1.capacity()); // give size+16 (these 16 bcz if we don't keep extra space then if we do modify then maybe we have to shift it to new address)
        System.out.println(sb1.length());

        sb1.deleteCharAt(6);
        System.out.println(sb1);
        sb1.insert(7, " Sheoran");
        System.out.println(sb1); //etc


        // Static (it means that that particular instance variable will be sam efor all object if we change it at any object then it will be changed for each object)
        // it should be called with class name (object name is also okay but class name will be better)
        phone p1=new phone();
        p1.cost=1000;
        p1.name="samsung";
        p1.type="Android";

        phone p2=new phone();
        p2.cost=2000;
        p2.name="vivo";

        p1.printdata();
        p2.printdata();

        phone p3=new phone();
        p3.cost=4000;
        p3.name="iphone";
        phone.type="Apple";

        p1.printdata();
        p2.printdata();
        p3.printdata();
    }
}
