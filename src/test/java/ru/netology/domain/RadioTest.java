package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldIncreaseCurrentNumberStation() {
        radio.setCurrentNumberStation(5);
        radio.increaseCurrentNumberStation();
        int expected = 6;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberStationReturnToMin() {
        radio.setCurrentNumberStation(9);
        radio.increaseCurrentNumberStation();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentNumberStation() {
        radio.setCurrentNumberStation(5);
        radio.decreaseCurrentNumberStation();
        int expected = 4;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberStationReturnToMax() {
        radio.setCurrentNumberStation(0);
        radio.decreaseCurrentNumberStation();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeStopOnMax() {
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolumeStopOnMin() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}