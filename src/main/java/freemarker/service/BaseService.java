package freemarker.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
/**
 * set注入
 * @author wsz
 * @date 2018年3月24日
 */
@Service
public class BaseService {
	
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
}
