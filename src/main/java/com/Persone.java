package com;

class Persone {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    static class BuilderPerson {
        private Persone persone;

        BuilderPerson() {
            persone = new Persone();
        }

        BuilderPerson firstName(String firstName) {
            persone.firstName = firstName;
            return this;
        }

        BuilderPerson lastName(String lastName) {
            persone.lastName = lastName;
            return this;
        }

        BuilderPerson middleName(String middleName) {
            persone.middleName = middleName;
            return this;
        }

        BuilderPerson country(String country) {
            persone.country = country;
            return this;
        }

        BuilderPerson address(String address) {
            persone.address = address;
            return this;
        }

        BuilderPerson phone(String phone) {
            persone.phone = phone;
            return this;
        }

        BuilderPerson age(int age) {
            persone.age = age;
            return this;
        }

        BuilderPerson gender(String gender) {
            persone.gender = gender;
            return this;
        }
    }
}
