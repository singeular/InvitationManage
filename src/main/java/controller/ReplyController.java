package controller;

import com.github.pagehelper.PageInfo;
import entity.ReplyDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ReplyDetailService;

import java.util.Date;
import java.util.List;

@Controller
public class ReplyController {
    @Autowired
    private ReplyDetailService replyDetailService;

    @RequestMapping("/selectB/{id}")
    public String selectByID(Model model,Integer PageIndex, @PathVariable Integer id){
        PageIndex=PageIndex==null?1:PageIndex;
        PageInfo<ReplyDetail> replyList=(PageInfo<ReplyDetail>)replyDetailService.selectByID(id,PageIndex,2);
        model.addAttribute("replyList",replyList);
        model.addAttribute("invid",id);
        return "jsp/replyList";
    }

    @RequestMapping("/addA/{invid}")
    public String addA(Model model,@PathVariable Integer invid){
        model.addAttribute("invid",invid);
        return "jsp/addReply";
    }

    @RequestMapping("/addB/{invid}")
    public String add2(Model model,ReplyDetail replyDetail,Integer PageIndex,@PathVariable Integer invid){
        replyDetail.setCreatedate(new Date());
        System.out.println(replyDetail.toString());
        replyDetailService.insertSelective(replyDetail);
        PageIndex=PageIndex==null?1:PageIndex;
        PageInfo<ReplyDetail> replyList=replyDetailService.selectByID(invid,PageIndex,2);
        model.addAttribute("replyList",replyList);
        return "jsp/replyList";
    }
}
