package BaiTap4_9;

public class FictionBook extends Book {
    private String category;

    public FictionBook(String category,String bookCode, String name, String author, String price) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public FictionBook(){
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
