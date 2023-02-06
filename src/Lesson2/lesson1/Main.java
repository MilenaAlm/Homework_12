package Lesson2.lesson1;

public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Федор", "Достоевский");
        Author orwell = new Author("Джордж", "Оруэлл");

        Book idiot = new Book("Идиот", 1869, dostoevsky);
        Book skotnyiDvor = new Book("Скотный двор", 1945, orwell);

        System.out.println (idiot);
        System.out.println(skotnyiDvor);

        idiot.setPublishingYear(1870);
        System.out.println(idiot);

        System.out.println(dostoevsky);
        System.out.println(orwell);

        System.out.println(dostoevsky.equals(idiot));

        System.out.println(dostoevsky.hashCode());
        System.out.println(orwell.hashCode());
        System.out.println(idiot.hashCode());
        System.out.println(skotnyiDvor.hashCode());


    }
}

