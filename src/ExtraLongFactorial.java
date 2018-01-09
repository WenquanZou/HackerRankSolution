import java.math.BigDecimal;
import java.util.Scanner;

public class ExtraLongFactorial {
  static void extraLongFactorials(int n) {
    BigDecimal result = new BigDecimal(n);
    for (int i = n - 1; i > 0; i--){
      result = result.multiply(BigDecimal.valueOf(i));
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    extraLongFactorials(n);
    in.close();
  }
}
