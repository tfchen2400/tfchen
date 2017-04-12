package com.hangzhou.tfchen.webservice.Impl;

import com.hangzhou.tfchen.webservice.ITfchenRestful;

import javax.ws.rs.*;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/10/11 20:14
 * @描述：
 * @注意事项：
 */
@Produces({"application/json"})
public class TfchenRestfulImpl implements ITfchenRestful {

    @Override
    @POST
    @Path("/methodOnePostPost")
    public String methodOnePost(@FormParam("par") String par) {
        return "hello" + par;
    }

    @Override
    @GET
    @Path("/methodOnePostGet")
    public String methodOneGet(@QueryParam("par") String par) {
        return "hello" + par;
    }

    @Override
    @GET
    @Path("/booleanMethod")
    public Boolean booleanMethod() {
        return Boolean.FALSE;
    }

    @Override
    @GET
    @Path("/integerMethod")
    public Integer integerMethod() {
        return new Integer(100);
    }

    @Override
    @GET
    @Path("/doubleMethod")
    public Double doubleMethod() {
        return new Double(3.1415926);
    }

    @Override
    @GET
    @Path("/boolean2Method")
    public boolean boolean2Method() {
        return true;
    }

    @Override
    @GET
    @Path("/intMethod")
    public int intMethod() {
        return 12;
    }

    @Override
    @GET
    @Path("/double2Method")
    public double double2Method() {
        return 3.333;
    }

}
