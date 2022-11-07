package ru.netology;

public class Radio {

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void setReduceVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        } else {
            currentVolume = newCurrentVolume;
        }
    }


    public int currentRadioStationNumber;

    public int getRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setNextRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 9) {
            currentRadioStationNumber = newRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void setPrevRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 0) {
            currentRadioStationNumber = newRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }
    public void setManualEntryRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }
}



