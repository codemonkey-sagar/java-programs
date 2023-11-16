import java.util.Scanner;

class Employee {
  int empid;

  Employee() {
    System.out.println("Enter Employee id: ");
    Scanner sc = new Scanner(System.in);
    this.empid = sc.nextInt();
  }

  int getEmpId() {
    return empid;
  }

  public void Login(SmartCard sc) {
    // instructions to Login functionality ...
    // get empid fo the smart card holder
    int eid = sc.getEmpIdn(this);

    // Login and mark attendance 
    System.out.println("Login Successful for Employee " + eid);
  }
}