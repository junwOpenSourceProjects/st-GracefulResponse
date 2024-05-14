package wo1261931780.stGracefulResponse.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*Created by Intellij IDEA.
*Project:st-GracefulResponse
*Package:wo1261931780.stGracefulResponse.domain
*@author liujiajun_junw
*@Date 2024-05-18-54  星期二
*@Description 
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_user")
public class TbUser implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 收件人
     */
    @TableField(value = "username")
    private String username;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;

    private static final long serialVersionUID = 1L;
}