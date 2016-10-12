package com.hangzhou.tfchen.webservice.Impl;

import com.hangzhou.tfchen.webservice.IDadeRestful;

import javax.ws.rs.*;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/10/11 20:25
 * @描述：
 * @注意事项：
 */
@Produces({"application/json"})
public class DadeRestfulImpl implements IDadeRestful {
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
}
