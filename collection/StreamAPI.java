
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        
        List<Integer> nums= Arrays.asList(4,3,2,6,5,7);

        // to print we have 3 ways
        for(int n:nums){
            System.out.println(n);
        }
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
        nums.forEach(n-> System.out.println(n));

        Consumer<Integer> con= n-> System.out.println(n);
        nums.forEach(con);



        // if we wanna apply some conditions on the nums we can do it by if else type something 
        // But Stream provides them in better way

        //Stream(nums will remain same and we can do wahtever we wanna with stream)
        // *******we can use stream only once ********

        Stream<Integer> s1=nums.stream();
        //s1.forEach(n->System.out.println(n));

        Stream<Integer> s2=s1.filter(n->n%2==0); // now we cannot use s1 again
        // s2.forEach(n->System.out.println(n)); // now we cannot use s2 again

        Stream<Integer> s3=s2.map(n->n*2);
        int result=s3.reduce(0, (c,e)->c+e);
        System.out.println(result);

        // Short way
        int res=nums.stream()
            .filter(n->n%2==0)
            .map(n->n*2)
            .reduce(0,(c,e)->c+e); // 0 is like initial value 0+etc
                                            // for c*e 1 will be initial val

        System.out.println(res);   
        
        
        Stream<Integer> s4=nums.stream()
            .sorted();

        s4.forEach(n->System.out.println(n));

        // for using multiple streams 
        nums.parallelStream()
            .forEach(n -> {
                System.out.println(n + " - " + Thread.currentThread().getName());
            });

    }
}
