package Data;

public class ParseData {
    public static String nameFile;
    public String [] name;
    static String [] parseName(String[] data) {
        String[] name = new String[3];
        name[0] = data[0];
        name[1] = data[1];
        name[2] = data[2];
        nameFile=name[0];
        return name;
    }

    public static String getNameFile() {
        return nameFile + ".txt";
    }

    static String parseDate(String[] data) {
        String date = data[3];
        return date;
    }
    static String phone(String[] data) {
        String phone = data[4];
        return phone;
    }
    static String gender(String[] data) {
        String gender = data[5];
        return gender;
    }
}