package com.company;
import java.util.ArrayList;

public class MotherBoard {
    public final int NUMBEROFDRIVES = 4;
    ArrayList<SataDrive> sataDrives = new ArrayList<>();

    public String addSataDrive(SataDrive sataDrive) {
        String result;
        if (sataDrives.size() < NUMBEROFDRIVES) {
            sataDrives.add(sataDrive);
            result = "Added " + sataDrive.getName() + " to the motherboard";
        } else {
            result = "Couldn't add " + sataDrive.getName() + ": Board is full";
        }
        return result;
    }

    public String removeSataDrive(SataDrive sataDrive) {
        if (sataDrives.contains(sataDrive)) {
            sataDrives.remove(sataDrive);
            return sataDrive.getName() + " removed from the motherboard";
        } else {
            return "Cant find that drive";
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!sataDrives.isEmpty()) {
            result.append("Number of SataDrives: ").append(sataDrives.size()).append("\n");
            for (int i = 0; i < sataDrives.size(); i++) {
                int count = i + 1;
                result.append("Drive #").append(count).append(" ").append(sataDrives.get(i).getName()).append("\n");
            }
        } else {
            result = new StringBuilder("there is no SataDrives connected");
        }
        return result.toString();
    }
}
