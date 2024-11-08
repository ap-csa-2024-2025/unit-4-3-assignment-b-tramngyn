import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(isPrime(1));
    System.out.println(isPrime(11));
    System.out.println(isPrime(35));
  }

  public static boolean isPrime(int N)
  {
    if (N == 1) {
      return false;
    }

    for (int x = 2; x < N; x++) {
      if (N % x == 0) {
        return false;
      }
    }
    return true;
  }
}
