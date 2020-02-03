package org.yuan.boot.shower.wx.converter.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.GoodsInfo;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;
import org.yuan.boot.shower.wx.converter.WxOrderInfoConvertService;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.OrderCodeService;
import org.yuan.boot.shower.wx.service.WxCustomerService;
import org.yuan.boot.shower.wx.service.WxDeviceService;
import org.yuan.boot.shower.wx.service.WxGoodsService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 12:07
 */
@Component
@AllArgsConstructor
public class WxOrderInfoConvertServiceImpl implements WxOrderInfoConvertService {
    private OrderCodeService orderCodeService;
    private WxCustomerService wxCustomerService;
    private WxDeviceService wxDeviceService;
    private WxGoodsService wxGoodsService;

    @Override
    public OrderInfo addOrder(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setType(0);
        orderInfo.setOrderNo(orderCodeService.generateOrderNo());
        orderInfo.setCustomerId(wxOrderInfo.getCustomerId());
        orderInfo.setCustomerOpenId(wxOrderInfo.getCustomerOpenId());
        orderInfo.setCustomerUnionId(wxOrderInfo.getCustomerUnionId());
        orderInfo.setCustomerNickName(wxCustomerService.getCustomerNameByUnionId(wxOrderInfo.getCustomerUnionId()));
        orderInfo.setOrderStatus(0);
        orderInfo.setTotalPrice(new BigDecimal("0"));
        return orderInfo;
    }

    @Override
    public OrderItem addBaseOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo) {
        OrderItem orderItem = new OrderItem();
        orderItem.setType(orderInfo.getType());
        orderItem.setOrderId(orderInfo.getId());
        orderItem.setOrderNo(orderInfo.getOrderNo());
        orderItem.setCustomerId(orderInfo.getCustomerId());
        orderItem.setCustomerOpenId(orderInfo.getCustomerOpenId());
        orderItem.setCustomerUnionId(orderInfo.getCustomerUnionId());
        orderItem.setCustomerNickName(orderInfo.getCustomerNickName());
        orderItem.setItemType(0);
        orderItem.setItemOrderNo(orderCodeService.generateOrderNo());
        Optional<DeviceInfo> optional = wxDeviceService.getById(wxOrderInfo.getDeviceId());
        optional.ifPresent(deviceInfo -> {
            orderItem.setDeviceType(deviceInfo.getType());
            orderItem.setDeviceId(deviceInfo.getId());
            orderItem.setDeviceCode(deviceInfo.getCode());
            orderItem.setRangeCode(deviceInfo.getRangeCode());
        });
        Optional<GoodsInfo> goodsInfoOptional = wxGoodsService.getByBaseGoodsInfoByRangeCode(orderItem.getRangeCode());
                orderItem.setGoodsInfoId(0L);
        orderItem.setGoodsInfoCode("");
        orderItem.setTimePrice(new BigDecimal("0"));
        orderItem.setTimeInterval(new BigDecimal("0"));
        orderItem.setTimeTotalPrice(new BigDecimal("0"));
        orderItem.setPriceUnit(0);
        orderItem.setStartTime(new Date());
        orderItem.setEndTime(new Date());
        orderItem.setTimeUseAmount(new BigDecimal("0"));
        orderItem.setTimeUseUnit(0);
        orderItem.setWaterPrice(new BigDecimal("0"));
        orderItem.setWaterSpace(new BigDecimal("0"));
        orderItem.setWaterTotalPrice(new BigDecimal("0"));
        orderItem.setTotalPrice(new BigDecimal("0"));
        orderItem.setRemainPrice(new BigDecimal("0"));
        orderItem.setId(0L);
        orderItem.setCreateTime(new Date());
        orderItem.setUpdateTime(new Date());
        orderItem.setCreateUser("");
        orderItem.setUpdateUser("");


        return orderItem;
    }

    @Override
    public List<OrderItem> addBaseOrderItems(WxOrderInfo wxOrderInfo, OrderInfo orderInfo) {
        ArrayList<OrderItem> orderItems = new ArrayList<>(1);
        return orderItems;
    }

}