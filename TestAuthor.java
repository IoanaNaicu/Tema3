public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Popescu", "popescu@gmail.com", Author.Gender.m);
        System.out.println(author1.getName());
        System.out.println(author1.getGender());
        System.out.println(author1.getEmail());
        author1.setEmail("popescu@yahoo.com");
        System.out.println(author1.getEmail());
        author1.toString(author1.getName(), author1.getGender(), author1.getEmail());



        Author author2 = new Author ("Violeta", "vio@yahoo.com", Author.Gender.f);
        String author2Name = author2.getName();
        String author2Email = author2.getEmail();
        Author.Gender author2Gender = author2.getGender();
        author2.toString(author2Name, author2Gender, author2Email);


    }
}
