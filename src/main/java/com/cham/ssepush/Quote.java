package com.cham.ssepush;

public class Quote {
    private String content;
    private String name;
    private String address;
    private int age;

    public Quote(String content, String name, String address, int age){
        this.content = content;
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
