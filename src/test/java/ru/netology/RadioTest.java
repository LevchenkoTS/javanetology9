package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotReduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.reduceVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolumeWhenUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.reduceVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        radio.nextRadioStationNumber();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStationNumberWhenMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NextRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(7);
        radio.nextRadioStationNumber();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStationNumberWhenMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.prevRadioStationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.prevRadioStationNumber();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualEntryRadioStationNumber() {
        Radio radio = new Radio();

        radio.setManualEntryRadioStationNumber(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void manualEntryRadioStationNumberIfAboveMaxLim() {
        Radio radio = new Radio();

        radio.setManualEntryRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}