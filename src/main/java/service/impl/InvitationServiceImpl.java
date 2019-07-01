package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.Invitation;
import mapper.InvitationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.InvitationService;

import java.util.List;

@Service
public class InvitationServiceImpl implements InvitationService {
    @Autowired
    private InvitationMapper invitationMapper;

    @Override
    public PageInfo<Invitation> selectByExample(int PageIndex, int PageSize) {
        PageHelper.startPage(PageIndex,PageSize);
        List<Invitation> invitationList=invitationMapper.selectAll();
        PageInfo pageInfo=new PageInfo(invitationList);
        return pageInfo;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return invitationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<Invitation> selectBy(Integer PageIndex,Integer PageSize,Invitation invitation) {
        PageHelper.startPage(PageIndex,PageSize);
        List<Invitation>invitationList=invitationMapper.selectBy(invitation);
        PageInfo<Invitation> pageInfo=new PageInfo<Invitation>(invitationList);
        return pageInfo;
    }

}
