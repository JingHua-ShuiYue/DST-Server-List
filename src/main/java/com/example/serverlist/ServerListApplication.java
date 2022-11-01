package com.example.serverlist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/serverlist/dao")
public class ServerListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerListApplication.class, args);
    }

}
