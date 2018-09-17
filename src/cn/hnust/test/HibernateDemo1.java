package cn.hnust.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.hnust.domain.SysRole;
import cn.hnust.domain.SysUser;
import cn.hnust.util.HibernateUtil;

/**
 * 多对多增删操作
 * @author 龙伟
 * 2018年9月17日
 */
public class HibernateDemo1 {

	/*
	 * 保存操作
	 * 	 需求：
	 * 		创建2个用户和3个角色
	 * 		让1号用户具备1号和2号角色
	 * 		让2号用户具备2号和3号角色
	 * 		保存用户和角色
	 */
	@Test
	public void test1() {
		//创建2个用户
		SysUser user1 = new SysUser();
		user1.setUserName("用户1");
		SysUser user2 = new SysUser();
		user2.setUserName("用户2");
		//创建3个角色
		SysRole role1 = new SysRole();
		role1.setRoleName("角色1");
		SysRole role2 = new SysRole();
		role2.setRoleName("角色2");
		SysRole role3 = new SysRole();
		role3.setRoleName("角色3");
		//让1号用户具备1号和2号角色(双向：让1号2号角色有1号用户)
		user1.getRoles().add(role1);
		user1.getRoles().add(role2);
		
		role1.getUsers().add(user1);
		role2.getUsers().add(user1);
		//让2号用户具备2号和3号角色(双向：让2号3号角色有2号用户)
		user2.getRoles().add(role2);
		user2.getRoles().add(role3);
		
		role2.getUsers().add(user2);
		role3.getUsers().add(user2);
		//保存用户和角色
		Session session = HibernateUtil.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.save(role1);
		session.save(role2);
		session.save(role3);
		//提交事务
		tx.commit();
	}
		/*
		 * 删除操作
		 */
		@Test
		public void test2() {

			Session session = HibernateUtil.getCurrentSession();
			Transaction tx = session.beginTransaction();
			SysRole user1 = session.get(SysRole.class, 4L);
			session.delete(user1);
			//提交事务
			tx.commit();
	}
	
}













