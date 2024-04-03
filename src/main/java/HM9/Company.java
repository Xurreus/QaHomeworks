package HM9;
public class Company implements InvoiceIssuable {
    private String company;
    private String bulstat;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length() == 10) {
            this.bulstat = bulstat;
        } else {
            System.out.println("Bulstat must be 10 characters long.");
        }
    }

    @Override
    public void issueInvoice() {
        System.out.println("Issuing the invoice...");
    }
}
