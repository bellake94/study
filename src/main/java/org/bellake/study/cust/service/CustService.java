package org.bellake.study.cust.service;

import lombok.AllArgsConstructor;
import org.bellake.study.cust.entity.CustMEntity;
import org.bellake.study.cust.repository.CustMRepository;
import org.bellake.study.cust.dto.CustInfoDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustService {
    private CustMRepository custMRepository;
    public String sayHello() {
        return "hellow World!";
    }
    public CustInfoDTO retrieveCustInfo(Integer custNo) {
        Optional<CustMEntity> custMEntity = custMRepository.findById(custNo);
        if (custMEntity.isPresent()) {
            CustMEntity entity = custMEntity.get();
            CustInfoDTO custInfo = new CustInfoDTO();
            custInfo.setCustNo(entity.getCustNo());
            custInfo.setCustNm(entity.getCustNm());
            custInfo.setCustAge(entity.getCustAge());
            return custInfo;
        } else {
            return null;
        }
    }

    public List<CustInfoDTO> retrieveAllCust() {
        return custMRepository.findAll().stream().map(entity -> {
            CustInfoDTO custInfo = new CustInfoDTO();
            custInfo.setCustNo(entity.getCustNo());
            custInfo.setCustNm(entity.getCustNm());
            custInfo.setCustAge(entity.getCustAge());
            return custInfo;
        }).collect(Collectors.toList());
    }

    public String createCust(CustInfoDTO custDto) {
        CustMEntity newEntity = new CustMEntity(custDto.getCustNo(), custDto.getCustNm(), custDto.getCustAge());
        custMRepository.save(newEntity);
        return custDto.getCustNo().toString();
    }

    public String updateCust(CustInfoDTO custDto) {
        if (custDto.getCustNo() != null) {
            Optional<CustMEntity> custMEntity = custMRepository.findById(custDto.getCustNo());

            custMEntity.ifPresent(entity -> {
                entity.update(custDto.getCustNm() == null ? entity.getCustNm() : custDto.getCustNm(),
                        custDto.getCustAge() == null ? entity.getCustAge() : custDto.getCustAge());

                custMRepository.save(entity);
            });

            return custDto.getCustNo().toString();
        }
        return null;
    }
}
