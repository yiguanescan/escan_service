package com.yiguan.escan.domin.sys;


import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "sys_area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String code; 	// 区域编码
    private String type; 	// 区域类型（1：国家；2：省份、直辖市；3：地市；4：区县）


    @OneToMany(mappedBy = "area",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Office> officeList;
}
