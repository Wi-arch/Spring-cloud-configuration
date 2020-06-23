package by.education.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MainController {

    @Value("${text.default.string}")
    private String string;

    @GetMapping("/get")
    public String getString() {
        return string;
    }
}