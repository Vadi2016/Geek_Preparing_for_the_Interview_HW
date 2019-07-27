// To describe the mistakes in the code

interface Moveable{
    void start();
    void move();
}

interface Stopable{
    void stop();
}

abstract class Car implements Moveable, Stopable {
//    public Engine engine; - No Engine class
    private String color;
    private String name;


    public void start(){
        System.out.println("Car starting");
    }

    abstract void open();

//    public Engine getEngine() {
//        return engine;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class LightWeightCar extends Car {

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {

    }
}

//class Lorry extends Car, Moveable, Stopable{ // Multiple inheritance
//
//    public void move(){
//        System.out.println("Car is moving");
//    }
//
//    public void stop(){
//        System.out.println("Car is stop");
//    }
//}

class Lorry extends Car { // Multiple inheritance

    @Override
    void open() {
        System.out.println("Car is open");
    }

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }
}
