package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {
    private List<Corporate> corporateList;
    private List<Private> privateList;


    public Register(List<Corporate> corporateList, List<Private> privateList) {
        this.corporateList = corporateList;
        this.privateList = privateList;
    }

    public List<Client> totalList() {
        return Stream.concat(corporateList.stream(), privateList.stream()).collect(Collectors.toList());
    }

    public List<String> getGoldClients() {
        return totalList().stream().filter(s -> s.getServiceLevel() == ServiceLevel.Gold).map(Client::getContactName).collect(Collectors.toList());
    }

    public String getClientNameById(int ID) {
        return totalList().stream().filter(cid -> cid.getID() == ID).map(cid -> cid.getName()).findAny().orElse("");
    }

    public Map<ServiceLevel, Long> countClientsByServiceLevel() {
        return totalList().stream().collect(Collectors.groupingBy(l -> l.getServiceLevel(), Collectors.counting()));
    }
}