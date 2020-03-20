package com.bird_brown.datamanager01;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;         //ID
    private String name;    //商品名
    private int price;      //単価

    //コンストラクタ
    public Product() {}     //引数が無いので処理を行わない

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //セッタ＆ゲッタ
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
