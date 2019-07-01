package controller;

import com.github.pagehelper.PageInfo;
import entity.Invitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.InvitationService;

import java.util.List;

@Controller
public class InvitationController {
    @Autowired
    private InvitationService invitationService;

    @RequestMapping("/selectAll")
    public String selectByExample(Integer PageIndex,Model model){
        PageIndex=PageIndex==null?1:PageIndex;
        PageInfo<Invitation> iPageInfo=invitationService.selectByExample(PageIndex,4);
        model.addAttribute("iPageInfo",iPageInfo);
        return "jsp/List";
    }

    @RequestMapping("/deleteD/{id}")
    public String delete(@PathVariable Integer id){
        invitationService.deleteByPrimaryKey(id);
        return "redirect:/selectAll";
    }

    @RequestMapping("/selectBy")
    public String selectBy(Invitation invitation,Model model,Integer PageIndex){
        PageIndex=PageIndex==null?1:PageIndex;
        PageInfo<Invitation> invitationList=invitationService.selectBy(PageIndex,2,invitation);

        model.addAttribute("iPageInfo",invitationList);
        return "jsp/List";
    }
}
