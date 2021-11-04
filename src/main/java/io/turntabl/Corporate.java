package io.turntabl;

public class Corporate extends Client{

    private String accountManager;
    public Corporate(String name, int ID, ServiceLevel serviceLevel, String accountManager) {
        super(name, ID, serviceLevel);
        this.accountManager = accountManager;
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public String getContactName() {
        return this.accountManager;
    }

}
