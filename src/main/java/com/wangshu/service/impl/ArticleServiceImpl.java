package com.wangshu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangshu.dao.ArticleMapper;
import com.wangshu.entity.Article;
import com.wangshu.service.ArticleService;
/**
 * 
 * @author 王澍
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired
	ArticleMapper articleMapper;

	@Override
	public int post(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.add(article);
	}

	@Override
	public PageInfo<Article> list(Integer pageNum,Integer channelId, Integer cid) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 5);
		List<Article> articles =   articleMapper.list(channelId,cid);
		return new PageInfo(articles);
	}

	@Override
	public Article findById(Integer articleId) {
		// TODO Auto-generated method stub
		return articleMapper.findById(articleId);
		
	}

	@Override
	public int update(Article article) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int logicDelete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int logicDeleteBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.add(article);
	}

	@Override
	public PageInfo<Article> getByUserId(Integer id, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Article> pageInfo = new PageInfo<Article>(articleMapper.listByUser(id));
		
		return pageInfo;
	}

	@Override
	public PageInfo<Article> checkList(Integer status, int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNumber, pageSize);
		List<Article> articles=  articleMapper.checkList(status);
		
		return new PageInfo<Article>(articles);
	}

	@Override
	public int check(Integer id, Integer status) {
		// TODO Auto-generated method stub
		return articleMapper.updateStatus(id,status);
	}

	@Override
	public PageInfo<Article> listhots(String title,Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		System.out.println("title   is ============ " + title);
		List<Article> articles=  articleMapper.hotList(title);
		
		return new PageInfo<Article>(articles);
	}

	@Override
	public List<Article> last() {
		// TODO Auto-generated method stub
		return   articleMapper.lastArticles();
	}

	@Override
	public int setHot(Integer id, Integer status) {
		// TODO Auto-generated method stub
		return articleMapper.updateHot(id,status);
	}

	@Override
	public int updatea(Integer id, String title, Integer categoryId,
			Integer channelId, String content1) {
		return articleMapper.updatea(id, title, categoryId, channelId, content1);
	}

	@Override
	public Article findByLastId(Integer channelId, Integer aId) {
		// TODO Auto-generated method stub
		return articleMapper.getAdj(channelId, aId,2);
	}

	@Override
	public Article findByPreId(Integer channelId, Integer aId) {
		// TODO Auto-generated method stub
		return  articleMapper.getAdj(channelId, aId,1);
	}

}
