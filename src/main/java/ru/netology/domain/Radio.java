package ru.netology.domain;

public class Radio {

    /* static final int maxStation = 9;//max, конечная радиостанция (1 -вариант, до доработки)*/
    private int maxStation;//max, конечная радиостанция
    //static final int minStation = 0;//min, начальная радиостанция (1 -вариант, до доработки)
    private int minStation;//min, начальная радиостанция (доработка)
    /*private int quantityStation = 10;// количество радиостанций (1 -вариант до доработки)*/
    private /*static final*/ int currentStation;// текущая радиостанция (доработка -убрал кл слово Final поскольку оно предполагает,
    // что значение  не может быть изменено) )
    static final int maxVolume = 100;// max громкость
    static final int minVolume = 0;// min громкость
    private int currentVolume; // текущая громоксть


    public Radio() {
        this.minStation = 0;
        this.maxStation = 9;
    }//макс и мин номер станции по умолчанию

    /*public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }//добавил конструктор Radio с кол-вом станиций по умолчанию = 10  - вар.1 (до доработки)
     */

    public Radio(int counterStation) {
        this.maxStation = counterStation - 1;
    }//конструктор принимающий параметром желаемое количество радиостанций и сохраняющий это значение у себя в поле.

    public int getCurrentStation() {
        return currentStation;
    } //получить текущую радиостанцию. Возврат текущей радиостанции

    /* public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation; - вар.1 (до доработки)
    }

    public void setSelectStation(int selectStation) { //выбор номера станции напрямую.
        // Выбранная станция будет всегда находиться в обозначенном диапазоне. Если не применить сеттер такого вида
        // пользователь может установить любое значение.
        if (selectStation < minStation || selectStation > maxStation) {
            return;
        }
        this.currentStation = selectStation;*/

    public void setCurrentStation(int currentStation) { // доработка сеттера (ключевое место)
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() { //след радиостанция.  Принцып закольцованной конвейрной ленты которая движется по кругу.
        // В данном случае в прямом направлении.
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void setPrevStation() { //пред радиостанция. Принцып закольцованной конвейронй ленты которая движется по кругу.
        // В данном случае в обратном направлении.
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

    /* public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }*/
}
