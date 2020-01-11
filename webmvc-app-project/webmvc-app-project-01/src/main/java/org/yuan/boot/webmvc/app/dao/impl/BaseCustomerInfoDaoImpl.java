package org.yuan.boot.webmvc.app.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.mapper.BaseCustomerInfoMapper;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.dao.BaseCustomerInfoDao;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:40
 */
@AllArgsConstructor
@Component
public class BaseCustomerInfoDaoImpl extends BaseDaoImpl<BaseCustomerInfo, BaseCustomerInfoMapper> implements BaseCustomerInfoDao {

}