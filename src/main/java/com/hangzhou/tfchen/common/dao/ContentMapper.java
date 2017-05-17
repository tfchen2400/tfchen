package com.hangzhou.tfchen.common.dao;

import com.hangzhou.tfchen.common.bean.Content;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/5/17 11:09
 * @描述：
 * @注意事项：
 */
@MapperScan
public interface ContentMapper {
    Content findContent(Integer id);
}
