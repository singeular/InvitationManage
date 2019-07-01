package mapper;

import com.github.pagehelper.PageInfo;
import entity.Invitation;
import entity.InvitationExample;
import java.util.List;

public interface InvitationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    List<Invitation> selectAll();
    PageInfo<Invitation> selectByExample(InvitationExample example);
    List<Invitation> selectBy(Invitation invitation);

    Invitation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}