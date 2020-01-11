package org.yuan.boot.webmvc.app.dao.impl;

import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.dao.impl.BaseDaoImpl;
import org.yuan.boot.webmvc.app.pojo.BaseEntity;
import org.yuan.boot.webmvc.app.dao.BaseService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:02
 */
public class BaseServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> extends BaseDaoImpl<T, Long, M> implements BaseService<T> {
}