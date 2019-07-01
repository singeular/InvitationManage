package service;

import com.github.pagehelper.PageInfo;
import entity.Invitation;
import entity.InvitationExample;

import java.util.List;

public interface InvitationService {
    PageInfo<Invitation> selectByExample(int PageIndex,int PageSize);

    int deleteByPrimaryKey(Integer id);

    PageInfo<Invitation> selectBy(Integer PageIndex,Integer PageSize,Invitation invitation);
}
