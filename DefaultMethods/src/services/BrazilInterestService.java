package services;

import interfaces.InterestServices;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestServices {
    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
