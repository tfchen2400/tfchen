package com.hangzhou.tfchen.common.dao;

import com.hangzhou.tfchen.common.bean.Content;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/4 15:02
 * @描述：
 * @注意事项：
 */
@MapperScan
public interface IContentDao {
    /**
     * 根据ID查找content
     *
     * @param id
     * @return
     */
    Content findContent(Integer id);
}
