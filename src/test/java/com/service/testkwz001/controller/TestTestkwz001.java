package com.service.testkwz001.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestkwz001 {

        Testkwz001Delegate testkwz001Delegate = new Testkwz001Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testkwz001Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}