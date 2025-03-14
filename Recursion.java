
public class Recursion {

    // Recursive method to calculate factorial of a number
    public static void factorial(int n) {
        if(n==0){
            return ;
        }
        System.out.println(n);
          factorial(n - 1); // Recursive case
          
        
    }

    public static void main(String[] args) {
        int n = 5;
        factorial(n);
        
    }
}