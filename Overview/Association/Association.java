// Association Relationship between classes SmartCard and Employee 

class Association {
  public static void main(String[] args) {
    System.out.println("*** ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD ***");
    Employee e = new Employee();
    System.out.println("NEW EMPLOYEE IS CREATED");
    SmartCard scd = new SmartCard();
    scd.MarkAttendance(e);    // passing the reference of emp to smartcard
    e.Login(scd);
  }
}