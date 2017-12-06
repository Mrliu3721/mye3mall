package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {
	
	//注入service对象
	@Autowired
	private ItemService itemService;
	
	/**
	 * 需求：根据id查询商品
	 */
	@RequestMapping("item/list/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		TbItem tbItem = itemService.findItemById(itemId);
		return tbItem;
	}
	

}
