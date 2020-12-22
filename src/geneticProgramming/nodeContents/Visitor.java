package geneticProgramming.nodeContents;

import geneticProgramming.structure.Node;

public class Visitor {

    public double forConstant(Node node){
        return (double) node.value().getContent();
    }

    public double forFunctionPlus(Node node){
        return node.getLeft().accept(this) + node.getRight().accept(this);
    }

    public double forFunctionMinus(Node node){
        return node.getLeft().accept(this) - node.getRight().accept(this);
    }

    public double forFunctionTimes(Node node){
        return node.getLeft().accept(this)*node.getRight().accept(this);
    }

    public double forFunctionDivided(Node node){
        if (node.getRight().accept(this) == 0){
            return 1;
        }
        else{
            return node.getLeft().accept(this)/node.getRight().accept(this);
        }
    }
}
