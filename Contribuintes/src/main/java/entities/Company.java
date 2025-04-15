package entities;

public class Company extends TaxPayer{
    private double numberOfEmployee;

    public Company(){}

    public Company(String name, double anualIncome, double numberOfEmployee) {
        super(name, anualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    public double getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(double numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public double tax() {
        if (numberOfEmployee >10 ){
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
}
