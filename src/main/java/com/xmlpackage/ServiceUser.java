package com.xmlpackage;

public class ServiceUser {
    private Action action;

    public void service(){
        action.doWork();
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
