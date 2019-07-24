package loops.HospitalPatients;

import java.util.Objects;

public class Patient {

    private String firstName;
    private String surname;
    private String pesel;

    public Patient(String firstName, String surname, String pesel) {
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return firstName.equals(patient.firstName) &&
                surname.equals(patient.surname) &&
                pesel.equals(patient.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, pesel);
    }
}
