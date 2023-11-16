class SmartCard {
  int emp_idn;

  public int getEmpIdn(Employee e) {
    return e.empid;
  }

  public void MarkAttendance(Employee e) {
    emp_idn = e.getEmpId();
    // instruction to mark present for empid ...
    System.out.println("Employee " + emp_idn + " is marked Present");
  }
}