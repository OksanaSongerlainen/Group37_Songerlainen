package Lesson_13;

public class Person {
    public String login;
    public String password;
    public String confirmPassword;

    public Person(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("Логин должен быть меньше 20 символов!");
            }
            if (login.contains(" ")){
                throw new WrongLoginException("Логин не должен содержать пробелы!");
            }
            if (password.length() >= 20) {
                throw new WrongLoginException("Пароль должен быть меньше 20 символов!");
            }
            if (password.contains(" ")){
                throw new WrongLoginException("Пароль не должен содержать пробелы!");
            }
            if (!password.matches(".*\\d.*")) {
                throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру!");
            }
            if (!password.equals(confirmPassword)) {
                    throw new WrongPasswordException("Пароли не совпадают!");
                }
        } catch (WrongLoginException e) {
            return false;
        } return true;
    }
}
