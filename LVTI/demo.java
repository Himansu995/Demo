// Local Variable Type Inference

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        
        // java provides var to make any type of object which can be defined later or by complier itself 
        // but it is compulsary to assign value to var else error
        var a=4;
        var s=Arrays.asList(1,2,3,4);

        //int nums[]=new int[10];
        var nums=new int[10]; // no [] needed

    }
}
