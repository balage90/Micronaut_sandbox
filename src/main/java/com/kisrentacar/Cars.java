package com.kisrentacar;

class Car {
    private int id;
    private String model;
    private String type;



    public Car(int id, String model, String type) {
        this.id = id;
        this.model = model;
        this.type = type;
    }
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }



}