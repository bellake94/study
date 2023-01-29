package org.bellake.study.cust.entity.repository;

import org.bellake.study.cust.entity.CustMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustMRepository extends JpaRepository<CustMEntity, Integer> {

}
