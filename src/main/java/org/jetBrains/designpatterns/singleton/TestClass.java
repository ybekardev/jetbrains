package org.jetBrains.designpatterns.singleton;

import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void testFileName(){
        String sf = SingletonFile.getInstance();
        System.out.println(sf);
        String sf2 = SingletonFile.getInstance();
        System.out.println(sf2);
        String sf3 = SingletonFile.getInstance();
        System.out.println(sf3);
    }


}
