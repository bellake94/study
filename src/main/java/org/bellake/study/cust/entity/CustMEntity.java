package org.bellake.study.cust.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@EqualsAndHashCode(callSuper = false)
@Table(name = "TB_CUST_M")
public class CustMEntity {
    @Id
    @Column(name = "CUST_NO")
    private Integer custNo;
    @Column(name = "CUST_NM")
    private String custNm;
    @Column(name = "CUST_AGE")
    private Integer custAge;
}
