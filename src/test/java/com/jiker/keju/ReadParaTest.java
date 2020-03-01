package com.jiker.keju;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadParaTest {
    @Test
    public void should_return_distance(){
        ReadPara readPara = new ReadPara("1公里，等待0分钟");
        assertEquals(1, readPara.getDistance());
        readPara = new ReadPara("10公里，等待0分钟");
        assertEquals(10, readPara.getDistance());
    }

    @Test
    public void should_return_waitTime(){
        ReadPara readPara = new ReadPara("1公里，等待0分钟");
        assertEquals(0, readPara.getWaitTime());
        readPara = new ReadPara("2公里，等待3分钟");
        assertEquals(3, readPara.getWaitTime());
    }
}
