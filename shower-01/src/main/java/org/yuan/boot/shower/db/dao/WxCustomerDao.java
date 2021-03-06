package org.yuan.boot.shower.db.dao;

import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.WxCustomer;
import org.yuan.boot.shower.db.pojo.WxCustomerCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:14
 */
public interface WxCustomerDao extends BaseDao<WxCustomer> {
    void saveWxCustomer(WxCustomer wxCustomer);

    boolean checkWxCustomer(String unionId);

    PageResult<WxCustomer> selectPage(WxCustomerCondition condition);
}
