public class Author {
    private String name;
    private String email;
    private Gender gender;

    public enum Gender {
        m,
        f
    }

    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public static void toString(String name, Gender gender, String email) {
        System.out.println(name + "(" + gender + ")" + " at " + email);
    }

}
