package com.luobo.mapper;

import com.luobo.po.Item;
import com.luobo.po.ItemCustom;
import com.luobo.po.ItemExample;
import com.luobo.po.ItemQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemMapperCustom {
    List<ItemCustom> findItemCustomList(ItemQueryVo itemQueryVo) throws Exception;
}