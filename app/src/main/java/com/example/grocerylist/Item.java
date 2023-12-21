package com.example.grocerylist;

public class Item {
    int itemImg;
    String name, description;

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item(int itemImg, String name, String description) {
        this.itemImg = itemImg;
        this.name = name;
        this.description = description;
    }
}
