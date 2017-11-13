/*package cn.zx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.zx.commoms.PageBean;
import cn.zx.model.Article;
import cn.zx.service.ArtService;
import cn.zx.service.UserService;

@Controller
public class PageC {
	@Autowired
	UserService us;
	@Autowired
	ArtService as;
	
	@RequestMapping("/index")
	public String showIndex(Model m,@RequestParam (defaultValue="1")int page,
	@RequestParam(defaultValue="10") int rows,HttpServletRequest res){
		
		Integer param=Integer.parseInt(res.getParameter("page"));
		if(param==null||param.equals("")){
			param=1;
		}else{
			param=page;
		}
		m.addAttribute("param", param);
		m.addAttribute("parts", as.getArts(page, rows));
		return "index";
	}
	@RequestMapping("/")
	public String foward(Model m){
		m.addAttribute("parts", as.getArts(1, 10));
		return "index";
	}
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		System.out.println(page);
		return page;
	}
}
*/