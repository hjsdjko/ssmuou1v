package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WenzhangDao;
import com.entity.WenzhangEntity;
import com.service.WenzhangService;
import com.entity.vo.WenzhangVO;
import com.entity.view.WenzhangView;

@Service("wenzhangService")
public class WenzhangServiceImpl extends ServiceImpl<WenzhangDao, WenzhangEntity> implements WenzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhangEntity> page = this.selectPage(
                new Query<WenzhangEntity>(params).getPage(),
                new EntityWrapper<WenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhangEntity> wrapper) {
		  Page<WenzhangView> page =new Query<WenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhangVO> selectListVO(Wrapper<WenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhangVO selectVO(Wrapper<WenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhangView> selectListView(Wrapper<WenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhangView selectView(Wrapper<WenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
