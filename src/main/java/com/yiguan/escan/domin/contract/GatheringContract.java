package com.yiguan.escan.domin.contract;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;


/**
 * 工程合同表Entity
 *
 */
@Table(name = "gathering_contract")
@Entity
@Data
public class GatheringContract  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	/**
	 *  序号(导出时用)
	 */
	private int no;
	/**
	 * 合同编号
	 */
	private String sn;
	/**
	 * 合同名称
	 */
	private String name;
	/**
	 * 合同图片（json）
	 */
	private String imageUrl;
	/**
	 * 甲方名
	 */
	private String partyFirst;
	/**
	 * 乙方名
	 */
	private String partySecond;
	/**
	 * 开始时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startTime;
	/**
	 * 结束时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endTime;
	/**
	 * 合同签订时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date signTime;
	/**
	 * 合同金额（元）
	 */
	private BigDecimal contractAmount;
	/**
	 * 审计结算价（元）
	 */
	private BigDecimal settlementAmount;
	/**
	 * 累计付款金额（元）
	 */
	private BigDecimal paidAmount;
	/**
	 * 应付未付款（元）
	 */
	private BigDecimal restAmount;
	/**
	 * 累计开票金额（元）
	 */
	private BigDecimal invoiceAmount;
	/**
	 * 未开票金额（元）
	 */
	private BigDecimal invoiceRestAmount;
	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 合同签订时间From
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date signTimeFrom;
	/**
	 * 合同签订时间To
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date signTimeTo;
	/**
	 * 应付未付款状态 */
	private Integer restAmountStatus;
	/**
	 * 未开票状态
	 */
	private Integer invoiceRestAmountStatus;
	

}