package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.webmvc.controller.AbstractResultController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 19:03
 */
@RestController
@RequestMapping("wx/order")
@AllArgsConstructor
public class WxOrderController extends AbstractResultController {
    private WxOrderService wxOrderService;

}