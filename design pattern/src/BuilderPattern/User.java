package BuilderPattern;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    private String name;
    private int age;

    private String email;
    private String school;


    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.school = builder.school;
    }

    public static class Builder {
        private String name;
        private int age;

        private String email;
        private String school;

        public Builder(String name, int age) {
            /*required */
            this.name = name;
            this.age = age;
        }

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder school(String school) {
            this.school = school;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}
