package org.example.javaEssential.static_and_Nested_Classes_Anonymous_classes_and_Enums.task4;

public enum Vehicles {
    BMW(120.4){
        @Override
        public String getColor() {
            return "White";
        }
    },
    OPEL(1500.00){
        @Override
        public String getColor() {
            return "Black";
        }
    };
    private double costAuto;

    private Vehicles(double cost){
        this.costAuto = cost;
    }
    public abstract String getColor();

    @Override
    public String toString() {
        return "Vehicles:" +
                "\n\tName auto = " + this.name()+
                "\n\tcolor = " + this.getColor()+
                "\n\tcost Auto = " + costAuto;

    }
}
