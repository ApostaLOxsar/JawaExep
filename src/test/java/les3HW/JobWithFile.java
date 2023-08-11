package les3HW;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JobWithFile {
    public static void creatFileAndDir(String dateOfBrith, String phoneNumber, String gender
                                    , String firstName, String lastName, String middleName) {
        String fileRoad = "list people/" + lastName + ".txt";
        File dir = new File("list people");
        boolean created = dir.mkdir();

        File people = new File(fileRoad);
        try {
            boolean peopleFlag = people.createNewFile();
            if (peopleFlag)
                System.out.println("File has been created");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            FileWriter peopleFile = new FileWriter(fileRoad, true);
            peopleFile.append( "Last name: " + lastName + "\nFirst name: " + firstName + "\nMiddle name: " + middleName
            + "\nDate of brith: " + dateOfBrith + "\nPhone number: " + phoneNumber + "\nGender: " + gender + "\n\n");
            peopleFile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
