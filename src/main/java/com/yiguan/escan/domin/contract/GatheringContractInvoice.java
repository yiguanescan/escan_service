package com.yiguan.escan.domin.contract;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;


/**
 * 工程合同开票明细表Entity
 *
 */
@Table(name = "gathering_contract_invoice")
@Entity
@Data
public class GatheringContractInvoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	/** 序号(导出时用) */
	private int no = 1;

	/** 发票金额（元） */
	private BigDecimal invoiceAmount;
	/** 发票编号 */
	private String invoiceNo;
	/** 发票序号 */
	private String invoiceSn;
	/** 发票购买方名称 */
	private String invoiceBuyerName;
	/** 发票购买方纳税人识别号 */
	private String invoiceBuyerTin;
	/** 发票购买方地址电话 */
	private String invoiceBuyerTel;
	/** 发票购买方开户行和账号 */
	private String invoiceBuyerAccount;
	/** 发票销售方名称 */
	private String invoiceSellerName;
	/** 发票销售方纳税人识别号 */
	private String invoiceSellerTin;
	/** 发票销售方地址电话 */
	private String invoiceSellerTel;
	/** 发票销售方开户行和账号 */
	private String invoiceSellerAccount;
	/** 发票时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date invoiceTime;
	/** 发票信息（JSON） */
	private String invoiceImageUrl;
	/** 状态 */
	private Integer status;

	/** 发票时间From */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date invoiceTimeFrom;
	/** 发票时间To */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date invoiceTimeTo;



}