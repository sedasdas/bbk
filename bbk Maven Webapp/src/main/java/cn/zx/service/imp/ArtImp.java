package cn.zx.service.imp;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zx.commoms.PageBean;
import cn.zx.mapping.ArticleMapper;
import cn.zx.model.Article;
import cn.zx.model.ArticleExample;
import cn.zx.service.ArtService;
@Service
public class ArtImp implements ArtService {
	@Autowired
	ArticleMapper artmapper;

	public PageBean getArts(int page,int rows) {
		
		PageHelper ph=new PageHelper();
		ph.startPage(page, rows);
		ArticleExample am=new ArticleExample();
		List<Article> arts=artmapper.selectByExample(am);	
		System.out.println(page+"pg"+rows);
		PageBean parts=new PageBean();
		parts.setArts(arts);
		//4、取分页后结果
				PageInfo<Article> pageInfo = new PageInfo<Article>(arts);
				long total = pageInfo.getTotal();
				System.out.println("total:" + total);
				int pages = pageInfo.getPages();
				System.out.println("pages:" + pages);
				int pageSize = pageInfo.getPageSize();
				System.out.println("pageSize:" + pageSize);
			parts.setPage(pages);	
		return parts;
	}

	public Article getArtByid(int id) {
		return artmapper.selectByPrimaryKey(id);
	}

	public void insertArt(Article art) {
		artmapper.insert(art);
		
	}

	public List<Article> getAllarts() {
		// TODO Auto-generated method stub
		return artmapper.selectByExample(new ArticleExample());
	}

}
