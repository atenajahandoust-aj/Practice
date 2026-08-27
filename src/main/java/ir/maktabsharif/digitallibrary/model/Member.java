////Create the Member entity:
////id , fullName , email , membershipDate , membershipStatus (enum: ACTIVE ,
////SUSPENDED , EXPIRED )
package ir.maktabsharif.digitallibrary.model;

import ir.maktabsharif.digitallibrary.enums.MembershipStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String fullName;
    private String email;
    private LocalDate membershipDate;
    @Enumerated(EnumType.STRING)
    private MembershipStatus membershipStatus;

    public Member(){

    }

    public Member(int id, String fullName, String email, LocalDate membershipDate, MembershipStatus membershipStatus) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.membershipDate = membershipDate;
        this.membershipStatus = membershipStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
    }

    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(MembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", membershipDate=" + membershipDate +
                ", membershipStatus=" + membershipStatus +
                '}';
    }
}
