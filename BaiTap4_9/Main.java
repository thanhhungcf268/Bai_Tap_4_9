package BaiTap4_9;

import java.util.Scanner;

public class Main {
    private static final Main main = new Main();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
     main.setMain();
    }

    public ProgrammingBook addBook() {
        String[] a = main.add3();
        System.out.println("Tiếng : ");
        String language = sc.nextLine();
        return new ProgrammingBook(language, a[0], a[1], a[2], a[3]);
    }

    public FictionBook addBook1() {
        String[] a = main.add3();
        System.out.println("Thể loại : ");
        String category = sc.nextLine();
        return new FictionBook(category, a[0], a[1], a[2], a[3]);
    }

    public String[] add3() {
        System.out.println("Mã sách : ");
        String bookCode = sc.nextLine();
        System.out.println("Tên sách : ");
        String name = sc.nextLine();
        System.out.println("Tác giả : ");
        String author = sc.nextLine();
        System.out.println("Giá sách : ");
        String price = sc.nextLine();
        String[] array;
        return array = new String[]{bookCode, name, author, price};
    }

    public void totalDollars(Book[] books) {
        double dollars = 0;
        for (Book k : books) {
            double a = Integer.parseInt(k.getAuthor());
            dollars += a;
        }
        System.out.println(dollars);
    }

    public void index(Book[] books) {
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if ("java".equals(((ProgrammingBook) books[i]).getLanguage())) {
                index++;
            }
        }
        if (index == 0) {
            System.out.println(" cuốn sách với ngôn ngữ java không tồn tại ! ");
        } else {
            System.out.println("có " + index + " cuốn sách java !");
        }
    }

    public int menu() {
        System.out.println("nhập tùy chọn !");
        System.out.println("1. tính tiền !");
        System.out.println("2. tìm sách có tiếng java !");
        System.out.println("3. hiển thị sách !");
        System.out.println("4. Xắp sếp !");
        return sc.nextByte();
    }
    public void setMain(){
        Book[] books = new Book[10];
        for (int i = 0; i < 5; i++) {
            books[i] = main.addBook();
        }
        for (int i = 5; i < 10; i++) {
            books[i] = main.addBook1();
        }
        int index;
        do {
            index = main.menu();
            switch (index) {
                case 1 -> main.totalDollars(books);
                case 2 -> main.index(books);
                case 3 -> {
                    for (Book k : books) {
                        System.out.println(k);
                    }
                }
                case 4->main.listBook(books);

            }

        } while (0 != index);
    }
    public void listBook(Book[] books){
        for (int i=0;i<10;i++){
            for (int j=i+1;j<10;j++){
                if (Integer.parseInt(books[i].getAuthor())<Integer.parseInt(books[j].getAuthor())){
                    Book temp =books[i];
                    books[i] = books[j];
                    books[j]= temp;
                }
            }
        }
    }
}
