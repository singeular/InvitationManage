package mapper;

import com.github.pagehelper.PageInfo;
import entity.ReplyDetail;
import entity.ReplyDetailExample;
import java.util.List;

public interface ReplyDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReplyDetail record);

    int insertSelective(ReplyDetail record);

    List<ReplyDetail> selectByExample(ReplyDetailExample example);

    List<ReplyDetail> selectByExampleByID(Integer id);

    ReplyDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReplyDetail record);

    int updateByPrimaryKey(ReplyDetail record);
}