package com.entity.view;

import com.entity.WenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文章
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 17:29:02
 */
@TableName("wenzhang")
public class WenzhangView  extends WenzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhangView(){
	}
 
 	public WenzhangView(WenzhangEntity wenzhangEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
