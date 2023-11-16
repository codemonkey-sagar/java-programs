/**
 WAP that prints the total number of words of a Book. THe Book class has inner class Page. Book has number of Pages. Page class have an array of lines. Every element of this lines array stores number of words of that line.
 */

class Composition {
  public static void main(String[] args) {
    Book b = new Book(1, "OOPM Book", 3); 
    int nowords = b.getNumofWords();
    System.out.println("Total Words = " + nowords);
  }
}