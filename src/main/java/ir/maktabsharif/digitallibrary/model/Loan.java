// Create the Loan entity:
////id , loanDate , dueDate , returnDate (nullable), status (enum: ACTIVE ,
////RETURNED , OVERDUE )
package ir.maktabsharif.digitallibrary.model;
import ir.maktabsharif.digitallibrary.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.sql.Date;
import java.time.LocalDate;

public class Loan {
    private int id;
    private LocalDate loanDate;
    private Date dueDate;
    @Column(name = "Return_Date")
    private Date returnDate;
    @Enumerated(EnumType.STRING)
    private Status status;


}
