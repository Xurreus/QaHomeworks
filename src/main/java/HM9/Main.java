package HM9;

public class Main {
    public static void main(String[] args) {
        CompanyET companyET = new CompanyET();
        companyET.setCompany("Little Chickens");
        companyET.setBulstat("8594744331");
        companyET.setOwnerName("Milko Kalaidjiev");
        companyET.setInitialCapital(20000.0);
        companyET.setActualCapital(78000.0);

        double profitToDate = companyET.calculateProfitToDate();
        System.out.println("Profit to date:" + profitToDate);
        System.out.println("Company name:" + companyET.getCompany());
        System.out.println("Bulstat:" + companyET.getBulstat());
        System.out.println("The Owner:" + companyET.getOwnerName());

        companyET.issueInvoice();
    }
}
