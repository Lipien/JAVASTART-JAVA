package aggregationandcomposition;

public class Bank {
    public static void main(String[] args) {
        Address officialAddress1 = new Address();
        officialAddress1.apartmentNumber = 2;
        officialAddress1.city = "Warsaw";
        officialAddress1.street = "Dzika";
        officialAddress1.streetNumber = 12;
        officialAddress1.postCode = "10-625";

        Address currentAddress1 = new Address();
        currentAddress1.apartmentNumber = 13;
        currentAddress1.city = "Koszalin";
        currentAddress1.street = "Wolna";
        currentAddress1.streetNumber = 14;
        currentAddress1.postCode = "15-600";

        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "90897812362";
        person.officialAddress = officialAddress1;
        person.currentAddress = currentAddress1;

        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
        System.out.println("zameldowany w: " + person.officialAddress.city);
        System.out.println("zamieszkały w: " + person.currentAddress.city);
    }
}
