package com.example.tuan4_listview;

public class Goods {
    public String getName() {
        return name;
    }

    public Goods(String name, String shopName, int imgGoods) {
        this.name = name;
        this.shopName = shopName;
        this.imgGoods = imgGoods;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImgGoods() {
        return imgGoods;
    }

    public void setImgGoods(int imgGoods) {
        this.imgGoods = imgGoods;
    }

    private String name;
    private String shopName;
    private int imgGoods;

}
