class TowerOfHanoi {

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
    TowerOfHanoi(4, 'A', 'C', 'B');
  }
}
