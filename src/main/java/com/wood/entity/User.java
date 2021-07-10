package com.wood.entity;

import java.util.Date;

import javax.management.relation.Role;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;







/**
 * 后台管理用户
 * @author dell
 *
 */
@Entity
@Table(name="t_a_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "用戶名不能為空")
	private Integer id;
	@Column(length = 50)
	private String name;
	@ManyToOne
	@JoinColumn(name="roleId")
	private Role role;
	@Column(length = 200)
	private String pwd;
	@Column(length = 200)
	@NotNull(message = "真實姓名不能為空")
	private String trueName;
	@Column(length=200)
	private String remake;
	@NotNull(message = "排序號不能為空")
	@Column(length = 10)
	private Integer orderNo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDateTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getRemake() {
		return remake;
	}
	public void setRemake(String remake) {
		this.remake = remake;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public Date getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
}
