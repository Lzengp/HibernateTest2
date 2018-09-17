package cn.hnust.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 角色实体类
 * @author 龙伟
 * 2018年9月17日
 */
public class SysRole implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long roleId;
	private String roleName;
	private String rolePassword;
	private String roleMome;
	
	//多对多关系映射：一个角色可以让多个用户演
	private Set<SysUser> users = new HashSet<SysUser>(0);
	
	public Set<SysUser> getUsers() {
		return users;
	}
	public void setUsers(Set<SysUser> users) {
		this.users = users;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRolePassword() {
		return rolePassword;
	}
	public void setRolePassword(String rolePassword) {
		this.rolePassword = rolePassword;
	}
	public String getRoleMome() {
		return roleMome;
	}
	public void setRoleMome(String roleMome) {
		this.roleMome = roleMome;
	}
	@Override
	public String toString() {
		return "SysRole [roleId=" + roleId + ", roleName=" + roleName + ", rolePassword=" + rolePassword + ", roleMome="
				+ roleMome + "]";
	}
	
	
	
}
