package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.ReplyDetail;
import mapper.ReplyDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ReplyDetailService;

import java.util.List;

@Service
public class ReplyDetailServiceImpl implements ReplyDetailService {
    @Autowired
    private ReplyDetailMapper replyDetailMapper;

        @Override
    public PageInfo<ReplyDetail> selectByID(Integer id,int PageIndex, int PageSize) {
        PageHelper.startPage(PageIndex,PageSize);
        List<ReplyDetail> replyDetailList=replyDetailMapper.selectByExampleByID(id);
        PageInfo pageInfo =new PageInfo(replyDetailList);
        return pageInfo;
    }

    @Override
    public Integer insertSelective(ReplyDetail replyDetail) {

        return replyDetailMapper.insertSelective(replyDetail);
    }
}
