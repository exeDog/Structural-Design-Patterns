package com.priyank.spring.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    String print(MenuComponent menuComponent) {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append(":");
        stringBuilder.append(url);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented");
    };

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented");
    };

    public abstract String toString();
}
