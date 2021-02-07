package org.jetBrains.javacore.practice;

import java.util.Optional;

public class Constructor {

    /*
    CONSTRUCTORS
    Any Java class has a constructor to initialize objects;
    A constructor has the same name as the class containing it;
    A constructor has no return type, not even void;
    If a class has no explicit constructors, the Java compiler automatically provides a default no-argument constructor;
    If we want to introduce new variables to denote the same thing, make the code clearer and less loaded with extra variables, the keyword this is used.
    */

    String name;
    int age;
    float height;

    public Constructor(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString(){
        String s = "The patience info: \nName: " + name + "\nAge: " + age + "\nHeight: " + height;
        return s;
    }

    public static void main(String[] args) {
        Constructor patience = new Constructor("Kamil", 32, 6.02f);
        System.out.println(patience.toString());

        // create an instance of Account here
        Account account = new Account("123456", 1000, new User("demo-user", "Alexander", "Scmidt"));
        // pass it into process method
        process(account);
        //OR
        process(new Account("123456", 1000, new User("demo-user", "Alexander", "Schmidt")));
        process(new Account("123", 10, new User("user", "Alex", "Schmidt")));

    }

    static class Account {

        private String code;
        private long balance;
        private User owner;
        //if the count is not static the count would be ZERO each time the object is created
        static int count = 0;

        public Account(String code, long balance, User owner) {
            this.code = code;
            this.balance = balance;
            this.owner = owner;
            System.out.println("Object creation round: " + count++);
        }

        public String getCode() {
            return code;
        }

        public long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }

    static class User {

        private String login;
        private String firstName;
        private String lastName;

        public User(String login, String firstName, String lastName) {
            this.login = login;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLogin() {
            return login;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public static void process(Account account) {
        try {
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println(account.getCode());
            System.out.println(account.getBalance());

            owner.ifPresent(o -> {
                System.out.println(o.getLogin());
                System.out.println(o.getFirstName());
                System.out.println(o.getLastName());
            });

        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }
}
