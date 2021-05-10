package com.gabriel.design.proxy;

/**
 * @author : zouxiaoxiang
 * @description : 代理类
 * @date : 2021.05.10 13:10
 */
public class FatPigProxy implements Animal {

  private Pig pig;

  public FatPigProxy(Pig pig){
    this.pig = pig;
  }

  public FatPigProxy(){
  }

  @Override
  public void bark() {
    before();

    pig.bark();

    atfer();
  }



  private void before() {
    System.out.println("肥猪叫之前的准备工作");
  }

  private void atfer() {
    System.out.println("肥猪叫之后的应对措施");
  }


}