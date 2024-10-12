package dsa.Recursion;

public class Pow {
    public static double myPow(double x, int n) {
        if(n>0)
        {
            return x*myPow(x, n-1);
        }
        else if(n<0)
        {

           return (1/x)*myPow(x, n+1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }
}
