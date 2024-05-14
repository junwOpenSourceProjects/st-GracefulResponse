package wo1261931780.stGracefulResponse.service.impl;

import jakarta.annotation.Resource;
import wo1261931780.stGracefulResponse.exception.NotFoundException;
import wo1261931780.stGracefulResponse.service.QueryService;

import javax.management.Query;
import java.util.Objects;

/**
 * Created by Intellij IDEA.
 * Project:st-GracefulResponse
 * Package:wo1261931780.stGracefulResponse.service.impl
 *
 * @author liujiajun_junw
 * @Date 2024-05-18-48  星期二
 * @Description
 */
public class QueryServiceImpl implements QueryService {
	@Resource
	private UserInfoMapper mapper;

	public UserInfoView queryOne(Query query) {
		UserInfo userInfo = mapper.findOne(query.getId());
		if (Objects.isNull(userInfo)) {
			// 这里直接抛自定义异常
			throw new NotFoundException();
		}
		//……后续业务操作
	}
}
