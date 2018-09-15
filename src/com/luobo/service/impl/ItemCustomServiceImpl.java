package com.luobo.service.impl;

import com.luobo.mapper.ItemMapper;
import com.luobo.mapper.ItemMapperCustom;
import com.luobo.po.Item;
import com.luobo.po.ItemCustom;
import com.luobo.po.ItemQueryVo;
import com.luobo.service.ItemCustomService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class ItemCustomServiceImpl implements ItemCustomService {

    @Autowired
    private ItemMapperCustom itemMapperCustom;

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<ItemCustom> findItemCustomList(ItemQueryVo itemQueryVo) throws Exception {
        return itemMapperCustom.findItemCustomList(itemQueryVo);
    }

    @Override
    public ItemCustom findItemById(Integer id) throws Exception {
        Item item = itemMapper.selectByPrimaryKey(id);
        ItemCustom itemCustom = new ItemCustom();
        BeanUtils.copyProperties(item,itemCustom);
        return itemCustom;
    }

    @Override
    public void updateItem(Integer id, ItemCustom itemCustom) throws Exception {
        itemCustom.setId(id);
        itemMapper.updateByPrimaryKeySelective(itemCustom);
    }
}
