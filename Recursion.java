
public class Recursion {

    // Recursive method to calculate factorial of a number
    public static void printNum(int n) {
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNum(n - 1); // Recursive case
          
        
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
public static void fabonacci(int a, int b, int f) {
    if (f == 0) {
        return;
    }
    int c = a + b;
    System.out.println(c);
    fabonacci(b, c, f - 1); // Decrement f by 1 for correct recursion
}
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
        natural(1, 5, 0);
        int f=7;
        fabonacci(0,1,f);
        fabonacci(0, 1, f);
            }
        }
