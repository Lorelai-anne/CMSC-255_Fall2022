package Labs.Lab12;

public class DriversLicense extends IDCard{
    private int expirationYear;
    private Month expirationMonth;

    public DriversLicense(){
        super();
        expirationYear = 1969;
        expirationMonth = Month.JANUARY;
    }
    public DriversLicense(String name,int IDNumber,int expirationYear, Month expirationMonth){
        super(name, IDNumber);
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
    }

    public String toString(){
        return super.toString() + " Expiration Month & Year: " + expirationMonth +" "+ expirationYear;
    }
}
