package Check;

public class CheckBDate {
    public static boolean checkBDate(String date) throws BDateEmptyValueException, BirthdayFormatException {
        if (date.length() == 0)
            throw new BDateEmptyValueException("Исключение пустого значения ДР"); // Исключение пустого значения ДР
        if (!date.matches("(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.](19|20)\\d\\d"))
            throw new BirthdayFormatException("Исключение формат ДР"); //Исключение формат ДР
        return true;
    }
}