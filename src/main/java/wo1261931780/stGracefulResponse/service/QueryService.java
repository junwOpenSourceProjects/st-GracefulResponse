package wo1261931780.stGracefulResponse.service;

import javax.management.Query;

/**
 * Created by Intellij IDEA.
 * Project:st-GracefulResponse
 * Package:wo1261931780.stGracefulResponse.service
 *
 * @author liujiajun_junw
 * @Date 2024-05-18-48  星期二
 * @Description
 */
public interface QueryService {
	UserInfoView queryOne(Query query);
}
