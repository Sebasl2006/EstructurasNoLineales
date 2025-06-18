package materia.controllers;

import materia.models.Nodo;

public class BinaryTree {

    private Nodo root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert ( int value){ // 17
                                //N(50),17
        root = insertRec(root , value);
    }

    private Nodo insertRec ( Nodo padre, int value ){
                                            // null , 50 
        if ( padre == null){
            return new Nodo(value, padre, padre);
        }
        if ( value < padre.getValue()){
            // me voy a la izquierda
            Nodo newNode = insertRec(padre.getLeft(), value);
            padre.setLeft(newNode);
            
        } else if (value > padre.getValue())
        padre.setRight(insertRec(padre.getRight(), value));
        // me voy a la derecha
        

        

        return padre;

    }

    public void imprimirArbol(){
        printInOrder(root);
        

    }

    private void printInPreOrder(Nodo node){
        if ( node != null ){
            System.out.print(node.getValue() + " , ");
            printInPreOrder(node.getLeft());
            printInPreOrder(node.getRight());
            
        }
    }

    private void  printPosOrder (Nodo node){
        if ( node != null){
            printPosOrder(node.getLeft());
            printPosOrder(node.getRight());
            System.out.print(node.getValue() + " , ");
        }


    


    }

    private void printInOrder ( Nodo node ){
        if ( node != null){
            printInOrder(node.getLeft());
            System.out.print(node.getValue() + ",");
            printInOrder(node.getRight());
        }
    }

    
    
    
}
