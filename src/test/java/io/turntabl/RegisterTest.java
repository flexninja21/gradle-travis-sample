package io.turntabl;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




import static org.junit.jupiter.api.Assertions.*;

public class RegisterTest {
    List<Corporate> CorporateList = List.of(new Corporate("Godric", 1, ServiceLevel.Platinum, "Edem"),
            new Corporate("Judith", 2, ServiceLevel.Platinum, "Sam"),
            new Corporate("Hanson",3, ServiceLevel.Gold, "Alex"));

    List<Private> PrivateList = List.of(new Private("Philip", 6, ServiceLevel.Premium),
            new Private("Natalia", 4, ServiceLevel.Gold),
            new Private("Aisha", 5, ServiceLevel.Platinum));

    Register register = new Register(CorporateList, PrivateList);


    @Test
    public void getContactNameTest(){
        Client clients = new Corporate("Godric", 234, ServiceLevel.Platinum, "Edem");
        String expectedValue = "Edem";
        String contactName = clients.getContactName();
        assertEquals(expectedValue, contactName);
    }

    @Test
    public void getAllGoldClientsTest(){
        List<String> expectedValue = List.of("Alex", "Natalia");
        List<String> contactNames = register.getGoldClients();
        assertEquals(expectedValue, contactNames);
    }

    @Test
    public void getClientNameByIdTest(){
        String expectedValue = "Aisha";
        String getNameById = register.getClientNameById(5);
        assertEquals(expectedValue, getNameById);
    }

//    private void assertEquals(String expectedValue, String getNameById) {
//    }

    //@Test
    public void countClientsByServiceLevelTest(){

        Map<String, Long> mapCount= new HashMap<>();
        mapCount.put("Platinum",3l);
        mapCount.put("Premium", 1l);
        mapCount.put("Gold", 2l);
        assertEquals(mapCount,register.countClientsByServiceLevel());
    }
}