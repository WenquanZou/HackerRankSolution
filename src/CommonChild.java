import java.util.Scanner;

public class CommonChild {
  static int commonChild(String s1, String s2){
    int[][] CommonChars = new int[s1.length() + 1][s2.length() + 1];
    for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s2.length(); j++) {
        if (s1.charAt(i) == s2.charAt(j)) {
          CommonChars[i + 1][j + 1] = CommonChars[i][j] + 1;
        } else {
          CommonChars[i + 1][j + 1] = Math.max(CommonChars[i + 1][j], CommonChars[i][j + 1]);
        }
      }
    }
    return CommonChars[s1.length()][s2.length()];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    int result = commonChild(s1, s2);
    System.out.println(result);
  }
}
