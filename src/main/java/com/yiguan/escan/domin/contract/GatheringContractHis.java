/**
 * 
 * @Description: 
 * @author 胡春毅
 * @date 2019年4月2日 上午11:38:40
 * @version 1.0
 */

package com.yiguan.escan.domin.contract;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

import javax.persistence.*;

/** 
 * @Description: 工程合同历史表Entity
 */
@Table(name = "gathering_contract_his")
@Entity
@Data
public class GatheringContractHis{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	/**
     * 历史编号
     */
	private Integer hisSeq;
	/**
     * 历史类型
     */
	private String hisType;
	/**
     * 历史备注
     */
	private String hisMemo;
	/**
     * 历史时间
     */
	private Date hisTime;
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
	private Date startTime;
	/**
     *  结束时间
     */
	private Date endTime;
	/**
     * 合同签订时间
     */
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
     *  状态
     */
	private Integer status;
}
