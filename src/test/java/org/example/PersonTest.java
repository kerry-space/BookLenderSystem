package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest extends TestCase {
    Person kerry  = new Person("kerry", "space");
    @Test
    public void testGetPersonId() {

        int expectedId = 101;
        int actualId = kerry.getPersonId();
        Assert.assertEquals(expectedId, actualId);
    }

    public void testSetFirstName() {

    }

    public void testGetFirstName() {
    }

    public void testSetLastName() {
    }

    public void testGetLastName() {
    }

    public void testLoanBook() {

    }

    public void testDisplayBooks() {
    }
}