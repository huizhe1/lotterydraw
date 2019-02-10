package xyz.huizhe.lotterydraw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("xyz.huizhe.lotterydraw.mapper")
@EnableWebMvc
public class LotterydrawApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotterydrawApplication.class, args);
    }

}

