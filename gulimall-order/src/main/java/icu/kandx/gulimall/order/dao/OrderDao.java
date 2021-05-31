package icu.kandx.gulimall.order.dao;

import icu.kandx.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-28 09:40:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
