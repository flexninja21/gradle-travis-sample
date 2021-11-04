package io.turntabl;

public class Private extends Client{
    public Private(String name, int ID, ServiceLevel serviceLevel) {
        super(name, ID, serviceLevel);
    }

    @Override
    public String getContactName() {
        return this.getName();
    }
}
