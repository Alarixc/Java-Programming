package Car;
public class Car {
    int num;
    // inner class
    private class Engine {
        public void print()
        {
            System.out.println("This is Engine class inside the CAR class");
        }
    }
    // Accessing the inner class from the method within
    void display_Inner() {
        Engine engine = new Engine();
        engine.print();
    }
}