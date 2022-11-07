package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(5);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolume() {
        Radio radio = new Radio();

        radio.setReduceVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setReduceVolume(4);

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumber() {
        Radio radio = new Radio();

        radio.setNextRadioStationNumber(5);

        int expected = 6;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStationNumberWhenMax() {
        Radio radio = new Radio();

        radio.setNextRadioStationNumber(9);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NextRadioStationNumber() {
        Radio radio = new Radio();

        radio.setNextRadioStationNumber(7);

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStationNumberWhenMin() {
        Radio radio = new Radio();

        radio.setPrevRadioStationNumber(0);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumber() {
        Radio radio = new Radio();

        radio.setPrevRadioStationNumber(9);

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void manualEntryRadioStationNumber() {
        Radio radio = new Radio();

        radio.setManualEntryRadioStationNumber(6);

        int expected = 6;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void manualEntryRadioStationNumberIfAboveMaxLim() {
        Radio radio = new Radio();

        radio.setManualEntryRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}