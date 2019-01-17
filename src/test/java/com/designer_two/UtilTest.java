package com.designer_two;

import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;
import java.util.Arrays;


public class UtilTest {
    @Test
    public void hashTest() {
        String hashStr = "$2a$10$2orAt7hLGmLGB58WxFK8V.yQ1xPde9CwTdB1XpaK0/1TeMnBeDuoy";
        boolean test = BCrypt.checkpw("admin", hashStr);
        System.out.println(test);
    }

    @Test
    public void lambdaTest() {
        char se = ',';
        Arrays.asList('a', 'b', 'c').forEach( (e) -> {
            System.out.print(e);
            System.out.println(se);
        });
    }
}
