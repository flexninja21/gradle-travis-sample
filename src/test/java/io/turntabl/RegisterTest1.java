//introduced to check whywmy testing was not working ...reason some junit imports were wacky
//package io.turntabl;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class RegisterTest1 {
//    List<Corporate> CorporateList = List.of(new Corporate("Godric", 1, ServiceLevel.Platinum, "Edem"),
//            new Corporate("Judith", 2, ServiceLevel.Platinum, "Sam"),
//            new Corporate("Hanson",3, ServiceLevel.Gold, "Alex"));
//
//    List<Private> PrivateList = List.of(new Private("Philip", 6, ServiceLevel.Premium),
//            new Private("Natalia", 4, ServiceLevel.Gold),
//            new Private("Aisha", 5, ServiceLevel.Platinum));
//
//    Register register = new Register(CorporateList, PrivateList);
//
//    @Test
//    void getGoldClients() {
//        List<String> expectedValue = List.of("Hanson", "Natalia");
//        List<String> contactNames = register.getGoldClients();
//        assertEquals(expectedValue, contactNames);
//    }
//}