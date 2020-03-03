package class_demos;

public class refugee_data {

    private int id;
    private int year;
    private String country;
    private double population;
    private double refugees;
    private double RefPerCap;

    public refugee_data(int id, int year, String country, double population, double refugees, double refPerCap) {
        this.id = id;
        this.year = year;
        this.country = country;
        this.population = population;
        this.refugees = refugees;
        this.RefPerCap = refPerCap;
    }

    public refugee_data() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getRefugees() {
        return refugees;
    }

    public void setRefugees(double refugees) {
        this.refugees = refugees;
    }

    public double getRefPerCap() {
        return RefPerCap;
    }

    public void setRefPerCap(double refPerCap) {
        this.RefPerCap = refPerCap;
    }

    @Override
    public String toString() {
        return "refugee_data{" +
                "id=" + id +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", refugees=" + refugees +
                ", RefPerCap=" + RefPerCap +
                '}';
    }

}