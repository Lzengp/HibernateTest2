package cn.hnust.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户实体类
 * @author 龙伟
 * 2018年9月17日
 */
public class SysUser implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Long userId;
	private String userName;
	private String userPassword;
	private Integer userState;
	
	//多对多关系映射：一个用户可以演多个角色
	private Set<SysRole> roles = new HashSet<SysRole>(0);
	
	public Set<SysRole> getRoles() {
		return roles;
	}
	public void setRoles(Set<SysRole> roles) {
		this.roles = roles;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getUserState() {
		return userState;
	}
	public void setUserState(Integer userState) {
		this.userState = userState;
	}
	@Override
	public String toString() {
		return "SysUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userState=" + userState + "]";
	}
	
	
	
}
