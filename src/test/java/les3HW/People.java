package les3HW;

public class People {
    private String firstName;
    private String lastName;
    private String middleName;
    private String dateOfBirth;
    private int phoneNumber;
    private char gender;


    public People(String firstName, String lastName, String middleName, String dateOfBirth, int phoneNumber, char gender){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMiddleName(middleName);
        this.setDateOfBirth(dateOfBirth);
        this.setPhoneNumber(phoneNumber);
        this.setGender(gender);
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "Имя = '" + getFirstName() + '\n' +
                "Фамилия = '" + getLastName() + '\n' +
                "Отчество = '" + getMiddleName() + '\n' +
                "Дата рождения = '" + getDateOfBirth() + '\n' +
                "Номер телефона = " + getPhoneNumber() + '\n' +
                "Пол = " + getGender() + "\n\n";
    }
}
