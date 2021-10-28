package com.company;

public class DateAgeCalculator {
    private final double yourAge;
    private final double dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public double lowestAge() {
        return (yourAge / 2) + 7;
    }

    public boolean dateIsOldEnough() {
        return dateAge >= lowestAge();
    }

    public int getYourAge() {
        return (int) this.yourAge;
    }

    public double getDateAge() {
        return (int) this.dateAge;
    }

    @Override
    public String toString() {
        if (dateIsOldEnough()) {
            return "Your date has a suitable age";
        } else {
            return "Your date does not have a suitable age";
        }
    }
}
