package com.longteng.designpatterns.builder;

/**
 * @className: Car
 * @description: 构建者模式
 * @author: lt
 * @date: 2023/2/22
 **/
public class Car {
    private String lunzi;
    private String fangxiangpan;
    public Car(Builer builer) {
        this.lunzi = builer.lunzi;
        this.fangxiangpan = builer.fangxiangpan;
    }

    public static final class Builer{
        private String lunzi;
        private String fangxiangpan;

        public  Builer lunzi(String lunzi){
            this.lunzi = lunzi;
            return this;
        }
        public  Builer fangxiangpan(String fangxiangpan){
            this.fangxiangpan = fangxiangpan;
            return this;
        }

        public Car builer(){
           return new Car(this);
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "lunzi='" + lunzi + '\'' +
                ", fangxiangpan='" + fangxiangpan + '\'' +
                '}';
    }
}
