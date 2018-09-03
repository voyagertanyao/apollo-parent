package com.voyager.model.tree;

import java.util.Objects;

public class Tree {
    private String name;

    public Tree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Objects.equals(name, tree.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
