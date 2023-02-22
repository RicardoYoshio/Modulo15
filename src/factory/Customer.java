package factory;

public class Customer {

    private String grandeRequest;
    private boolean hasCompanyContract;

    public Customer(String grandeRequest, boolean hasCompanyContract) {
        this.grandeRequest = grandeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }
    public String getGrandeRequest() {
        return grandeRequest;
    }
    public boolean isHasCompanyContract() {
        return hasCompanyContract;
    }
}

