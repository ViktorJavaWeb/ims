package org.example.javaAdvanced.iterator_and_Comparator.task3.ex_004_comparable.interface_comparable;

public class Car implements Comparable<Car> { //<Car>{
    Integer speed;
    Integer price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.speed + " " + this.price + " " + this.model + " " + this.color;
    }

    // Сортируем по скорости/цене
/*    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            return this.price - ((Car)o).price;
        } else {
            return temp;
        }
    }*/

    @Override
    public int compareTo(Car o) {
        int temp = this.speed.compareTo(o.speed);
        if (temp == 0) {
            temp = this.price.compareTo(o.price);
            if (temp == 0) {
                temp = this.model.compareTo(o.model);
                if (temp == 0) {
                    temp = this.color.compareTo(o.color);
                }
            }
        }
        return temp;

    }

    ;
}


// Сравнение 2-х строковых значений
// return this.model.compareTo((Car)o).model);
