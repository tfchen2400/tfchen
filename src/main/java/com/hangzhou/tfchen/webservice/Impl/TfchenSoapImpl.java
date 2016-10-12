package com.hangzhou.tfchen.webservice.Impl;

import com.hangzhou.tfchen.webservice.ITfchenSoap;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/10/11 16:01
 * @描述：
 * @注意事项：
 */
@WebService
public class TfchenSoapImpl implements ITfchenSoap {

    @Override
    public String tfchenSoap(@WebParam(name = "par") String arg0) {
        return "hello" + arg0;
    }
}

