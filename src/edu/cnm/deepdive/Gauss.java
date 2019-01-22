package edu.cnm.deepdive;

public class Gauss {

  public static final int DEFAULT_UPPER_LIMIT = 100;

  public static void main(String[] args) {
    // TODO Read upper limit from args.
    int upperLimit = DEFAULT_UPPER_LIMIT;
    long sum = triangleSum(upperLimit); // TODO Invoke triangleSum method.
    System.out.printf("Sum form 1 to %,d = %,d%n", upperLimit, sum);

  } // end main()

  public static long triangleSum(int upperLimit) {
    long sum = 0;
    for(int i = 1; i <= upperLimit; i++) {
      sum += i;
    }
    return sum;
  }
}
