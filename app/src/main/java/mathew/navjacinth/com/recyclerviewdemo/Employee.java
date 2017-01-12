package mathew.navjacinth.com.recyclerviewdemo;

/**
 * Created by Navjacinth Mathew on 11/29/2016.
 */

public class Employee {
    private String employeeName;
    private String employeeEmail;
    private String employeePhone;

    /*Getters and setters to access the private members*/
    public Employee(String employeeName, String employeeEmail, String employeePhone) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
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
