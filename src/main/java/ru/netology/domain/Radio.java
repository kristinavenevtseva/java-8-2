package ru.netology.domain;

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

    public Radio(int currentNumberStation, int maxNumberStation, int minNumberStation, int currentVolume, int maxVolume, int minVolume) {
        this.currentNumberStation = currentNumberStation;
        this.maxNumberStation = maxNumberStation;
        this.minNumberStation = minNumberStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio() {
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

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }
}
