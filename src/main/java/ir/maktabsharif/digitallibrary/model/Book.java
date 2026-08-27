//2. Create three concrete subclasses:
////Book : fields isbn , author , pageCount
////Magazine : fields issueNumber , publisher , frequency (enum: WEEKLY , MONTHLY ,
////QUARTERLY )
////Manuscript : fields originCountry , estimatedAge , isFragile
////Create the Member entity:
////id , fullName , email , membershipDate , membershipStatus (enum: ACTIVE ,
////SUSPENDED , EXPIRED )
package ir.maktabsharif.digitallibrary.model;

import jakarta.persistence.Entity;

@Entity
public class Book extends LibraryItems{
    private String isbn;
    private String author;
    private int pageCount;

    public Book(String title, String publishYear, int availableCopies,String isbn, String author, int pageCount) {
        super(title,publishYear,availableCopies);
        this.isbn = isbn;
        this.author = author;
        this.pageCount = pageCount;
    }

    public Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
