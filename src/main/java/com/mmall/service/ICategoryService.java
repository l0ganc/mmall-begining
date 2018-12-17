package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author logan
 * @create 2018-12-17 11:45 AM
 */

public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
}
