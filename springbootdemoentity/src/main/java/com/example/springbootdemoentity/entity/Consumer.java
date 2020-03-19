package com.example.springbootdemoentity.entity;

/**
 * @ClassName Consumer
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/19 10:33
 * @Version V1.0
 **/
public class Consumer {
    private String name;
    private int age;
    private String add;
    private String email;

    public Consumer() {
        this.name = "name";
        this.age = 12;
        this.add = "北京市历史互通";
        this.email = "6666.qq.com";
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
