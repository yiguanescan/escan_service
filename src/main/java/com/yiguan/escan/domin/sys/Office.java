package com.yiguan.escan.domin.sys;

import lombok.Data;
import javax.persistence.*;

/**
 * 机构Entity
 */
@Entity
@Data
@Table(name = "sys_office")
public class Office{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 机构编码
     */
    private String code;    
    /**
     * 机构名称
     */
    private String enname;    
    /**
     * 机构类型（1：公司；2：部门；3：小组）
     */
    private String type;    
    /**
     * 机构等级（1：一级；2：二级；3：三级；4：四级）
     */
    private String grade;    
    /**
     * 联系地址
     */
    private String address; 
    /**
     * 邮政编码
     */
    private String zipCode; 
    /**
     * 负责人
     */
    private String master;    
    /**
     * 电话
     */
    private String phone;    
    /**
     * 传真
     */
    private String fax;    
    /**
     * 邮箱
     */
    private String email;    
    /**
     * 是否可用
     */
    private String useable;

    /**
     * 归属区域
     */
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "area_id")
    private Area area;         
}
