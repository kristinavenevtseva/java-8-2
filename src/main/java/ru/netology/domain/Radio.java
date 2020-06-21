package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {

    private int currentNumberStation = 6;
    private int maxNumberStation = 10;
    private int minNumberStation = 0;
    private int currentVolume = 55;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public void increaseCurrentNumberStation() {
        if (currentNumberStation == maxNumberStation) {
            currentNumberStation = minNumberStation;
            return;
        }
        currentNumberStation++;
    }

    public void decreaseCurrentNumberStation() {
        if (currentNumberStation == minNumberStation) {
            currentNumberStation = maxNumberStation;
            return;
        }
        currentNumberStation--;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }

    public void setCurrentNumberStation(int currentNumberStation) {

        if (currentNumberStation > maxNumberStation) {
            return;
        }

        if (currentNumberStation < minNumberStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }
}
