package com.luobo.controller;


import com.luobo.po.Item;
import com.luobo.po.ItemCustom;
import com.luobo.po.ItemQueryVo;
import com.luobo.service.ItemCustomService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemCustomController {

    @Autowired
    private ItemCustomService itemCustomService;

    @RequestMapping("/list")
    public ModelAndView itemlist(ItemQueryVo itemQueryVo) throws Exception {
        List<ItemCustom> items = itemCustomService.findItemCustomList(itemQueryVo);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items",items);
        modelAndView.setViewName("item/list");
        return modelAndView;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(Integer id) throws Exception {
        List<ItemCustom> items = itemCustomService.findItemCustomList(null);
        ItemCustom itemCustom = itemCustomService.findItemById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("item",itemCustom);
        modelAndView.setViewName("item/edit");
        return modelAndView;
    }

    @RequestMapping("/update")
    public ModelAndView update(Item item) throws Exception {
        ItemCustom itemCustom = new ItemCustom();
        BeanUtils.copyProperties(item,itemCustom);
        itemCustomService.updateItem(item.getId(),itemCustom);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:list");
        return modelAndView;
    }

    @RequestMapping("/deleteItems")
    public ModelAndView deleteItems(Integer[] itemsId) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:list");
        return modelAndView;
    }

    @RequestMapping("/editItems")
    public ModelAndView editItems(ItemQueryVo itemQueryVo) throws Exception {
        List<ItemCustom> items = itemCustomService.findItemCustomList(itemQueryVo);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items",items);
        modelAndView.setViewName("item/editItems");
        return modelAndView;
    }

    @RequestMapping("/updateItems")
    public ModelAndView updateItems(Item item) throws Exception {
        ItemCustom itemCustom = new ItemCustom();
        BeanUtils.copyProperties(item,itemCustom);
        itemCustomService.updateItem(item.getId(),itemCustom);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:list");
        return modelAndView;
    }
}
