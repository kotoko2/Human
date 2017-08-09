package com.example.human;

import android.util.Log;

class Human extends Animal implements Thinkable {
    //メンバ変数
    String hobby;

    //コンストラクタ
  public Human (String name,int age)  {
      this.name = name;
      this.age = age;
      hobby = "音楽";
    }

    public void say() {
        Log.d("javatest","私の名前は" + this.name + "です。");
        Log.d("javatest","年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest","私は" + hobby +"について考える");
    }
}
