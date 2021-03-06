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
	 * 传递多个参数
	 * 1.使用注解方式:使用该方法
	 * 2.parameterMap方式：该方法即将删除，不建议使用
	 * @param username
	 * @param password
	 * @return
	 */
	User getUserByUsernameAndPassword(@Param("username")String username,@Param("password")String password);
	
	List<User> getAllUsers();	
	
	List<User> getUserByRealname(String realname);
	
	/**
	 * 使用RowBounds进行分页
	 * @param realname
	 * @param rb
	 * @return
	 */
	List<User> getUserByRealname(String realname,RowBounds rb);
}
