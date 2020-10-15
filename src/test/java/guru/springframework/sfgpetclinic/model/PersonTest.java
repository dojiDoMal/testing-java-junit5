package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    
    @Test
    void groupedAssertions(){
        Person person = new Person(1l, "Joe", "Buck");
        
        assertAll("Test Props Set",
            () -> assertEquals(person.getFirstName(), "Joe"),
            () -> assertEquals(person.getLastName(), "Buck")
        );
    }

    @Test
    void groupedAssetionMsgs(){
        Person person = new Person(1l, "Joe", "Buck");

        assertAll("Test Props Set",
            () -> assertEquals(person.getFirstName(), "Joe", "First Name Failed"),
            () -> assertEquals(person.getLastName(), "Buck", "Last Name Failed")
        );
    }


}
