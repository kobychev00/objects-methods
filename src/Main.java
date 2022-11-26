public class Main {
    public static void main(String[] args) {

        // конспект 1.10
        System.out.println("конспект 1.10");

        System.out.println("ДЗ1");
        Author authorLihachev = new Author ("Дмитрий", "Лихачев");
        Book book1 = new Book("Письма о добром", authorLihachev , 2014 );
        Author authorDuma = new Author("Александр", "Дюма");
        Book book2 = new Book("Три мушкетёра", authorDuma, 2004);
        System.out.println(book1.getHeader() + " " + book1.getYearPublish() + " " + book1.getAuthor());
        System.out.println(book2.getHeader() + " " + book2.getYearPublish() + " " + book2.getAuthor());
        book2.setYearPublish(2010);
        Author authorPuskin = new Author("Александр", "Пушкин");
        Book book3 = new Book("Капитанская дочка", authorPuskin, 2003);
        Book book4 = new Book("Капитанская дочка", authorPuskin, 2004);
        System.out.println(book3.equals(book4));


        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult (sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sarah);
        sarah.increaseAge(30);
    }
}