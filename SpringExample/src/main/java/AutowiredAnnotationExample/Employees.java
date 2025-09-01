package AutowiredAnnotationExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employees")  // explicit bean name (optional)
public class Employees {

    @Value("1")
    private int employeeId;

    @Value("Aditya")
    private String firstName;

    @Value("${java.home}")  // injects system property
    private String lastName;

    @Value("#{4*4}")  // SpEL expression -> 16.0
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

