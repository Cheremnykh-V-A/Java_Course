package Homeworks.HomeworkSeminar6;

import java.util.Objects;

public class Notebooks {
    /*
    1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    2. Создать множество ноутбуков (ArrayList).
    3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
    Выводить только те ноутбуки, что соответствуют условию
     */
    private String model;
    private Integer price;
    private String color;
    private Integer RamSize;
    private String videoCard;

    @Override
    public String toString() {
        return "Notebooks{" +
                "model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                ", minRamSize='" + RamSize + '\'' +
                ", videoCard='" + videoCard + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebooks notebooks = (Notebooks) o;
        return Objects.equals(model, notebooks.model) && Objects.equals(price, notebooks.price) && Objects.equals(color, notebooks.color) && Objects.equals(RamSize, notebooks.RamSize) && Objects.equals(videoCard, notebooks.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, color, RamSize, videoCard);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRamSize() {
        return RamSize;
    }

    public void setRamSize(Integer minRamSize) {
        this.RamSize = minRamSize;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String printInfo() {
        System.out.printf("Model: %s, Price: %s, Color: %s, RAM: %s, VideoCard: %s", model, price, color, RamSize, videoCard);
        return ".";
    }
}
