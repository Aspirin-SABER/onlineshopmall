package com.e3mall.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;

public class PageHelperTest {
	
	@Test
	public void pageHelperTest(){
		//设置分页信息
		PageHelper.startPage(1, 10);
		//执行查询
		
		//初始化Spring容器
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		TbItemMapper tbItemMapper = applicationContext.getBean(TbItemMapper.class);
		TbItemExample example=new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		System.out.println(list.size());
		PageInfo<TbItem> pageInfo=new PageInfo<>(list);
		System.out.println(pageInfo.getPages());
		System.out.println(pageInfo.getTotal());
		
				
	}
}
