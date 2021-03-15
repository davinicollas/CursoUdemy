package interfaces;

import java.security.InvalidParameterException;

public interface InterestServices {

    double getInterestRate();
    default double payment(double amount, int months){
            if (months < 1){
                throw new InvalidParameterException("Months must be grater than zero");
            }
            return amount * Math.pow(1.0 + getInterestRate()/100.00, months );
        }

    }

