class Displaying {
  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i; j++ ) {
        System.out.print(" ");
        System.out.print(j);
      }
      System.out.print("\n");
    }

    System.out.println("Screen Display Done");
  }
}