package wo1261931780.stGracefulResponse.mapper;


import java.util.List;
import wo1261931780.stGracefulResponse.domain.TbUser;

/**
*Created by Intellij IDEA.
*Project:st-GracefulResponse
*Package:wo1261931780.stGracefulResponse.mapper
*@author liujiajun_junw
*@Date 2024-05-18-54  星期二
*@Description 
*/

@Mapper
public interface UserInfoMapper extends BaseMapper<TbUser> {
    int updateBatch(List<TbUser> list);

    int updateBatchSelective(List<TbUser> list);

    int batchInsert(@Param("list") List<TbUser> list);

    int insertOrUpdate(TbUser record);

    int insertOrUpdateSelective(TbUser record);
}
