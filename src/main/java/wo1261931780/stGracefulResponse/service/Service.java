package wo1261931780.stGracefulResponse.service;

/**
 * Created by Intellij IDEA.
 * Project:st-GracefulResponse
 * Package:wo1261931780.stGracefulResponse.service
 *
 * @author liujiajun_junw
 * @Date 2024-05-18-47  星期二
 * @Description
 */
/**
 * 直接返回Reponse的Service
 * 不规范
 */
public interface Service {
	public Reponse commandMethod(Command command);
}
