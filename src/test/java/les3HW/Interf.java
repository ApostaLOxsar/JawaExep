package les3HW;


import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class Interf {
    public static void main(String[] args) {
        System.out.println("Введите (Фамилию Имя Отчество) (дата рождения) (номер телефона) (пол) через пробел");
        String inputString = Logic.getInputString();
        boolean flagInput = true;
        //String[] inputArrayString = Logic.splitString(inputString);
        ArrayList<String> testArray = null;

        try {
            testArray = new ArrayList<String>(Arrays.stream(Logic.splitString(inputString)).toList());
            //Date Of Brith
            String dateOfBrith = Logic.findDateOfBrith(testArray);
            System.out.println(dateOfBrith);
            //Phone number
            String phoneNumber = Integer.toString(Logic.findPhoneNumber(testArray));
            System.out.println(phoneNumber);
            //Gender
            String gender = valueOf(Logic.findGender(testArray));
            System.out.println(gender);
            //firstName
            String firstName = testArray.get(1);
            System.out.println(firstName);
            //lastName
            String lastName = testArray.get(0);
            System.out.println(lastName);
            //middleName
            String middleName = testArray.get(2);
            System.out.println(middleName);
            if (dateOfBrith.equals("no Date Of Brith")) {
                flagInput = false;
                throw new Exception("no Date Of Brith");
            }
            if (phoneNumber.equals("-1")) {
                flagInput = false;
                throw new Exception("no phone number");
            }
            if (gender.equals("n")) {
                flagInput = false;
                throw new Exception("no gender");
            }
            if (flagInput) {
                JobWithFile.creatFileAndDir(dateOfBrith, phoneNumber, gender
                        , firstName, lastName, middleName);
            }
        } catch (NullPointerException e) {
            System.err.println("Введенны не корректные данные");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
