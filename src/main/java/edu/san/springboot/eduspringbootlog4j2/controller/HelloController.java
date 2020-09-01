package edu.san.springboot.eduspringbootlog4j2.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
public class HelloController {

    @Value("logging.pattern.console")
    private String logPattern;

    @GetMapping("/sayHello")
    public String hello() {
        log.info("logPattern => " + logPattern);
        log.info("Inside hello()");
        log.debug("Inside hello() DEBUG LOG");
//        dumpLogFile();
        return "Hello Me!";
    }

    private void dumpLogFile() {
        for (int i = 0; i < 100_00; i++) {
            log.info("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        }
    }

}
