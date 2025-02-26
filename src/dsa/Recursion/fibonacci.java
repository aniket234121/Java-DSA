class fibonacci{
    public static int fibonacci(int n)
    {
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void fibSeries(int n)
    {
        if(n<0) return;
        fibSeries(n-1);
        System.out.print(fibonacci(n));
    }
    public static void main(String[] args)
    {
    fibSeries(4);
    }
}