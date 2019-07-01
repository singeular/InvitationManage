package service;

import com.github.pagehelper.PageInfo;
import entity.ReplyDetail;

import java.util.List;

public interface ReplyDetailService {
    PageInfo<ReplyDetail> selectByID(Integer id, int PageIndex,int PageSize);

    Integer insertSelective(ReplyDetail replyDetail);
}
