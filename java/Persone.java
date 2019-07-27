public class Persone {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    static class Builder {
        private Persone persone;

        Builder() {
            persone = new Persone();
        }

        Builder firstName(String firstName) {
            persone.firstName = firstName;
            return this;
        }

        Builder lastName(String lastName) {
            persone.lastName = lastName;
            return this;
        }

        Builder middleName(String middleName) {
            persone.middleName = middleName;
            return this;
        }

        Builder country(String country) {
            persone.country = country;
            return this;
        }

        Builder address(String address) {
            persone.address = address;
            return this;
        }

        Builder phone(String phone) {
            persone.phone = phone;
            return this;
        }

        Builder age(int age) {
            persone.age = age;
            return this;
        }

        Builder gender(String gender) {
            persone.gender = gender;
            return this;
        }
    }
}
