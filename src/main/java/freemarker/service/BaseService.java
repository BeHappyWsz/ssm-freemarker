package freemarker.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
/**
 * setע��
 * @author wsz
 * @date 2018��3��24��
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
