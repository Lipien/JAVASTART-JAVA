package filesreadwrite.employees;

import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {

    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
