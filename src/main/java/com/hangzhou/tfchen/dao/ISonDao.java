package com.hangzhou.tfchen.dao;

import com.hangzhou.tfchen.bean.Son;
import org.springframework.stereotype.Service;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/12/7 15:35
 * @描述：
 * @注意事项：
 */
public interface ISonDao {
    /**
     *
     * @param son
     */
    public void saveSon(Son son);
}
