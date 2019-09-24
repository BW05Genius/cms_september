package com.wangshu.service;

import com.github.pagehelper.PageInfo;
import com.wangshu.entity.Comment;

/**
 * 
 * @author 王澍
 *
 */
public interface CommentService {
	
	/**
	 * 
	 */
	int post(Comment commnet);
	/**
	 * 
	 */
	//int delete(Integer cid);
	/**
	 * 
	 */
	PageInfo<Comment> getCommentsByArticle(Integer articleId,Integer pageNum,Integer pageSize);
	
	/**
	 *  id 用户id
	 */
	PageInfo<Comment> getCommentsByUser(Integer id, Integer page,
			Integer pageSize);
	/**
	 *  userId 用户id
	 *  id 评论的id
	 */
	int del(Integer userId, Integer id);
}
