package library;

public class Book {
    private String Title;
    private String Author;
    private Boolean isAvailable;

    public Book (String Title, String Author)
    {
        this.Title = Title;
        this.Author = Author;
        this.isAvailable = true;

    }
    public void borrowBook()
    {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("the book is already borrowed");
        }
    }
    public void returnBook()
    {
        isAvailable = true;
    }

    public void getBookInfo()
    {

        System.out.println(Title);
        System.out.println(Author);
        System.out.println(isAvailable);

    }
}
