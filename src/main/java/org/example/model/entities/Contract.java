package org.example.model.entities;

import java.util.ArrayList;
import java.util.Date;

public class Contract {
    private int number;
    private Date date;
    private Double totalValue;

    private ArrayList<Installment> installments = new ArrayList<>();
}
