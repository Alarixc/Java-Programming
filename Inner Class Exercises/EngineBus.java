package Bus;


class EngineBus {
    // An anonymous class with Demo as base class
    static Bus busobj = new Bus() {
        void show() {
            System.out.println("i am in Engine Bus class");
        }
    };

    public static void main(String[] args) {
        busobj.show();
    }
}



