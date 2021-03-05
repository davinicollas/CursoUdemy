/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;  


/**
 *
 * @author davi nicollas
 */
public class Reservation {

    private Integer rooNumber;
    private Date checkIn;
    private Date checkOut;
    
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  

    public Reservation(Integer rooNumber, Date checkIn, Date checkOut) {
        this.rooNumber = rooNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRooNumber() {
        return rooNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setRooNumber(Integer rooNumber) {
        this.rooNumber = rooNumber;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {

        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }
    
    public String toString(){
        return "Room "
                + rooNumber
                + ", check-In: " 
                + sdf.format(checkIn)
                + ", "
                + duration() 
                + "nights";
    }

}
