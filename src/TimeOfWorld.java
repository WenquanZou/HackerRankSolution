import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimeOfWorld {

  static Map<Integer, String> intToClock = new HashMap<>();

  static {
    intToClock.put(1, "one");
    intToClock.put(2, "two");
    intToClock.put(3, "three");
    intToClock.put(4, "four");
    intToClock.put(5, "five");
    intToClock.put(6, "six");
    intToClock.put(7, "seven");
    intToClock.put(8, "eight");
    intToClock.put(9, "nine");
    intToClock.put(10, "ten");
    intToClock.put(11, "eleven");
    intToClock.put(12, "twelve");
    intToClock.put(13, "thirteen");
    intToClock.put(14, "fourteen");
    intToClock.put(15, "fifteen");
    intToClock.put(16, "sixteen");
    intToClock.put(17, "seventeen");
    intToClock.put(18, "eightteen");
    intToClock.put(19, "nineteen");
    intToClock.put(20, "twenty");
  }

  static String timeInWords(int h, int m) {
    StringBuilder sb = new StringBuilder();
    if (m == 0) {
      sb.append(toClock(h)).append(" o' clock");
      return sb.toString();
    }

    if (m > 30) {
      m = 60 - m;
      sb.append(toMinutes(m)).append(" to ");
      if (h == 12) {
        h = 0;
      }
      sb.append(toClock(h + 1));
    } else {
      sb.append(toMinutes(m)).append(" past ").append(toClock(h));
    }

    return sb.toString();
  }

  private static String toClock(int h) {
    return intToClock.get(h);
  }

  private static String toMinutes(int m) {
    StringBuilder sb = new StringBuilder();
    if (m == 15) {
      return "quarter";
    }
    if (m == 30) {
      return "half";
    }
    if (m > 20) {
      sb.append(intToClock.get(20)).append(" ");
      m = m - 20;
    }
    sb.append(intToClock.get(m)).append(" minute");
    if (m > 1) {
      sb.append("s");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int h = in.nextInt();
    int m = in.nextInt();
    String result = timeInWords(h, m);
    System.out.println(result);
    in.close();
  }
}
