package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int radioStationNumber = 10;
    private int currentRadioStationNumber;
    private int maxRadioStationNumber = radioStationNumber - 1;
    private int minRadioStationNumber;


    public Radio(int amountRadioStation) {
        this.maxRadioStationNumber = amountRadioStation - 1;
    }


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
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }




    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < maxRadioStationNumber) {
            currentRadioStationNumber++;
        }
        else {
            currentRadioStationNumber = minRadioStationNumber;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber> minRadioStationNumber) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxRadioStationNumber;
        }
    }
    public void setManualEntryRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }
}
