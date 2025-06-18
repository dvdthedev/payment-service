package org.example;

import org.example.model.entities.Contract;
import org.example.model.service.ContractService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int contractNumber = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate ld = LocalDate.parse(sc.next(), sdf);
        System.out.print("Valor do contrato: ");
        Double contractValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int installments = sc.nextInt();
        Contract contract = new Contract(contractNumber, ld, contractValue);
        ContractService cs = new ContractService();
        cs.processContract(contract, installments);


        System.out.println(contract);

    }
}