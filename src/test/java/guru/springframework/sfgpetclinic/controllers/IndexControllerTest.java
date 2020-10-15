package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {

    IndexController controller;
    
    @BeforeEach
    void setUp(){
        controller = new IndexController();
    }

    @Test
    void index(){
        assertEquals("index", controller.index());
    }

    @Test
    void oupsHandler(){

        assertThrows(ValueNotFoundException.class, () -> {
            controller.oopsHandler();
        });
        // assertTrue("notimplemented".equals(controller.oopsHandler()), () -> "Lambda expression message");
    }


    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);
            System.out.println("I got here");
        });
    }

    @Test
    void testTimeOutPrempt(){
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);
            System.out.println("I got here 242356536");
        });
    }
    
}
