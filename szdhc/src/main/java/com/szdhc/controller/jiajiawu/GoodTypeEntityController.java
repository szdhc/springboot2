package com.szdhc.controller.jiajiawu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szdhc.dao.GoodsMapper;
import com.szdhc.pojo.Goods;

@RestController
public class GoodTypeEntityController {
	@Autowired
	private GoodsMapper goodsMapper;
	
	@RequestMapping("/goodTypeSearch")
	public Goods goodTypeSearch() {
		System.out.println("已进入goodTypeSearch方法");
		Goods goods = goodsMapper.selectByPrimaryKey("1");
		return goods;
	}
	
	@RequestMapping("/add")
	public void save(Goods goods) {
		goodsMapper.insert(goods);
	}
	
	@RequestMapping("/update")
	public void update(Goods goods) {
		goodsMapper.updateByPrimaryKey(goods);
	}	
	
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") String id) {
    	goodsMapper.deleteByPrimaryKey(id);
    }	

}
