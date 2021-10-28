package com.company;
import java.util.ArrayList;

public class RaffleCup {
    private final int numOfDice;
    private final ArrayList<Integer> lastShake = new ArrayList<>();

    public RaffleCup(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int shake() {
        if (!lastShake.isEmpty()) {
            lastShake.clear();
        }

        int totalNum = 0;
        for (int i = 0; i < numOfDice; i++) {
            int dice = dice();
            lastShake.add(dice);
            totalNum = totalNum + dice;
        }
        return totalNum;
    }

    public int dice() {
        int min = 1;
        int max = 6;
        return (int) (Math.random() * (max - min) + min);
    }

    public String lastShake() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lastShake.size(); i++) {
            int diceNum = i + 1;
            result.append("Dice ").append(diceNum).append(": ");
            result.append(lastShake.get(i).toString());
            result.append("\n");
        }

        return result.toString();
    }

}


