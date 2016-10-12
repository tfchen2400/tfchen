package com.hangzhou.tfchen.webservice.Impl;

import com.hangzhou.tfchen.bean.Person;
import com.hangzhou.tfchen.webservice.IDadeSoap;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/10/11 16:10
 * @描述：
 * @注意事项：
 */
@WebService
public class DadeSoapImpl implements IDadeSoap {

    @Override
    public Person method1(@WebParam(name = "par")Person person) {
        return person;
    }
}
