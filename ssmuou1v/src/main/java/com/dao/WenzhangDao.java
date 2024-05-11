package com.dao;

import com.entity.WenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhangVO;
import com.entity.view.WenzhangView;


/**
 * 文章
 * 
 * @author 
 * @email 
 * @date 2021-04-06 17:29:02
 */
public interface WenzhangDao extends BaseMapper<WenzhangEntity> {
	
	List<WenzhangVO> selectListVO(@Param("ew") Wrapper<WenzhangEntity> wrapper);
	
	WenzhangVO selectVO(@Param("ew") Wrapper<WenzhangEntity> wrapper);
	
	List<WenzhangView> selectListView(@Param("ew") Wrapper<WenzhangEntity> wrapper);

	List<WenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhangEntity> wrapper);
	
	WenzhangView selectView(@Param("ew") Wrapper<WenzhangEntity> wrapper);
	
}
