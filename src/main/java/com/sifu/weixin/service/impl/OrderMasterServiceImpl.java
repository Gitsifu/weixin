package com.sifu.weixin.service.impl;

import com.sifu.weixin.dao.OrderMasterMapper;
import com.sifu.weixin.pojo.OrderMaster;
import com.sifu.weixin.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sifu on 2017/7/25
 *
 * @author sifu
 * @version 1.0.0
 */
@Service
public class OrderMasterServiceImpl implements OrderMasterService {

    @Autowired
    private OrderMasterMapper orderMasterMapper;


    @Override
    public int add(OrderMaster orderMaster) {
        return orderMasterMapper.insert(orderMaster);
    }

    @Override
    public int edit() {
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }
}
