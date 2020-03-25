package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.PageResult;
import entity.Result;
import entity.StausCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName LabelController
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/3/24
 * @Version V1.0
 **/
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;

    //增
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Label label){
        labelService.add(label);
        return  new Result(StausCode.OK,true,"添加成功");

    }
    // 删
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable String id){
        labelService.delete(id);
        return new Result(StausCode.OK,true,"删除成功");
    }
    // 改
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@RequestBody Label label,@PathVariable String id){
        labelService.update(id,label);
        return  new Result(StausCode.OK,true,"修改成功");
    }
    // 查 查询所有
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
      List<Label> labelList=  labelService.findAll();
        return  new Result(StausCode.OK,true,"查询成功",labelList);
    }
    //查 根据id查询
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id){
       Label label= labelService.findById(id);
       return new Result(StausCode.OK,true,"查询成功",label);
    }

    //查 根据参数查询
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public Result findByCondition(@RequestBody Label label){
     List<Label> labelList= labelService.findByCondition(label);
     return new Result(StausCode.OK,true,"查询成功",labelList);
    }
    //查 分页查询
    @RequestMapping(value = "/search/{page}/{size}",method = RequestMethod.POST)
    public Result findPageByCondition(@RequestBody Label label,@PathVariable Integer page,@PathVariable Integer size){
        PageResult<Label> pageResult= labelService.findPageByCondition(page,size,label);
        return new Result(StausCode.OK,true,"查询成功",pageResult);
    }
}
