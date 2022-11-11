package ru.netology;

public class Radio {

    private int currentVolume;
    private int currentRadioStationNumber;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        this.currentRadioStationNumber = currentRadioStationNumber;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }




    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }
    public void setManualEntryRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }
}



