package com.yiguan.escan.domin.sys;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name= "sys_user")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	/**
	 * 登录名
	 */
	@Column(name = "login_name", nullable = false)
	private String loginName;
	/**
	 * 工号
	 */
	private String no;        
	/**
	 * 登录名
	 */
	private String password;
	
	/**
	 * 头像
	 */
	private String photo;    
	/**
	 * 姓名
	 */
	private String name;    
	/**
	 * 姓名英文
	 */
	private String enname;    
	/**
	 * 邮箱
	 */
	private String email;    
	/**
	 * 电话
	 */
	private String phone;    
	/**
	 * 手机
	 */
	private String mobile;    
	/**
	 * 用户类型
	 */
	@Column(name = "user_type", nullable = false)
	private String userType;

	/**
	 * 最后登陆IP
	 */
	@Column(name = "login_ip", nullable = false)
	private String loginIp;    
	/**
	 * 最后登陆日期
	 */
	@Column(name = "login_date", nullable = false)
	private Date loginDate;    
	/**
	 * 是否允许登陆
	 */
	@Column(name = "login_flag", nullable = false)
	private String loginFlag;

	/**
	 * 可选属性optional=false,表示role不能为空。
	 */
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
	@JoinColumn(name = "role_id")
	private Role role;
}
