package com.example.demo;

public class HelloRequest {
    private String name;

    public HelloRequest(){

    }

    public HelloRequest(String name){this.name = name;}

    //Getter
    public String getName(){return name;}

    public void setName(String name){this.name = name;}
}