package com.hangzhou.tfchen.observer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/11/2 16:12
 * @描述：观察者模式测试
 * @注意事项：
 */

public class ObserverTest {


    public ObserverTest() {
    }

    @Test
    public void observerTest() {
        //创建一个被观察者
        TargetObservable targetObservable = new TargetObservable();
        //创建观察者
        TargetObserver t1 = new TargetObserver();
        t1.setName("observer1");

        TargetObserver t2 = new TargetObserver();
        t2.setName("observer2");

        // 注册观察者
        targetObservable.addObserver(t1);
        targetObservable.addObserver(t2);

        Assert.assertEquals(targetObservable.countObservers(),2);

        targetObservable.setMessage("Hello World");
    }
}
