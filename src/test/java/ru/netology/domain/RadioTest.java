package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(15);

        assertEquals(15, radio.getMaxNumberStation());
    }

    @Test
    public void shouldInitFields() {

        assertEquals(6, radio.getCurrentNumberStation());
        assertEquals(10, radio.getMaxNumberStation());
        assertEquals(0, radio.getMinNumberStation());
        assertEquals(55, radio.getCurrentVolume());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseCurrentNumberStation() {
        Radio radio = new Radio(6, 10, 0, 55, 100, 0);

        radio.increaseCurrentNumberStation();

        assertEquals(7, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldCurrentNumberStationReturnToMin() {
        Radio radio = new Radio(10, 10, 0, 55, 100, 0);

        radio.increaseCurrentNumberStation();

        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldDecreaseCurrentNumberStation() {
        Radio radio = new Radio(6, 10, 0, 55, 100, 0);

        radio.decreaseCurrentNumberStation();

        assertEquals(5, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldCurrentNumberStationReturnToMax() {
        Radio radio = new Radio(0, 10, 0, 55, 100, 0);

        radio.decreaseCurrentNumberStation();

        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldGetCurrentNumberStation() {
        Radio radio = new Radio(6, 10, 0, 100, 100, 0);

        assertEquals(6, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldGetCurrentNumberStationOverMax() {
        radio.setCurrentNumberStation(11);

        assertEquals(6, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldGetCurrentNumberStationOnMin() {
        radio.setCurrentNumberStation(0);

        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldGetCurrentNumberStationBelowMin() {
        radio.setCurrentNumberStation(-3);

        assertEquals(6, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.increaseCurrentVolume();

        assertEquals(56, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeStopOnMax() {
        Radio radio = new Radio(6, 10, 0, 100, 100, 0);

        radio.increaseCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.decreaseCurrentVolume();

        assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeStopOnMin() {
        Radio radio = new Radio(6, 10, 0, 0, 100, 0);

        radio.decreaseCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}