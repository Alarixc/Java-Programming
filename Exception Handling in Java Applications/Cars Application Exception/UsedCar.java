package Cars;
import java.lang.*;

public class UsedCar {
    String vin;
    String make;
    int year;
    double mileage;
    double price;
    public UsedCar(String vin, String make, int year, int mileage, int price) throws UsedCarException {
        if (vin.length()!=4)
            throw new UsedCarException(vin);
        if((!make.equals("Ford"))&& (!make.equals("Honda"))&& (!make.equals("Toyota"))&&
                (!make.equals("Chrysler"))&& (!make.equals("Other")))
            throw new UsedCarException("Exception: Invalid make");
        if(year<1990||year>2014)
            throw new UsedCarException("Excepetion: Invalid year");
        if(mileage<0)
            throw new UsedCarException("Excepetion: Invalid mileage");
        if(price<0)
            throw new UsedCarException("Excepetion: Invalid price");
        this.vin=vin;
        this.make=make;
        this.year=year;
        this.mileage=mileage;
        this.price=price;
    }
    public String toString() {
        return "VIN " + vin + " Make: " + make + "\n Year: " + year + " " + mileage + " miles $" + price;
    }
}
