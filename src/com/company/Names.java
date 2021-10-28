package com.company;
import java.util.ArrayList;

public class Names {
    private final String fullName;
    private String firstName;
    private String middelName;
    private String lastName;

    public Names(String fullName) {
        this.fullName = fullName;
        setNames();
    }

    public String getFullName() {
        return fullName;
    }

    private boolean letterIsUpper(char letter) {
        return Character.isUpperCase(letter);
    }

    private ArrayList fullNameIndexsOfUpper() {
        ArrayList<Integer> capitalisedIndexes = new ArrayList<>();

        int fullNameLength = fullName.length();

        for (int i = 0; i < fullNameLength; i++) {
            char letter = fullName.charAt(i);
            if (letterIsUpper(letter)) {
                capitalisedIndexes.add(i);
            }
        }
        return capitalisedIndexes;
    }

    private void setNames() {
        int instancesOfUpper = fullNameIndexsOfUpper().size();
        int firstNameIndexStart;
        int lastNameNameIndexStart;
        firstNameIndexStart = (int) fullNameIndexsOfUpper().get(0);
        if (instancesOfUpper == 3) {

            int middleNameIndexStart = (int) fullNameIndexsOfUpper().get(1);
            firstName = fullName.substring(firstNameIndexStart, middleNameIndexStart);
            lastNameNameIndexStart = (int) fullNameIndexsOfUpper().get(2);
            middelName = fullName.substring(middleNameIndexStart,lastNameNameIndexStart);
            lastName = fullName.substring(lastNameNameIndexStart);

        }
        else if (instancesOfUpper == 2) {
            lastNameNameIndexStart = (int) fullNameIndexsOfUpper().get(1);
            firstName = fullName.substring(firstNameIndexStart, lastNameNameIndexStart);
            lastName = fullName.substring(lastNameNameIndexStart);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddelName() {
        return middelName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        if (middelName != null) {
            return firstName + " " + middelName + " " + lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
