package by.it.sc02_morning.golikov.lesson14;
/*
1) Создайте класс Car c конструктором и методами:
Car(int speed)      - конструктор должен сохранить скорость в приватном поле speed, например 60
void start()        - метод должен вывести в консоль строку "Автомобиль поехал со скоростью 60 км/ч"
void stop()         - метод должен вывести в консоль строку "Автомобиль остановился"
void beep()         - метод выводит на консоль строку "Автомобиль сигналит: Пи-бип!"
String toString()   - метод возвращает строку "Автомобиль"

2) Создайте класс Maz, который отличается от Car тем, что
    вместо слова "Автомобиль" везде пишет "Maz"
    не может ехать быстрее, чем 80 км/ч
    метод void beep(), который выводит на консоль строку "Maz сигналит: У-у-у-у!"

3) Создайте класс Mercedes, который отличается Car тем, что:
    вместо слова "Автомобиль" везде пишет "Mercedes"
    не может ехать быстрее, чем 200 км/ч
    метод void beep(), который выводит на консоль строку "Mercedes сигналит: Фа-фа!"

4) В методе main создайте массив из трех разных типов авто со скоростями 60 100 и 150 км/ч,
и для каждого из них в одном общем цикле выполните команды старт, сигнал и стоп.

Ограничения: слова Автомобиль Maz Mercedes должны быть использованы в коде
только один (!) раз как литералы (они не должны быть переменной или константой).
*/

public class TaskA1 {

    public static void main(String[] args) {

       // Car[] cars = new Car[][new Maz(60), new Mercedes(150)];
        Car[] cars = new Car[3];
        cars[0] = new Car(100);
        cars[1] = new Maz(60);
        cars[2] = new Mercedes(150);

        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
            cars[i].stop();
            cars[i].beep();
        }

//        Car car = new Car(100);
//        car.start();
//        car.stop();
//        car.beep();
//
//        car = new Maz(100);
//        car.start();
//        car.stop();
//        car.beep();
//
//        car = new Mercedes(150);
//        car.start();
//        car.stop();
//        car.beep();

    }

}
