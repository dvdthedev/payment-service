package org.example.model.service;

import org.example.model.entities.Contract;
import org.example.model.entities.Installment;
import org.example.model.interfaces.OnlinePaymentService;

import java.time.LocalDate;
import java.util.ArrayList;


public class ContractService {
    OnlinePaymentService ops = new PaypalService();
    public void processContract(Contract contract, int months){
        ArrayList<Installment> installments = new ArrayList<>();

        for(int i = 1; i <= months; i++){
            LocalDate installmentDate = contract.getDate().plusMonths(i);
            Double installmentAmount = contract.getTotalValue() / months;
            Double installmentWithInterest = ops.interest(installmentAmount, i);
            System.out.println(installmentWithInterest);
            Double installmentInterestAndFee = ops.paymentFee(installmentWithInterest + installmentAmount);
            System.out.println(installmentInterestAndFee);
            

            System.out.println(installmentDate + " " + installmentAmount);
        }
        System.out.println(installments);
    }
}
