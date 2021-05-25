package icu.kandx.gulimall.product.dao;

import icu.kandx.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-25 17:12:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
