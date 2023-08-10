package Check;

public class CheckGender {
    public static boolean checkGender(String gender) throws GenderFormatException, GenderEmptyValueException {
        if (gender.length() == 0) throw new GenderEmptyValueException("Исключение пустого значения пол человека");
        if(!(gender.contains("f") || gender.contains("m")))throw new GenderFormatException("Исключение формата пола человека");
        return true;
    }
}

