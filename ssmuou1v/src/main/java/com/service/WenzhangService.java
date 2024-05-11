package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangView;


/**
 * 文章
 *
 * @author 
 * @email 
 * @date 2021-04-06 17:29:02
 */
public interface WenzhangService extends IService<WenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhangVO> selectListVO(Wrapper<WenzhangEntity> wrapper);
   	
   	WenzhangVO selectVO(@Param("ew") Wrapper<WenzhangEntity> wrapper);
   	
   	List<WenzhangView> selectListView(Wrapper<WenzhangEntity> wrapper);
   	
   	WenzhangView selectView(@Param("ew") Wrapper<WenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhangEntity> wrapper);
   	
}

