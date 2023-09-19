package Age;
class AnonymousDemo {
    // Main driver method
    public static void main(String[] args)
    {
        Age oj1 = new Age() {
            @Override public void getAge()
            {
                // printing age
                System.out.print("Age is " + x);
            }
        };
        oj1.getAge();
    }
}