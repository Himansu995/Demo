
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        
        // in old times
        System.out.println("enter the number");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in); // it takes any input like browsing etc so need to close it after use
        try {
            int n=Integer.parseInt(bf.readLine());
            System.out.println(n);
            bf.close();
        } catch (Exception e) {
            System.out.println("Atleast enter the input or only integer allowed");
        }
        


        // new way
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();


        // to accept in try block itself(no need to close also bcz try will auto close it)
        InputStreamReader in2=new InputStreamReader(System.in);
        try(BufferedReader bf2=new BufferedReader(in)) {
            int n=Integer.parseInt(bf.readLine());
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Atleast enter the input or only integer allowed");
        }
    }
}
