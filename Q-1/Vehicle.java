public class Vehicle {
    private String make;
    private String vehicleNumber;
    private String fuelType;
    private Integer fuelCapacity;
    private Integer cc;

    public Vehicle(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public void displayMake(){
        System.out.println("Make is: "+make);
    }
    public void displayBasicInfo(){
        System.out.println("Vehicle Number is: "+vehicleNumber+"\nFuel Capacity: "+fuelCapacity+"\nFuel Type: "+fuelType+"\nCC: "+cc);
    }
    public void displayDetailInfo(){
        //
    }
}
