////Test Scenario:
////A Book with isbn=978-964-05-0 and author=“Sadegh Hedayat”
////A Magazine with issueNumber=42 and frequency=MONTHLY
////A Manuscript with isFragile=true and estimatedAge=500
////Three Members with different statuses
package ir.maktabsharif.digitallibrary.util;


import ir.maktabsharif.digitallibrary.enums.Frequency;
import ir.maktabsharif.digitallibrary.enums.MembershipStatus;
import ir.maktabsharif.digitallibrary.model.*;

public class Main {
    public static void main(String[] args) {

        LibraryItems book = new Book("HarryPotter","1998",400,"978-964-05-0", "Sadegh Hedayat", 100);
        LibraryItems magazine = new Magazine("LastNight","1785",140,"42", "1998", Frequency.MONTHLY);
        LibraryItems manuscript = new Manuscript("Summer","2022",500,"England", 500, true);

        Member member1 = new Member();
        member1.setFullName("AliNoori");
        member1.setMembershipStatus(MembershipStatus.ACTIVE);
        Member member2 = new Member();
        member2.setFullName("Berlin");
        member2.setMembershipStatus(MembershipStatus.EXPIRED);
        Member member3 = new Member();
        member3.setFullName("Athena");
        member3.setMembershipStatus(MembershipStatus.SUSPENDED);
        HibernateUtil.inTXReturn(entityManager -> {
            entityManager.persist(member1);
            entityManager.persist(member2);
            entityManager.persist(member3);
            entityManager.persist(magazine);
            entityManager.persist(manuscript);
            entityManager.persist(book);
            return null;
        });

    }
}
