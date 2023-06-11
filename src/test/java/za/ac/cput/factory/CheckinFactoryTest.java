package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Checkin;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CheckinFactoryTest {

    @Test
    public void testObjectEquality() {
        Checkin checkin = new Checkin("hello","Petro");
        Checkin checkin2 = new Checkin("hello","Petro");

        assertNotEquals(checkin,checkin2,"Test Passed");

    }

    @Test
    public void testObjectIdentity() {
        Checkin checkin = new Checkin("hello","Petro");
        Checkin checkin2 = new Checkin("hello","Petro");

        assertNotSame(checkin,checkin2,"ObjectIdentity Test Passed");

    }

    @Test
    public void testObjectFailing() {
        Checkin checkin = new Checkin("hello","Petro");
        Checkin checkin2 = new Checkin("hello","Petro");

        assertNotEquals(checkin,checkin2,"Test Passed");

    }

    @Test
    @Timeout(value = 1000 ,unit = TimeUnit.MILLISECONDS)
    public void testTimeout() {
        Checkin checkin = new Checkin("hello","Petro");
        Checkin checkin2 = new Checkin("hello","Petro");

        assertNotEquals(checkin,checkin2,"Test Passed");

    }

    @Test
    @Disabled
    public void testDisabling() {
        Checkin checkin = new Checkin("hello","Petro");
        Checkin checkin2 = new Checkin("hello","Petro");

        assertEquals(checkin,checkin2,"Test Passed");

    }
}