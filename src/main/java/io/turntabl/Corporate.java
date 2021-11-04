package io.turntabl;

public class Corporate extends Client{
    public Corporate(String name, int ID, ServiceLevel serviceLevel, String accountManager) {
        super(name, ID, serviceLevel);
        this.accountManager = accountManager;
    }

    private String accountManager;


}
