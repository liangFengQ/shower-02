package org.yuan.boot.webmvc.app.dao.impl;

import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.dao.impl.BaseDaoImpl;
import org.yuan.boot.webmvc.app.pojo.BaseEntity;
import org.yuan.boot.webmvc.app.repository.BaseRepository;
import org.yuan.boot.webmvc.app.dao.BaseService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:35
 */
public class BaseServiceImpl<T extends BaseEntity<T>, R extends BaseRepository<T>, M extends BaseMapper<T>> extends BaseDaoImpl<T, Long, R, M> implements BaseService<T> {
}