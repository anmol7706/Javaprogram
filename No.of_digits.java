import java.io.*;
import java.util.Scanner;
class No_of_digits
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i=0;
        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.println("Number of digits present are = "+i);
    }
}