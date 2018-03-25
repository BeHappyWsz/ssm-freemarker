package freemarker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import freemarker.dao.UserDao;

@Service
public class IndexService extends BaseService{
	
	@Autowired
	private UserDao userDao;
	
	public void index() {
		System.out.println(userDao.getUserById(1));
		System.out.println("index");
	}
	
}
