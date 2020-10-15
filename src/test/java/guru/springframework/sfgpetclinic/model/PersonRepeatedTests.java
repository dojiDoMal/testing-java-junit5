package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.RepeatedTest;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;

public class PersonRepeatedTests implements ModelRepeatedTests {
    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} | {totalRepetition}")
    void testWithRepetition(){
        
    }
}
