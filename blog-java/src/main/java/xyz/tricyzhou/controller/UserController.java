package xyz.tricyzhou.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import xyz.tricyzhou.service.UserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tricyzhou
 * @since 2022-10-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  UserService userService;

  @GetMapping("index")
  public Object index(){
    return userService.getById(1L);
  }
}
