package Estructurales.Flyweight;

import Estructurales.Flyweight.Classes.Tree;
import Estructurales.Flyweight.Classes.TreeType;
import Estructurales.Flyweight.Factory.TreeFactory;

import java.util.List;

public class Forest {
    private List<Tree> trees;

    private Tree planTree(int x, int y, String name, String color,  String texture){
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
        return tree;
    }
}
