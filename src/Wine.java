import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name;
    private String brand;
    private String country;
    private LocalDate dateOfBottling;

    // Constructor
    public Wine(String name, String brand, String country, LocalDate dateOfBottling) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.dateOfBottling = dateOfBottling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getAgeInYears() {
        LocalDate now = LocalDate.now();
        Period age = Period.between(dateOfBottling, now);
        return age.getYears();
    }

    public LocalDate getDateOfBottling() {
        return dateOfBottling;
    }

    public void setDateOfBottling(LocalDate dateOfBottling) {
        this.dateOfBottling = dateOfBottling;
    }





    @Override
    public String toString() {
        return "Wine{" +
                "name:  " + name + '\'' +
                " brand:  " + brand + '\'' +
                " country:  " + country + '\'' +
                " dateOfBottling:  " + dateOfBottling +
                '}';
    }


}
