import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    String[][] studentarr = new String[3][3];
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter Student " + (i + 1) + " Name: ");
      Scanner in = new Scanner(System.in);
      studentarr[i][0] = in.nextLine();
      System.out.print("Enter Student " + (i + 1) + " Grade 1: ");
      studentarr[i][1] = in.next();
      System.out.print("Enter Student " + (i + 1) + " Grade 2: ");
      studentarr[i][2] = in.next();
      System.out.println();
    }
    for (int i = 0; i < 3; i++) {
      double grade1 = 0;
      double grade2 = 0;
      for (int j = 0; j < 3; j++) {
        if (j == 0) {
          System.out.println(studentarr[i][j] + "\'s grade: ");
        } else if (j == 1) {
          grade1 = Double.parseDouble(studentarr[i][j]);
          System.out.println("Grade 1: " + grade1);
        } else {
          grade2 = Double.parseDouble(studentarr[i][j]);
          System.out.println("Grade 1: " + grade1);
        }
      }
      System.out.println("Total Average: " + (grade1 + grade2) / 2 + "\n");
    }
  }
}
