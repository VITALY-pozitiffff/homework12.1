public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Игорь", "Хлебов");
        Author authorTwo=new Author("Никита","Утюгов");
        Book bookOne = new Book("Книга первая",  authorOne,2018);
        Book bookTwo = new Book("Книга вторая", authorTwo, 2024);
        System.out.println("Книга 1: " + bookOne.getTitle() + " автор : " + bookOne.getAuthor().getFirstName() + " " + bookOne.getAuthor().getLastName() + " , год публикации: " + bookOne.getPublicationYear());
        System.out.println("Книга 2: " + bookTwo.getTitle() + " автор : " + bookTwo.getAuthor().getFirstName() + " " + bookTwo.getAuthor().getLastName() + " , год публикации: " + bookTwo.getPublicationYear());

       bookOne.setPublicationYear((2021));

        System.out.println("Книга 1: " + bookOne.getTitle() + " автор : " + bookOne.getAuthor().getFirstName() + " " + bookOne.getAuthor().getLastName() + " , год публикации: " + bookOne.getPublicationYear());

    }

}