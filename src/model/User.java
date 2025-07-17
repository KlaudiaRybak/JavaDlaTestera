package model;

public class User {


    // POLA klasy - pola statyczne zawsze należą do klasy i można je wywoływać na klasie
    private static int userCounter = 0;

    // POLA obiektu - najlepiej private, wywoływane na obiekcie

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    // KONSTRUKTOR - public

    // pole obiektu może być ustawione wg przekazanego w konstruktorze parametru
    // pole obiektu może być ustawione wg zastosowanej logiki

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++; //pole klasy
    }

    // GETTERy i SETTERy - ma sens tworzenie publicznych getterów i setterów dla prywatnych pól obiektu
    // jeżeli stosujemy np. w setterze jakąś walidację wprowadzanej wartości

    public void setEmail(String email) {
        if (email.endsWith(".ru")) {
            System.out.println("RU emails are not allowed!");
        } else {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }


    // METODY obiektu

    public void getFullUserName() {
        System.out.println(firstName + " " + lastName);
    }

    public void getAllUserInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String userName) {
        System.out.println("Hi " + userName + ". Nice to meet you.");
    }

    public void howOldAreYou(String userName, int userAge) {
        System.out.println("Hi " + userName + ". You are " + userAge + " years old.");
    }

    public int yourAgePlus10(int userAge) {
        return userAge + 10;
    }


    // METODY klasy - zawsze będą mieć static (i tym rozróżnienie z metodami obiektu), wywoływane na klasie

    public static int getUserCounter(){
        return userCounter;
    }


}
