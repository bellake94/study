package org.bellake.cust.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CustService {
    public String sayHello() {
        return "hellow World!";
    }
}
