package org.example.model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;


public class Contract {
    private int number;
    private LocalDate date;
    private Double totalValue;

    private ArrayList<Installment> installments = new ArrayList<>();

    public Contract(int number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Contract(){};

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public void setInstallments(ArrayList<Installment> installments) {
        this.installments = installments;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", date=" + date +
                ", totalValue=" + totalValue +
                ", installments=" + installments +
                '}';
    }
}
