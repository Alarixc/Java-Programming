package Cars;

public class ThrowUsedCarException {
    public static void main(String[] args) throws UsedCarException {
        UsedCar[] car = new UsedCar[7];
        try {
            car[0] = new UsedCar("123", "Ford", 1998, 56, 400000);
            System.out.println(car[0].toString() + " is successful");
        }catch (UsedCarException e) {
            System.out.println(e.getMessage());
        }
        try {
            car[1] = new UsedCar("1245", "Honda", 1998, 89, 2600000);
            System.out.println(car[1].toString() + " is successful");
        }catch (UsedCarException e) {
            System.out.println(e.getMessage());
        }
        try {
            car[2] = new UsedCar("12581", "Chrysler", 1995, 77, 9000000);
            System.out.println(car[2].toString() + " is successful");

        }catch(UsedCarException e) {
            System.out.println(e.getMessage());
        }
        try {
            car[3] = new UsedCar("1261", "Mercedes", 1998, -67, 6700000);
            System.out.println(car[3].toString() + " is successful");

        }catch (UsedCarException e){
            System.out.println(e.getMessage());
        }
        try {
            car[4] = new UsedCar("1273", "Toyota", 1998, 45, -700000);
            System.out.println(car[4].toString() + " is successful");
        }catch (UsedCarException e) {
            System.out.println(e.getMessage());
        }
        try {
            car[5] = new UsedCar("1219", "BMW", 2005, 78, 2000000);
            System.out.println(car[5].toString() + " is successful");
        }catch (UsedCarException e) {
            System.out.println(e.getMessage());
        }
        try {
            car[6] = new UsedCar("1295", "Toyota", 1998, 67, 1000000);
            System.out.println(car[6].toString() + " is successful");
        }catch (UsedCarException e){
            System.out.println(e.getMessage());
        }

    }
}


