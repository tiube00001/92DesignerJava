package com.designer_two;

import com.designer_two.compoent.SpringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(SpringUtils.class)
@SpringBootApplication
@MapperScan("com.designer_two.mp.mapper")
public class DesignerTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignerTwoApplication.class, args);
    }

}

