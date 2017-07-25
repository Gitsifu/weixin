package com.sifu.weixin.controller;

import com.sifu.weixin.pojo.OrderMaster;
import com.sifu.weixin.service.OrderMasterService;
import com.sifu.weixin.service.impl.OrderMasterServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sifu on 2017/7/25
 *
 * @author sifu
 * @version 1.0.0
 */
@RestController
public class OrderMasterController {
    OrderMasterService service;

    public OrderMasterController(OrderMasterService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public int add( OrderMaster orderMaster){
        return service.add(orderMaster);
    }
}
