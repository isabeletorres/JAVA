package entities;

public class Students {
    private double note1;
    private double note2;
    private double note3;

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }

    public double average(){
        return this.note1 + this.note2 + this.note3;
    }
    public String passedOrNot(){
        double avg = average();
        if (avg >= 60) {
            return "PASS";
        } else {
            double missingPoints = 60 - avg;
            return String.format("FAILED \nMISSING %.2f POINTS", missingPoints);
        }
    }
}
