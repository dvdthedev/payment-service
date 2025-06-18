package org.example.model.entities;

import java.time.LocalDate;
import java.util.Date;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Installment: " +
                "dueDate: " + dueDate +
                ", amount: " + amount ;
    }
}
