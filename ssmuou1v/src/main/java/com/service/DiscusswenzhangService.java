package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenzhangView;


/**
 * 文章评论表
 *
 * @author 
 * @email 
 * @date 2021-04-06 17:29:02
 */
public interface DiscusswenzhangService extends IService<DiscusswenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenzhangVO> selectListVO(Wrapper<DiscusswenzhangEntity> wrapper);
   	
   	DiscusswenzhangVO selectVO(@Param("ew") Wrapper<DiscusswenzhangEntity> wrapper);
   	
   	List<DiscusswenzhangView> selectListView(Wrapper<DiscusswenzhangEntity> wrapper);
   	
   	DiscusswenzhangView selectView(@Param("ew") Wrapper<DiscusswenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenzhangEntity> wrapper);
   	
}

