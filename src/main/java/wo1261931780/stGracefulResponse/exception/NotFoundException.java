package wo1261931780.stGracefulResponse.exception;

/**
 * Created by Intellij IDEA.
 * Project:st-GracefulResponse
 * Package:wo1261931780.stGracefulResponse.exception
 *
 * @author liujiajun_junw
 * @Date 2024-05-18-48  星期二
 * @Description
 */

import com.feiniaojin.gracefulresponse.api.ExceptionMapper;

/**
 * NotFoundException的定义，使用@ExceptionMapper注解修饰
 * code:代表接口的异常码
 * msg:代表接口的异常提示
 */
@ExceptionMapper(code = "1404", msg = "找不到对象")
public class NotFoundException extends RuntimeException {

}
