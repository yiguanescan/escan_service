package com.yiguan.escan.domin.sys;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "sys_role")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 英文名称
     */
    private String enname;
    /**
     * 权限类型
     */
    private String roleType;
    /**
     * 数据范围
     */
    private String dataScope;//

    /**
     * 原角色名称
     */
    private String oldName;
    /**
     * 原英文名称
     */
    private String oldEnname;
    /**
     * 是否是系统数据
     */
    private String sysData;
    /**
     * 是否是可用
     */
    private String useable;


    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<User> userList;
}
