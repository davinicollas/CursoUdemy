/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import model.exeption.DomainExcepition;

/**
 *
 * @author davi nicollas
 */
public class Reservation {

    private Integer rooNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer rooNumber, Date checkIn, Date checkOut) throws DomainExcepition {
        if (!checkOut.after(checkIn)) {
            throw new DomainExcepition("Error in reservation: Check-out date must be after check-in date");
        }
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

    public void updateDates(Date checkIn, Date checkOut) throws DomainExcepition {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainExcepition("Error in reservation: Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainExcepition("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String toString() {
        return "Room "
                + rooNumber
                + ", check-In: "
                + sdf.format(checkIn)
                + ", "
                + duration()
                + "nights";
    }

}
