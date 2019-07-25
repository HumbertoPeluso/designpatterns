package com.company;

import com.company.structure.facade.FacadePhone;

public class FacadeDemo {

    public static void main(String[] args) {

        FacadePhone facadePhone = new FacadePhone(); // by one class is possible to build different objects

        System.out.println(facadePhone.buildAndroidPhone());
        System.out.println(facadePhone.buildApplePhone());
        System.out.println(facadePhone.buildMicrosoftPhone());

    }

}
