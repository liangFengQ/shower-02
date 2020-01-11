package org.yuan.boot.webmvc.app.dao.impl;

import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.BaseEntity;
import org.yuan.boot.webmvc.app.dao.BaseDao;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 00:14
 */


public abstract class BaseDaoImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> extends org.yuan.boot.db.dao.impl.BaseDaoImpl<T, Long, M> implements BaseDao<T> {
}