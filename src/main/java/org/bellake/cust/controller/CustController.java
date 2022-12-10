package org.bellake.cust.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.bellake.cust.service.CustService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/custm")
@Api(tags = "Cust API", description = "고객 API")
public class CustController {
    private final CustService custService;

    @GetMapping("/hello")
    public String sayHello() {
        return custService.sayHello();
    }
}
