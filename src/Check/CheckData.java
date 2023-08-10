package Check;

public class CheckData {
    public static void checkData(String[] s) {
        try {
            String[] name = ParseData.parseName(s);
            CheckInput.checkInput(s);
            CheckName.checkName(name);
            String parseDate = ParseData.parseDate(s);
            //System.out.println(parseDate);
            CheckBDate.checkBDate(parseDate);
            String parsePhone = ParseData.phone(s);
            //System.out.println(parsePhone);
            CheckPhone.checkPhone(parsePhone);
            String parseGender = ParseData.gender(s);
            //System.out.println(parseGender);
            CheckGender.checkGender(parseGender);

        } catch (NameEmptyValueException | PhoneEmptyValueException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NameContainsDigitException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (PhoneFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (BirthdayFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (BDateEmptyValueException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (GenderFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (GenderEmptyValueException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (InputDataFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Проверка данных выполнена");
        }
    }

}


