package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;package com.mmall.service;

/**
 * @author logan
 * @create 2018-12-20 2:31 PM
 */
public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
}
