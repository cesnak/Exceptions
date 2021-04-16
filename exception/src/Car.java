public class Car {

    String brand;
    int numberOfWheels;
    boolean roof;

    public Car(String brand, int numberOfWheels, boolean roof) {
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.roof = roof;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public void exception () throws WrongNumberOfWheels {
        if (numberOfWheels > 4){
            throw new WrongNumberOfWheels("Wrong Number Of Wheels");
        }else{
            System.out.println("Number Of Wheels is OK");
        }
    }

    public void runTimeException (){
        if (brand.length() > 3){
            throw new InvalidCommand("Brand name cannot be longer than 3 characters");
        }else{
            System.out.println("Brand is OK");
        }

    }

    public void exceptionsTogether() throws WrongNumberOfWheels {
        if (numberOfWheels > 4){
            throw new WrongNumberOfWheels("Wrong Number Of Wheels");
        }else{
            System.out.println("Number Of Wheels is OK");
        }
        if (brand.length() > 3){
            throw new InvalidCommand("Brand name cannot be longer than 3 characters");
        }else{
            System.out.println("Brand is OK");
        }

    }


}
