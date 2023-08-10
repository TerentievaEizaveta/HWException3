package Check;

public class CheckName {
    public static boolean checkName(String[] name) throws NameEmptyValueException, NameContainsDigitException {
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() == 0)
                throw new NameEmptyValueException("Исключение пустого значения "); // имя пусто
            for (int j = 0; j < name[i].length(); j++) {
                if (Character.isDigit(name[i].charAt(j)))
                    throw new NameContainsDigitException("Исключение формата ФИО"); // есть цифра в имени
            }
        }
        return true;
    }
}