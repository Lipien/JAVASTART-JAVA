package filesreadwrite.employees;

import java.io.*;

public class CompanyApp {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Jan", "Nowak");
        Person person3 = new Person("Jan", "Zych");
        Employee employee1 = new Employee(person1.getFirstName(), person1.getLastName(), 2000);
        Employee employee2 = new Employee(person2.getFirstName(), person2.getLastName(), 3000);
        Employee employee3 = new Employee(person3.getFirstName(), person3.getLastName(), 4000);

        Employee[] employees = {employee1, employee2, employee3};

        String fileName = "testFile.txt";
        Company company = new Company();

        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(company);
            System.out.println("Zapisano obiekt do pliku");

        } catch (IOException e) {
            System.err.println("Bład zapisu pliku " + fileName);
            e.printStackTrace();
        }

        Company companyRead = null;

        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
        ) {
            companyRead = (Company) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Nie udało się odczytać pliku");
            e.printStackTrace();
        }

        if (companyRead != null) {
            System.out.println("Wczytano dane o: ");
            System.out.println(companyRead.getEmployees());
        }
    }
}


