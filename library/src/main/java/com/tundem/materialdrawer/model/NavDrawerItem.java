package com.tundem.materialdrawer.model;


import com.mikepenz.iconics.typeface.IIcon;

public class NavDrawerItem {
    public static final int PRIMARY = 1;
    public static final int SECONDARY = 2;
    public static final int SPACER = 3;

    private String title;
    private IIcon icon;
    private boolean enabled = true;
    private int type = PRIMARY;

    public NavDrawerItem() {
    }

    public NavDrawerItem(String title) {
        this.title = title;
    }

    public NavDrawerItem(String title, IIcon icon) {
        this.setTitle(title);
        this.setIcon(icon);
    }

    public NavDrawerItem(String title, int type) {
        this.title = title;
        this.type = type;
    }

    public NavDrawerItem(String title, int type, boolean enabled) {
        this.title = title;
        this.type = type;
        this.enabled = enabled;
    }

    public NavDrawerItem(String title, IIcon icon, int type) {
        this.setTitle(title);
        this.setIcon(icon);
        this.setType(type);
    }

    public NavDrawerItem(String title, IIcon icon, int type, boolean enabled) {
        this.setTitle(title);
        this.setIcon(icon);
        this.setType(type);
        this.setEnabled(enabled);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IIcon getIcon() {
        return icon;
    }

    public void setIcon(IIcon icon) {
        this.icon = icon;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public NavDrawerItem(int type) {
        this.type = type;
    }
}
