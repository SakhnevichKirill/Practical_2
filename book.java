public class book {

    private String author;
    private String name;

    public void setName(String author) {
        this.author = author;
    }
    public void setAge(String name) {
        this.name = name;
    }

    public String getAge() {
        return name;
    }

    public String getName() {
        return author;
    }

    public String toString() {
        return "Автор книги: " + author + " Название книги: " + name;
    }
}
