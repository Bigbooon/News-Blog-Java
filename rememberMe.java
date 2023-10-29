package com.example.mainpage;

public class rememberMe {

    boolean press;

    rememberMe(){}

    rememberMe(boolean box){
        this.press = box;
    }
    public boolean selected() {
        return press;
    }
}
