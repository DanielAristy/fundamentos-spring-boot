package com.fundamentosplatzi.springboot.fundamentos.beans;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi implementación propia del bean!");
    }
}
