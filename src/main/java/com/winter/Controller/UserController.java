package com.winter.Controller;

import com.winter.model.User;
import com.winter.service.user.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/selectByPrimaryKey", produces = {"application/json;charset=UTF-8"})
    public User selectByPrimaryKey(int id)
    {
        return userService.selectByPrimaryKey(id);
    }

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/insertSelective", produces = {"application/json;charset=UTF-8"})
    public int insertSelective(User user)
    {
        return userService.insertSelective(user);
    }
    @ResponseBody
    @RequestMapping(value = "/deleteByPrimaryKey", produces = {"application/json;charset=UTF-8"})
    public int deleteByPrimaryKey(int id )
    {
        return userService.deleteByPrimaryKey(id);
    }

    @ResponseBody
    @RequestMapping(value = "/updateByPrimaryKeySelective", produces = {"application/json;charset=UTF-8"})
    public  int updateByPrimaryKeySelective(User user)
    {
        return userService.updateByPrimaryKeySelective(user);
    }

    @ResponseBody
    @RequestMapping(value = "/updateByPrimaryKey", produces = {"application/json;charset=UTF-8"})
    public  int updateByPrimaryKey(User user)
    {
        return userService.updateByPrimaryKey(user);
    }

}
