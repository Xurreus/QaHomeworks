package HM9;

public class CompanyET extends Company {
    private String ownerName;
    private double initialCapital;
    private double actualCapital;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (!ownerName.isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Owner name cannot be empty.");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        if (initialCapital >= 0) {
            this.initialCapital = initialCapital;
        } else {
            System.out.println("Initial capital cannot be negative.");
        }
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public double calculateProfitToDate() {
        return actualCapital - initialCapital;
    }
}
