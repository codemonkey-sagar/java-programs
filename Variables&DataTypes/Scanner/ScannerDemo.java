import java.util.Scanner;

class ScannerDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    System.out.println("Entered String is: " + s);
  }
}