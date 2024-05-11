package com.dao;

import com.entity.DiscusswenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenzhangVO;
import com.entity.view.DiscusswenzhangView;


/**
 * 文章评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-06 17:29:02
 */
public interface DiscusswenzhangDao extends BaseMapper<DiscusswenzhangEntity> {
	
	List<DiscusswenzhangVO> selectListVO(@Param("ew") Wrapper<DiscusswenzhangEntity> wrapper);
	
	DiscusswenzhangVO selectVO(@Param("ew") Wrapper<DiscusswenzhangEntity> wrapper);
	
	List<DiscusswenzhangView> selectListView(@Param("ew") Wrapper<DiscusswenzhangEntity> wrapper);

	List<DiscusswenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenzhangEntity> wrapper);
	
	DiscusswenzhangView selectView(@Param("ew") Wrapper<DiscusswenzhangEntity> wrapper);
	
}
