import java.util.*;

class Book {
  int id;
  String name;
  Scanner sc;
  Page[] pages;  // inner class objects array

  // INNER CLASS DEFINATION 
  class Page {
    int[] lines;
    
    Page(int numlines) {
      lines = new int[numlines];
    }

    void setLines() {   // initialise the number of words info for every line
      for (int i = 0; i < lines.length;i++) {
        System.out.println("ENter the number of words for line " + (i + 1));
        lines[i] = sc.nextInt();
      }
    }

    int getLines(){
      return lines.length;
    }
  }
  // END OF INNER CLASS DEFINITION

  Book(int id, String name, int numPages) {
    this.id = id;
    this.name = name;
    sc = new Scanner(System.in);
    pages = new Page[numPages];    // Array of OBjects of page class

    for (int i = 0; i < pages.length; i++) {
      System.out.println("Enter NUMBER OF LINES for page " + (i + 1));
      int nlines = sc.nextInt();
      pages[i] = new Page(nlines);    // Create inner class Page Object
      pages[i].setLines();
    }
  }

  // Perform statistics.. find total number of words in book 
  public int getNumofWords() {
    int numofwords = 0;
    
    for (int i = 0; i < pages.length; i++) {    // loop for num of pages
      // loop for num of words per line 
      for (int j = 0; j < pages[i].getLines(); j++) {
        numofwords += pages[i].lines[j];
      }
    }
    return numofwords;
  }
}