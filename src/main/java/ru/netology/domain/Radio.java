package ru.netology.domain;

public class Radio {

    static final int maxStation = 9;//max, конечная станция
    static final int minStation = 0;//min, начальная станция
    private int currentStation;// текущая станция
    static final int maxVolume = 10;// max громкость
    static final int minVolume = 0;// min громкость
    private int currentVolume; // текущая громоксть

    public int getCurrentStation() {
        return currentStation;
    } //получить текущую стаанцию. Возврат текущей станции

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setSelectStation(int selectStation) { //выбор номера станции напрямую
        if (selectStation < minStation || selectStation > maxStation) {
            return;
        }
        this.currentStation = selectStation;
    }

    public void setNextStation() { //след станция
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void setPrevStation() { //пред станция
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setVolumeUp() { //повышение громкости
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void setVolumeDown() { //понижение громкости
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }

}
