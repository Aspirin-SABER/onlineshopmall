package cn.e3mall.service;

import cn.e3mall.commom.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long id);
	DataGridResult getItemList(int page,int rows);
}
