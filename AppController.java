package com.management.Content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Autowired
public class AppController {
    @Id
    @GeneratedValue(Strategy= GenerationType.IDENTITY()
    private ContentService Service;
    public String ViewHomepage(model Model);
    List<Content> ListContent.service.ListAll();
    model.addAttribute(AttributeName :"ListContent",ListContents);
            return "index";
}
@RequestMapping("/new")
public String showNewContentPage(Model model){
    Content content=new Content( );
model.addAttribute(AttributeName:"Content");
        return "new_content";
}
@RequestMapping(value="/save,method=Request")
public String saveContent(@ModelAttribute()){
        Service.save(Content);
        return "redirect:/";
@RequestMapping("/edit/{id}")
public ModelandView mavEdit ContentPage(@ModelAttribute Attribute())
        ModelandView mav=new ModelandView(View)
        Content content=service.get(id);
        mav.add object(AttributeName:"Content",Content)
        return mav;
        }
@RequestMapping("delete/{id}")
public String delete Content(@PathVariable(name="id") int id){
        ModelandView mav=new ModelandView(View);
        service.delete(id);
        return"redirect:/";
        }
        }
        }


}
