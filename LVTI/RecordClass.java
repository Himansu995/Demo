

// Some class are used for only getting or providing data to client from database



// class Human{
//     private final int age;
//     private final String name;

//     public Human(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() { // without this direct printing h1 will give hex code
//         StringBuilder sb = new StringBuilder();
//         sb.append("Human{");
//         sb.append("age=").append(age);
//         sb.append(", name=").append(name);
//         sb.append('}');
//         return sb.toString();
//     }

//     @Override
//     public int hashCode() {
//         int hash = 7;
//         hash = 23 * hash + this.age;
//         hash = 23 * hash + Objects.hashCode(this.name);
//         return hash;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) {
//             return true;
//         }
//         if (obj == null) {
//             return false;
//         }
//         if (getClass() != obj.getClass()) {
//             return false;
//         }
//         final Human other = (Human) obj;
//         if (this.age != other.age) {
//             return false;
//         }
//         return Objects.equals(this.name, other.name);
//     }
// }


 // For all these lines of code just use::-
 
// This is canonical Constructor (means same order for default constructor age,name)
record Human(int age,String name){
    //1. agea nd name are final
    //2. it is compulsary to pass values in default else use
    Human(){
        this(0,"");
    }    
} 

public class RecordClass {
    public static void main(String[] args) {
        Human h1=new Human(20, "Himansu");
        System.out.println(h1); 
        Human h2=new Human(20, "Himansu");
        System.out.println(h1.equals(h2));


        Human h3=new Human();
        System.out.println(h3); 
    }
}
