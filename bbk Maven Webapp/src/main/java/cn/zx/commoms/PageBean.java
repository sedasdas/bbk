package cn.zx.commoms;

import java.util.List;

import cn.zx.model.Article;

public class PageBean {
	List<Article> arts;
	int page;
	public List<Article> getArts() {
		return arts;
	}
	public void setArts(List<Article> arts) {
		this.arts = arts;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}

}
