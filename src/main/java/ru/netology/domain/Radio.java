package ru.netology.domain;

public class Radio {

    private int currentNumberStation;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public void increaseCurrentNumberStation() {
        if (currentNumberStation == maxNumberStation) {
            currentNumberStation = minNumberStation;
        }
        currentNumberStation++;
    }

    public void decreaseCurrentNumberStation() {
        if (currentNumberStation == minNumberStation) {
            currentNumberStation = maxNumberStation;
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

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }
}
