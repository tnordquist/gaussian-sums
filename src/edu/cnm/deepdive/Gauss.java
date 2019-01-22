package edu.cnm.deepdive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gauss {

  public static final int DEFAULT_UPPER_LIMIT = 100;

  public static void main(String[] args) throws FileNotFoundException {
    int upperLimit = DEFAULT_UPPER_LIMIT;

//    Scanner scanner = new Scanner(System.in); // System.in means scan
                                    // from the console as the source
    Scanner scanner = new Scanner(new File("data.txt"));
    System.out.print("Upper limit: ");
    while (scanner.hasNextInt()) {
      upperLimit = scanner.nextInt();
      long sum = triangleSum(upperLimit);
      System.out.printf("Sum form 1 to %,d = %,d%n", upperLimit, sum);
      System.out.print("Upper limit: ");
    }


  } // end main()

  public static long triangleSum(int upperLimit) {
    long sum = 0;
    for(int i = 1; i <= upperLimit; i++) {
      sum += i;
    }
    return sum;
  }
}
