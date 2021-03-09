/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.services;

import java.util.Calendar;
import model.entitties.Installment;
import java.util.Date;
import model.entitties.Contrato;

/**
 *
 * @author davi nicollas
 */
public class ContractService{
    private OnlinePaymentService onlinePaymentService;
    public ContractService() {
    }

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void ProcessContract(Contrato cont, int months) {
        double parcelas = cont.getTotalValue()/months;
        for(int i=1 ; i<= months ;i++){
         Date date = addMonths(cont.getData(),i);
         double upadate = parcelas + onlinePaymentService.interest(parcelas,i);
         double fullquota = upadate+ onlinePaymentService.paymentFree(upadate);
         cont.addInstallment(new Installment(date, fullquota));
        }
    }
    
    public Date addMonths(Date data,  int n){
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

   
    
}
