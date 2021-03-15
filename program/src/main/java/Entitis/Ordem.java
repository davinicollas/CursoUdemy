/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitis;

import ententues.enums.OrdemService;
import java.util.Date;

/**
 *
 * @author davi nicollas
 */
public class Ordem {
    private Integer id;
    private Date moment;
    private OrdemService Status;
    
    public Ordem(){
        
    }
    

    public Ordem(Integer id, Date moment, OrdemService Status) {
        this.id = id;
        this.moment = moment;
        this.Status = Status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdemService getStatus() {
        return Status;
    }

    public void setStatus(OrdemService Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Ordem [" + "id=" + id + ", moment=" + moment + ", Status=" + Status + ']';
    }
    
    
            
    
}


