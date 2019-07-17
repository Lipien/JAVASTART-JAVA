package classesandobjects;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.firstName = "Bronek";
        employee1.lastName = "Nowak";
        employee1.birthYear = 1970;
        employee1.yearsOfEmplyment = 6;

        String workerInformation = "first name: " + employee1.firstName + ", last name: " + employee1.lastName +
                ", born: " + employee1.birthYear + ", years in company: " + employee1.yearsOfEmplyment;

        System.out.println(workerInformation);
    }
}
