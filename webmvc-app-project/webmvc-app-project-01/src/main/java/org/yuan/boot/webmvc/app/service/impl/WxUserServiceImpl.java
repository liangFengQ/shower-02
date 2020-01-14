package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.dao.BaseCustomerInfoDao;
import org.yuan.boot.webmvc.app.dao.BaseDeviceInfoDao;
import org.yuan.boot.webmvc.app.dao.BaseGoodsInfoDao;
import org.yuan.boot.webmvc.app.dao.OrderInfoDao;
import org.yuan.boot.webmvc.app.pojo.converter.BaseCustomerInfoConverter;
import org.yuan.boot.webmvc.app.pojo.converter.OrderInfoConverter;
import org.yuan.boot.webmvc.app.service.WxUserService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 22:00
 */
@Service
@AllArgsConstructor
public class WxUserServiceImpl implements WxUserService {
    private BaseCustomerInfoDao baseCustomerInfoDao;
    private BaseCustomerInfoConverter baseCustomerInfoConverter;
    private OrderInfoDao orderInfoDao;
    private OrderInfoConverter orderInfoConverter;
    private BaseGoodsInfoDao baseGoodsInfoDao;
    private BaseDeviceInfoDao baseDeviceInfoDao;
}