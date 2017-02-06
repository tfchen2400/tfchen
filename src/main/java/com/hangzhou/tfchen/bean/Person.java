package com.hangzhou.tfchen.bean;

import java.util.Date;
import java.util.List;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2016/10/12 9:56
 * @描述：
 * @注意事项：
 */
public class Person {
    private Integer id;
    private String name;
    private String city;
    private Integer age;
    private Date birthDay;
    private List<Son> sons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Son> getSons() {
        return sons;
    }

    public void setSons(List<Son> sons) {
        this.sons = sons;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", city='" + city + '\'' + ", age=" + age + ", birthDay=" + birthDay + '}';
    }
}
