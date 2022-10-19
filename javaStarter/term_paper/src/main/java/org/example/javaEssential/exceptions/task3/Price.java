package org.example.javaEssential.exceptions.task3;

public class Price {
    private String nameGoods;
    private String nameStory;
    private double costNameGoods;

    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    public String getNameStory() {
        return nameStory;
    }

    public void setNameStory(String nameStory) {
        this.nameStory = nameStory;
    }

    public double getCostNameGoods() {
        return costNameGoods;
    }

    public void setCostNameGoods(double costNameGoods) {
        this.costNameGoods = costNameGoods;
    }

    @Override
    public String toString() {
        return "\n=================================" +
                "\n\tnameGoods = " + nameGoods +
                "\n\tnameStory = " + nameStory +
                "\n\tcostNameGoods = " + costNameGoods;
    }
}
