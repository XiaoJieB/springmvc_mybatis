package com.luobo.service;

import com.luobo.po.ItemCustom;
import com.luobo.po.ItemQueryVo;

import java.util.List;

public interface ItemCustomService {
    List<ItemCustom> findItemCustomList(ItemQueryVo itemQueryVo) throws Exception;

    ItemCustom findItemById(Integer id) throws Exception;

    void updateItem(Integer id, ItemCustom itemCustom) throws Exception;
}
