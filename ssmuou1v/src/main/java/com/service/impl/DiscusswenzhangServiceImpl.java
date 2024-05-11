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


import com.dao.DiscusswenzhangDao;
import com.entity.DiscusswenzhangEntity;
import com.service.DiscusswenzhangService;
import com.entity.vo.DiscusswenzhangVO;
import com.entity.view.DiscusswenzhangView;

@Service("discusswenzhangService")
public class DiscusswenzhangServiceImpl extends ServiceImpl<DiscusswenzhangDao, DiscusswenzhangEntity> implements DiscusswenzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenzhangEntity> page = this.selectPage(
                new Query<DiscusswenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscusswenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenzhangEntity> wrapper) {
		  Page<DiscusswenzhangView> page =new Query<DiscusswenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenzhangVO> selectListVO(Wrapper<DiscusswenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenzhangVO selectVO(Wrapper<DiscusswenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenzhangView> selectListView(Wrapper<DiscusswenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenzhangView selectView(Wrapper<DiscusswenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
