package Check;

public class CheckPhone {
    public static boolean checkPhone(String phone) throws PhoneEmptyValueException, PhoneFormatException {
        if (phone.length() == 0) throw new PhoneEmptyValueException("Исключение пустого значения телефона");
        else if ((phone.length() != 11) || (!phone.matches("[0-9]+")))
                throw new PhoneFormatException("Исключение формата телефона"); //Исключение формата телефона
         // Исключение пустого значения телефона
        return true;
    }

}