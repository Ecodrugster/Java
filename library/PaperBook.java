package library;

public class PaperBook extends Book {
    private int pages;
    public PaperBook(int id, String title, String author, int year, int pages) {
        super(id, title, author, year);
        this.pages = pages;
    }
    
    @Override
    public void showInfo() {
        System.out.println("PaperBook{" + "id=" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", year=" + getYear() +
                ", pages=" + pages +
                '}');
    }


}
