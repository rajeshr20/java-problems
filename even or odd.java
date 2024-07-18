import java.util.*;
import java.io.*;
class solution{

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        
        int n=scan.nextInt();
        if(n%2==1){
        System.out.println("weird");
    }else if (n%2==0 && n<=2 && n<=5){
        System.out.println("not weird");
    }else if(n%2==0 && n<20){
        System.out.println("weird");
    }else if (n%2==0 && n==20){
        System.out.println("not weird");
    }
        System.out.println("even or odd program");
    }
}