package org.bellake.cust.repository;

import org.bellake.cust.entity.CustMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustMRepository extends JpaRepository<CustMEntity, String> {

}
