package day40_Encapsulation;

public class EmployeeInfo {

    private double salary;
    private  long SSN;
    private int ID;
    private String address;

    public long getSSN() {
        return SSN;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public static String company = "Cybertek";



    public EmployeeInfo(double salary, long SSN, int ID, String address) {
        this.salary = salary;
        this.SSN = SSN;
        this.ID = ID;
        this.address = address;
    }

    public EmployeeInfo(String address) {
        this.address = address;
    }

    public EmployeeInfo() {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }
}
