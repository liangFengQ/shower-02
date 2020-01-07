package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.example.BaseCustomerInfoExample;

import java.util.List;

@Mapper
public interface BaseCustomerInfoMapper extends BaseMapper<BaseCustomerInfo> {
    long countByExample(BaseCustomerInfoExample example);

    int deleteByExample(BaseCustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseCustomerInfo record);

    int insertSelective(BaseCustomerInfo record);

    List<BaseCustomerInfo> selectByExample(BaseCustomerInfoExample example);

    BaseCustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseCustomerInfo record, @Param("example") BaseCustomerInfoExample example);

    int updateByExample(@Param("record") BaseCustomerInfo record, @Param("example") BaseCustomerInfoExample example);

    int updateByPrimaryKeySelective(BaseCustomerInfo record);

    int updateByPrimaryKey(BaseCustomerInfo record);
}