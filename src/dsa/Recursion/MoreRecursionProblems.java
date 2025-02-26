class MoreRecursionProblems {

  public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
  }

  public static int SumOfDigits(int n) {
    if (n <= 0) return 0;
    return (n % 10) + SumOfDigits(n / 10);
  }

  public static void checkPalindrome(String str, int left, int right) {
    if (left >= right) {
      System.out.println("palindrome");
      return;
    }
    if (str.charAt(left) != str.charAt(right)) {
      System.out.println("not palindrome");
      return;
    }

    checkPalindrome(str, left + 1, right - 1);
  }

  public static void TowerOfHanoi(int n, char src, char dest, char helper) {
    if (n == 1) {
      System.out.println("moving disk " + n + " from " + src + " to " + dest);
      return;
    }

    TowerOfHanoi(n - 1, src, helper, dest);
    System.out.println("moving disk " + n + " from " + src + " to " + dest);
    TowerOfHanoi(n - 1, helper, dest, src);
  }

  public static void main(String[] args) {
    TowerOfHanoi(3, 'A', 'B', 'C');
    System.out.println(factorial(0));

    System.out.println(SumOfDigits(98));
    checkPalindrome("taninasa", 0, 7);
  }
}
