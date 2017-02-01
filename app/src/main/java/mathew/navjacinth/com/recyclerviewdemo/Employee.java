package mathew.navjacinth.com.recyclerviewdemo;

/**
 * Created by Navjacinth Mathew on 11/29/2016.
 */

public class Employee {
    private int employeeImage;
    private String employeeName;
    private String employeeEmail;
    private String employeePhone;

    public Employee(int employeeImage, String employeeName, String employeeEmail, String employeePhone) {
        this.employeeImage = employeeImage;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
    }

    public int getEmployeeImage() {
        return employeeImage;
    }

    public void setEmployeeImage(int employeeImage) {
        this.employeeImage = employeeImage;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }
}
