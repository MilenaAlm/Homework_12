package lesson1;
public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Федор", "Достоевский");
        Author orwell = new Author("Джордж", "Оруэлл");

        Book idiot = new Book("Идиот", 1869, dostoevsky);
        Book skotnyiDvor = new Book("Скотный двор", 1945, orwell);

        System.out.println("Название книги " + idiot.getTitle()+ ", год издания " + idiot.getPublishingYear()+
                ", автор "  + idiot.getAuthor().getName()+ " " + idiot.getAuthor().getSurname());
        System.out.println("Название книги " + skotnyiDvor.getTitle()+ ", год издания " +  skotnyiDvor.getPublishingYear() +
                ", автор "  + skotnyiDvor.getAuthor().getName()+ " " + skotnyiDvor.getAuthor().getSurname());


        idiot.setPublishingYear(1870);
        System.out.println("Название книги " + idiot.getTitle()+ ", год издания " + idiot.getPublishingYear()+
                ", автор "  + idiot.getAuthor().getName()+ " " + idiot.getAuthor().getSurname());
    }
}

