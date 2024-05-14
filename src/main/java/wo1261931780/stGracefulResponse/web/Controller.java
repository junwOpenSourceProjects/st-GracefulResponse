package wo1261931780.stGracefulResponse.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:st-GracefulResponse
 * Package:wo1261931780.stGracefulResponse.web
 *
 * @author liujiajun_junw
 * @Date 2024-05-18-43  星期二
 * @Description
 */
// @Controller
// public class Controller {
//
// 	@GetMapping("/query")
// 	@ResponseBody
// 	public Response query(Map<String, Object> paramMap) {
// 		Response res = new Response();
// 		try {
// 			//1.校验params参数合法性，包括非空校验、长度校验等
// 			if (illegal(paramMap)) {
// 				res.setCode(1);
// 				res.setMsg("error");
// 				return res;
// 			}
// 			//2.调用Service的一系列操作，得到查询结果
// 			Object data = service.query(params);
// 			//3.将操作结果设置到res对象中
// 			res.setData(data);
// 			res.setCode(0);
// 			res.setMsg("ok");
// 			return res;
// 		} catch (Exception e) {
// 			//4.异常处理：一堆丑陋的try...catch，如果有错误码的，还需要手工填充错误码
// 			res.setCode(1);
// 			res.setMsg("error");
// 			return res;
// 		}
// 	}
// }
