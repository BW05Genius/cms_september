package com.wangshu.service;

import java.util.List;

import com.wangshu.entity.Article4Vote;
import com.wangshu.entity.VoteStatic;

/**
 * 
 * @author 王澍
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}
