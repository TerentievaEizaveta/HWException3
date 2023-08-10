package Check;

public class CheckInput {
    public static boolean checkInput(String[] s) throws InputDataFormatException {
        if ((s.length>6) || (s.length<6))
            throw new InputDataFormatException("Ожидался ввод в формате ФИО ДР тел пол");
        return true;
    }

}
