////2. Create three concrete subclasses:
//////Book : fields isbn , author , pageCount
//////Magazine : fields issueNumber , publisher , frequency (enum: WEEKLY , MONTHLY ,
//////QUARTERLY )
//////Manuscript : fields originCountry , estimatedAge , isFragile
//////Create the Member entity:
//////id , fullName , email , membershipDate , membershipStatus (enum: ACTIVE ,
//////SUSPENDED , EXPIRED )
package ir.maktabsharif.digitallibrary.model;

import ir.maktabsharif.digitallibrary.enums.Frequency;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
@Entity
public class Magazine extends LibraryItems{
    private String issueNumber;
    private String publisher;
    @Enumerated(EnumType.STRING)
    private Frequency frequency;

    public Magazine(String title, String publishYear, int availableCopies,String issueNumber, String publisher, Frequency frequency) {
        super(title, publishYear, availableCopies);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
        this.frequency = frequency;
    }

    public Magazine() {
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber='" + issueNumber + '\'' +
                ", publisher='" + publisher + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
