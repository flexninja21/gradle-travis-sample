package io.turntabl;

import java.util.List;

public class Client {
    private String name;
    private int ID;
    private ServiceLevel serviceLevel;

    public Client(String name, int ID, ServiceLevel serviceLevel) {
        this.name = name;
        this.ID = ID;
        this.serviceLevel = serviceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
