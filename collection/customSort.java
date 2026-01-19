//package collection;

import java.util.*;

// for direct sort need to inherit comparable
class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "Student [ age=" + age + ",name=" + name +"]" ;
    }


    // if wanna use directly Collections.sort(num);
    // public int compareTo(Student that){
    //     if(this.age>that.age){
    //         return 1;
    //     }
    //     else return -1;
    // }
}

public class customSort {
    public static void main(String a[]){
         List<Student> num=new ArrayList<>();
         num.add(new Student(21, "Himansu"));
         num.add(new Student(23, "Hima"));
         num.add(new Student(28, "Himu"));

        for(Student s:num)
            System.out.println(s);

        // Comparator<Student> com=new Comparator<Student>() {
        //     public int compare(Student i, Student j){
        //         if(i.age>j.age) return 1;
        //         else return -1;
        //     }
        // };  
        Comparator<Student> com=(i,j)->i.age >j.age?1:-1;

        Collections.sort(num,com);  
        for(Student s:num)
            System.out.println(s);       
    }
}
