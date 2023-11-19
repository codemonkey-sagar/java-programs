import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Buffer {
  public static void main(String[] args) {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    try {
      String input = br.readLine();
      int n = Integer.parseInt(input);
      System.out.println("Square is = " + n * n);
      br.close();
      
    } catch(IOException ioe) {
      System.out.println("Input Error: " + ioe);
    }
  }
}