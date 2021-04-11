package BaiTap4_9;

public class ProgrammingBook extends Book {
    private String language;
    private String framerWork;

    public ProgrammingBook(String language, String bookCode, String name, String author, String price) {
        super(bookCode, name, author, price);
        this.language = language;
    }

    public ProgrammingBook() {

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramerWork() {
        return framerWork;
    }

    public void setFramerWork(String framerWork) {
        this.framerWork = framerWork;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framerWork='" +super.toString()+ '\'' +
                '}';
    }
}
