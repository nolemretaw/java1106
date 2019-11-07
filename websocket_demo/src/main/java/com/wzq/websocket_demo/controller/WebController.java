package com.wzq.websocket_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

  @RequestMapping(value="/publicSend",method= RequestMethod.GET)
  public String pushVideoListToWeb2(String id) {
    return "success";
  }

  @RequestMapping(value="/send",method= RequestMethod.GET)
  public String send(String id) {
    return "success";
  }


}