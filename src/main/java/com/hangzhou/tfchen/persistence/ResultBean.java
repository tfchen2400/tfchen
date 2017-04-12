package com.hangzhou.tfchen.persistence;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author chentf
 *         <p>
 *         2016年7月12日
 */

public class ResultBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -8605566028940170996L;
    private String msgId;
    private String msgDesc;
    private String success;
    private HashMap<String, Object> result = new HashMap<String, Object>();

    public ResultBean() {
    }

    public ResultBean(String msgId, String msgDesc) {
        super();
        this.msgId = msgId;
        this.msgDesc = msgDesc;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }

    public HashMap<String, Object> getResult() {
        return result;
    }

    public void setResult(HashMap<String, Object> result) {
        this.result = result;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}

