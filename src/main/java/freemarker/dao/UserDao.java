package freemarker.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import freemarker.domain.User;

@Repository
public interface UserDao {

	User getUserById(int id);
	
	User getUserByUsername(String username);
	
	/**
	 * ���ݶ������
	 * 1.ʹ��ע�ⷽʽ:ʹ�ø÷���
	 * 2.parameterMap��ʽ���÷�������ɾ����������ʹ��
	 * @param username
	 * @param password
	 * @return
	 */
	User getUserByUsernameAndPassword(@Param("username")String username,@Param("password")String password);
	
	List<User> getAllUsers();	
	
	List<User> getUserByRealname(String realname);
	
	/**
	 * ʹ��RowBounds���з�ҳ
	 * @param realname
	 * @param rb
	 * @return
	 */
	List<User> getUserByRealname(String realname,RowBounds rb);
}
