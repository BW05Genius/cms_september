package com.wangshu.service;
/**
 * 
 * @author 王澍
 *
 */
import java.util.List;

import com.wangshu.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
