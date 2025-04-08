package com.example.test2;
 class User{
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;

    // Private constructor to force usage of Builder
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Static inner Builder class
    public static class UserBuilder {
        private String name;
        private int age;
        private String email;
        private String phone;
        private String address;

        // Mandatory field constructor
        public UserBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Methods to set optional parameters
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        // Final build() method to create User object
        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", email='" + email + "', phone='" + phone + "', address='" + address + "'}";
    }
}

public class UserBuilderPattern {
    public static void main(String[] args) {
        // Create User with only mandatory fields
        User user1 = new User.UserBuilder("Alice", 25).build();

        // Create User with some optional fields
        User user2 = new User.UserBuilder("Bob", 30)
                .email("bob@example.com")
                .phone("1234567890")
                .build();

        // Create User with all fields
        User user3 = new User.UserBuilder("Charlie", 40)
                .email("charlie@example.com")
                .phone("9876543210")
                .address("123 Street, NY")
                .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        
        com.example.test2.User.UserBuilder u = new User.UserBuilder("",1).address(null).address(null);
    }
}

