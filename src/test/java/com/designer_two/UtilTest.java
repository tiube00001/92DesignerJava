package com.designer_two;

import com.designer_two.mp.entity.User;
import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.Timestamp;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


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

    @Test
    public void timeTest() {


        //日期转换为字符串
        long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();

        System.out.println(new Timestamp((new Date()).getTime()));


//        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String nowStr = now.format(format);
//        System.out.println(nowStr);
    }
    @Test
    public void lombok() {
        User user = new User();
        user.setId(1);
        user.setName("user");
        System.out.println(user);
    }
}
