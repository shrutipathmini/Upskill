package day9;

public class CustomException {
    public static void validateAge(int age) throws InvalidAgeException {
        if(age <18) {
            throw new InvalidAgeException("age < 18");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage()); // getter to call super variable
        }
    }
}