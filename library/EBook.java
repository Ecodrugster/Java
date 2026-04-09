package library;

public class EBook extends Book {
    private String fileFormat;

    public EBook(int id, String title, String author, int year, String fileFormat) {
        super(id, title, author, year);
        this.fileFormat = fileFormat;
    }

        @Override
    public void showInfo() {
        System.out.println("EBook{" + "id=" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", year=" + getYear() +
                ", fileFormat='" + fileFormat + '\'' +
                '}');
    }

    
}
