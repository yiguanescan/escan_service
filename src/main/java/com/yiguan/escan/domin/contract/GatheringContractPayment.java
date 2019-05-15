package com.yiguan.escan.domin.contract;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

/**
 * 工程合同付款明细表Entity

 */
@Table(name = "gathering_contract_payment")
@Entity
@Data
public class GatheringContractPayment{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	/** 序号(导出时用) */
	private int no = 1;
	/** 付款金额（元） */
	private BigDecimal paidAmount;
	/** 付款人ID */
	private String paidUserId;
	/** 付款人名 */
	private String paidUserName;
	/** 付款时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date paidTime;
	/** 付款凭证信息（JSON） */
	private String paidImageUrl;
	/** 付款人 */
	private String gatheringUserName;
	
    private String dutyParagraph;

    private String bankOfDeposit;

    private String account;

    private String linkmanId;

    private String linkmanName;

    private String phone;

    private String email;

    private String customerName;

    private String address;

    private String zipCode;
	/** 状态 */
	private Integer status;

	/** 付款时间From */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date paidTimeFrom;
	/** 付款时间To */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date paidTimeTo;
	
}