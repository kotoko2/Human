package com.example.human;

import android.util.Log;

class Human extends Animal implements Thinkable {
    //メンバ変数
    String hobby;
    String name;
    int age;

    //コンストラクタ
  public Human (String name,int age,String hobby)  {
      this.name = name;
      this.age = age;
      this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest","私の名前は" + this.name + "です。");
        Log.d("javatest","年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest","私は" + this.hobby +"について考える");
    }
}
