import java.util.*;
class Solution{
    public static void main(String[] args) {
        int num;
        int i;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        num=scan.nextInt();
        for(i=1;i<=10;i++)
        System.out.println(num + "*"+i+ "=" +num*i);
        System.out.println("tables of any  number");
    }
}

