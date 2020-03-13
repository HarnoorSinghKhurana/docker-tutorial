package com.hsk.docker.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ControllerTest {

    @InjectMocks
    private Controller controller;

    @Test
    public void test_one(){
        Assert.assertEquals(controller.getResponse() ,"Welcome");
    }
}