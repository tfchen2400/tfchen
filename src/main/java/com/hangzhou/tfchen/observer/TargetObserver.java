package com.hangzhou.tfchen.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/11/2 16:05
 * @描述：
 * @注意事项：
 */
//Observer对象是观察者，实现Observer的对象就是具体的观察者对象
public class TargetObserver implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + ((TargetObservable) o).getContent());
    }
}
