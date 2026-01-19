package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class collectionAPI {
    public static void main(String[] args) {
        // 1. collection api :- concept
        //2. collection :- interface
        //3. collections :- class

//ITERATOR:-
        // collection:-
        //           list:- arraylist,linklist
        //           queue:-dequeue
        //           set:- hashedset, linked hashset
        // collection api:-map, all collections , all other things 

        
        // storing objects 
        Collection nums=new ArrayList();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        System.out.println(nums);

        //storing any type specific
        Collection<Integer> nums1=new ArrayList<Integer>();
        nums1.add(3);
        nums1.add(3);
        nums1.add(3);
        for(int i:nums1){
            System.out.println(i);
        }

        // there is no indexing in collection
        List<Integer> num2 = new ArrayList<Integer>();
        num2.add(66);
        num2.add(58);
        num2.add(49);
        num2.add(49);
        System.out.println(num2.get(1));

        // set stores only unique  
        //        Hashset stores in any order
        //        treeset stores in sorted form
        Set<Integer> num3 = new HashSet<Integer>();
        num3.add(6);
        num3.add(5);
        num3.add(4);
        num3.add(5);
        System.out.println(num3);

        Set<Integer> num4 = new TreeSet<Integer>();
        num4.add(6);
        num4.add(5);
        num4.add(4);
        num4.add(5);
        Iterator<Integer> val=num4.iterator();
        while(val.hasNext())
            System.out.println(val.next());
        

        // hashmap and hashtable for sync.
        Map<String , Integer> students=new HashMap<>();
        students.put("himansu",99);
        students.put("mohit",33);
        students.put("rohit",90);
        students.put("mohit",98); // this will update last value
        System.out.println(students); // getkey,replace,remove etc methods

        for(String key: students.keySet()){
            System.out.println(key+":"+students.get(key));
        }







        // collections
        Collections.sort(num2);
        System.out.println(num2); 

        // user defined sorting (sort based on last digit of number)
        Comparator<Integer> com=new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10 > j%10) return 1; // will swap
                else return -1;
            }
        };
        Collections.sort(num2,com);
        System.out.println(num2);
    }
}
