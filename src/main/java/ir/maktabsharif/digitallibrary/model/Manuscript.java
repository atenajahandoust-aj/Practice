////////Manuscript : fields originCountry , estimatedAge , isFragile
package ir.maktabsharif.digitallibrary.model;

import jakarta.persistence.Entity;

@Entity
public class Manuscript extends LibraryItems{
    private String originCountry;
    private int estimateAge;
    private boolean isFragile;

    public Manuscript(String title, String publishYear, int availableCopies,String originCountry, int estimateAge, boolean isFragile) {
        super(title, publishYear, availableCopies);
        this.originCountry = originCountry;
        this.estimateAge = estimateAge;
        this.isFragile = isFragile;
    }

    public Manuscript() {
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getEstimateAge() {
        return estimateAge;
    }

    public void setEstimateAge(int estimateAge) {
        this.estimateAge = estimateAge;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    @Override
    public String toString() {
        return "Manuscript{" +
                "originCountry='" + originCountry + '\'' +
                ", estimateAge=" + estimateAge +
                ", isFragile=" + isFragile +
                '}';
    }
}
