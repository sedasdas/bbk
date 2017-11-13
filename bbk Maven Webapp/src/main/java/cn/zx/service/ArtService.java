package cn.zx.service;

import java.util.List;


import cn.zx.commoms.PageBean;
import cn.zx.model.Article;

public interface ArtService {
	List<Article> getAllarts();
	PageBean getArts(int page,int rows);
	void insertArt(Article art);
	Article getArtByid(int id);
}
