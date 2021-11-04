package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Client> clients =new ArrayList<>();

    public Register(List<Client> clients) {
        this.clients = clients;
    }
    public void addClient(Client client){
        clients.add(client);
    }
}
