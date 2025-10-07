
package ws1;

import java.util.Scanner;

/**
 *
 * @author gia.thinh
 */
public class WS1 {

    public static void main(String[] args) {
//        int n;
//        
//        System.out.println("Input a positive number: ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
        
//        if(isPrime(n))
//            System.out.println(n + " is prime number");
//        else
//            System.out.println(n + " isn't prime number");
//        printPrimeList();
//        print1000FirstPrimes();
        int a, b; 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input positive integer a: ");
        a = sc.nextInt();
        System.out.print("Input positive integer b: ");
        b = sc.nextInt();
        
        solve(a, b);
        
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) 
            return false; 
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false; 
            }
        }
        return true;
    }
    
    public static void printPrimeList() {
        for(int i = 1; i <= 1000; i++) {
            if(isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
       
    public static void print1000FirstPrimes() {
        int count = 0, i = 1;
        //sử dụng lại hàm isPrime()
        while(count <= 1000) {
            if(isPrime(i)) { 
                System.out.println(i);
                count++;
            }
            i++; 
        }
    }     

    public static void solve(int a, int b) {
        if(a == 0) 
            if(b == 0)
                System.out.println("Underdetermined");
            else
                System.out.println("inconsistent");
        else
            System.out.println("Have a unique solution: " + (-b/(double)a));
    }
}
