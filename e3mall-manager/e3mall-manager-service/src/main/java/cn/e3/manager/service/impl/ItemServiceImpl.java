package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.mapper.TbItemMapper;
import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {
	
	//注入商品代理对象mapper
	@Autowired
	private TbItemMapper tbItemMapper;

	/**
	 * 需求：根据id查询商品数据
	 */
	@Override
	public TbItem findItemById(Long itemId) {
		//根据主键查询商品
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
		return tbItem;
	}

}
