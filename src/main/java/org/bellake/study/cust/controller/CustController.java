package org.bellake.study.cust.controller;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.bellake.study.cust.dto.CustInfoDTO;
import org.bellake.study.cust.service.CustService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/custm")
@Api(tags = "Cust API", description = "고객 API")
public class CustController {
    private CustService custService;

    @GetMapping("/hello")
    public String sayHello() {
        return custService.sayHello();
    }

    @GetMapping("/v1")
    public CustInfoDTO retrieveCustInfo(Integer custNo){
        return custService.retrieveCustInfo(custNo);
    }

    @GetMapping("/v1/allcust")
    public List<CustInfoDTO> retrieveAllCust(){
        return custService.retrieveAllCust();
    }
    @PostMapping("/v1")
    public String createCust(CustInfoDTO custDto) {
        return custService.createCust(custDto);
    }
    @PutMapping("/v1")
    public String updateCust(CustInfoDTO custDto) {
        return custService.updateCust(custDto);
    }
}
