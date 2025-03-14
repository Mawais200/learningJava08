
public class Recursion {

    // Recursive method to calculate factorial of a number
    public static void factorial(int n) {
        if(n==0){
            return ;
        }
        System.out.println(n);
          factorial(n - 1); // Recursive case
          
        
    }
    // print natural number
    public static void natural(int i,int n,int sum){
        if(i > n){
            System.out.println(sum);
            return;
        } 
        sum = sum + i;
        natural(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int n = 5;
        factorial(n);
        
        
        natural(1, 5, 0);
}}