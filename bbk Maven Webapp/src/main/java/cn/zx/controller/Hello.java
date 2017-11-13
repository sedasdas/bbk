/*package cn.zx.controller;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import cn.zx.commoms.PageBean;
import cn.zx.commoms.PicResult;
import cn.zx.model.Article;
import cn.zx.model.User;
import cn.zx.service.ArtService;
import cn.zx.service.UserService;

@Controller
public class Hello {
	@Autowired
	UserService us;
	@Autowired
	ArtService as;
	@RequestMapping("/")
	public String index(){
		return "home";
		
	}
	
	@RequestMapping("/foren")
	public String foren(){
		return "foren";
		
	}
	
	@RequestMapping("/about")
	public String zn(){
		return "about";
		
	}
	
	@RequestMapping("/contact")
	public String cn(){
		return "contact";
		
	}
	@RequestMapping("/regester")
	public String regesters(){
		return "regester";
		
	}
	
	@RequestMapping("/ss")
	public String regester(User u){
		u.setRdate(new Date());
		us.insertUser(u);
		return "home";
		
	}
	
	@RequestMapping("/login")
	public String login(User u,ModelMap m,HttpServletResponse rp,HttpSession ss){
		User uu=us.validateUser(u);
		if (uu==null) {
			
			return "home";
		}	
		ss.setAttribute("username", uu.getPassword());
		return "redirect:successful";
		
	}
	
	@RequestMapping("/successful")
	
	public String getArt(ModelMap m,@RequestParam (defaultValue="1")int page,@RequestParam(defaultValue="10") int rows
			){
		PageBean parts=as.getArts(page,rows);
		System.out.println(page);
		m.addAttribute("parts", parts); 
		return "successful";
	}
	
@RequestMapping("/post/{id}")
	
	public String getA(ModelMap m,@PathVariable int id){
		Article art=as.getArtByid(id);
		System.out.println(id);
		m.addAttribute("art", art);
		
		return "post";
	}
@RequestMapping("/ui")
public String getui(Article art){
	//art.setTitle(art.getContent().substring(1, 15));
	art.setRdate(new Date());
	as.insertArt(art);
	return "redirect:successful";
}
@RequestMapping("/uploads")
@ResponseBody
public  Map<String,String> uploads(HttpServletRequest request, @RequestParam("upfile")String fileName, MultipartFile file) throws JsonProcessingException{
    String url = null;
    String path="E://image";
    Map<String,String> m=new HashMap<String,String>();
    PicResult result=new PicResult();
    String name=file.getOriginalFilename();
    String px=name.substring(name.indexOf("."));
    String pe=UUID.randomUUID().toString();
    File targetFile = new File(path, pe+px);  
    if(!targetFile.exists()){  
        targetFile.mkdirs();  
    }  
    try {  
    	file.transferTo(targetFile);  
    	//url=targetFile.getAbsolutePath();
    	url="http://localhost:8080/image/"+pe+px;
    	m.put("url", url);
    	System.out.println(targetFile.getAbsolutePath());
    } catch (Exception e) {  
        e.printStackTrace();  
        
    }  

    return m;
}

}*/