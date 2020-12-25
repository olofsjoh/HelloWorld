package com.example.helloworld;

public class Structure {
    int _length;
    int _width;
    int _height;

    Structure(int length, int width, int heigh){
        _length = length;
        _width= width;
        _height = heigh;
    }

    public int getHeight() {
        return _height;
    }
    public int getWith() {
        return _width;
    }

    public int getlength() {
        return _length;
    }

}
