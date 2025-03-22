public class Factorial_using_recursion {
   public static void main(String[] args) {
    int n=5;
     
    int ans=sol( n);
    System.out.println(ans+" ");
    
   }

   public static int sol(int n){
     if(n==0)
     return 1;
     
        return n*sol(n-1);
     }

}
