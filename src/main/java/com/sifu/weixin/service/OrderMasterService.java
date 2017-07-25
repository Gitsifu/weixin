package com.sifu.weixin.service;

import com.sifu.weixin.pojo.OrderMaster;

/**
 * Created by sifu on 2017/7/25
 *
 * @author sifu
 * @version 1.0.0
 */
public interface OrderMasterService {
    int add(OrderMaster orderMaster);
    int edit();
    int delete();
}
