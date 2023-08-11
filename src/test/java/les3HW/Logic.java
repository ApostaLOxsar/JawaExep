package les3HW;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Logic {

    public static String getInputString() {
        Scanner iSc = new Scanner(System.in);
        return iSc.nextLine();
    }

    public static String[] splitString(String inputStr) {
        String[] strArray = inputStr.split(" ");
        if (strArray.length == 6) {
            return strArray;
        }
        return null;
    }

    public static String findDateOfBrith(ArrayList<String> inputStr) {
        String result = "no Date Of Brith";
        boolean flagStop = false;
        for (int i = 0; i < inputStr.size() && !flagStop; i++) {
            if (inputStr.get(i).matches("\\d{2}.\\d{2}.\\d{4}")) {
                result = inputStr.get(i);
                flagStop = true;
                inputStr.remove(i);
            }
        }
        return result;
    }

    public static int findPhoneNumber(ArrayList<String> inputStr) {
        int result = -1;
        boolean flagStop = false;
        for (int i = 0; i < inputStr.size() && !flagStop; i++) {
            if (inputStr.get(i).matches("\\d+")) {
                result = parseInt(inputStr.get(i));
                flagStop = true;
                inputStr.remove(i);
            }
        }
        return result;
    }

    public static char findGender(ArrayList<String> inputStr) {
        char result = 'n';
        boolean flagStop = false;
        for (int i = 0; i < inputStr.size() && !flagStop; i++) {
            if (inputStr.get(i).matches("[f?]|[m?]")) {
                result = inputStr.get(i).charAt(0);
                flagStop = true;
                inputStr.remove(i);
            }
        }
        return result;
    }

}
