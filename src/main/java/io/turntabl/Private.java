package io.turntabl;

public class Private extends Client{
    private String person;
    public Private(String name, int ID, ServiceLevel serviceLevel, String person) {
        super(name, ID, serviceLevel);
        this.person = person;
    }
}
