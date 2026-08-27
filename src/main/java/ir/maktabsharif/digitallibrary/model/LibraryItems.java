//1. Create an abstract class LibraryItem with shared fields:
//id
//, title , publishYear , availableCopies
//Use the JOINED inheritance strategy
//2. Create three concrete subclasses:
//Book : fields isbn , author , pageCount
//Magazine : fields issueNumber , publisher , frequency (enum: WEEKLY , MONTHLY ,
//QUARTERLY )
//Manuscript : fields originCountry , estimatedAge , isFragile
//Create the Member entity:
//id , fullName , email , membershipDate , membershipStatus (enum: ACTIVE ,
//SUSPENDED , EXPIRED )
//4. Create the Loan entity:
//id , loanDate , dueDate , returnDate (nullable), status (enum: ACTIVE ,
//RETURNED , OVERDUE )
//Test Scenario:
//A Book with isbn=978-964-05-0 and author=“Sadegh Hedayat”
//A Magazine with issueNumber=42 and frequency=MONTHLY
//A Manuscript with isFragile=true and estimatedAge=500
//Three Members with different statuses
package ir.maktabsharif.digitallibrary.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class LibraryItems {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String publishYear;
    private int availableCopies;
    protected LibraryItems() {

    }

    public LibraryItems( String title, String publishYear, int availableCopies) {
        this.title = title;
        this.publishYear = publishYear;
        this.availableCopies = availableCopies;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    @Override
    public String toString() {
        return "LibraryItems{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishYear='" + publishYear + '\'' +
                ", availableCopies=" + availableCopies +
                '}';
    }
}

