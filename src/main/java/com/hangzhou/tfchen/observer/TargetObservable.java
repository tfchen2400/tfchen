package com.hangzhou.tfchen.observer;

import java.util.Observable;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/11/2 15:43
 * @描述：观察者模式
 * @注意事项：
 */
//Observable是被观察者对象接口，实现该接口就是：目标（被观察者）的具体实现
public class TargetObservable extends Observable {
    private String message;

    public String getContent() {
        return message;
    }

    public void setMessage(String string) {
        this.message = string;
        super.setChanged();
        super.notifyObservers();
    }
}
