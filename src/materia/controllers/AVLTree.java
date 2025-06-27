package materia.controllers;

import materia.models.Nodo;

public class AVLTree {
    private Nodo root;

    public AVLTree() {
        this.root = null;
    }

    public void insert ( int value){
        root = insertRec(root, value);
    }

    private Nodo insertRec ( Nodo node, int value ){
                                            // null , 50 
        if ( node == null){
            Nodo newNodo = new Nodo(value, node, node);
            newNodo.setHeight(1);
            System.out.println("Nodo insertado -> " + value + " con balance " );
        return newNodo;
            
        }
        if ( value < node.getValue()){
            // me voy a la izquierda
            Nodo newNode = insertRec(node.getLeft(), value);
            node.setLeft(newNode);
            
        } else if (value > node.getValue())
        node.setRight(insertRec(node.getRight(), value));
        // me voy a la derecha
        

        


        // sacar la altura
        System.out.println("Nodo actual  -> " + node.getValue());
        int altura = 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        node.setHeight(altura);
        System.out.println("Altura ->" + altura);
        

        // obtener balance
        int balance = getBalance(node);
        System.out.println("\tBalance -> " + balance);

        //CASO 

        

        




        return node;


    }
    private int getBalance ( Nodo node){
        if ( node == null) return 0;
        return ( height(node.getLeft()) - height(node.getRight()));
    }

   

    private int height ( Nodo node){
        if ( node == null) return 0;
        return node.getHeight();
    }

    private Nodo leftRatation ( Nodo x){
        Nodo y = x.getRight();
        Nodo temp = y.getLeft();

        System.out.println("Rotacion IZQ en nodo " + x.getValue() + " , con balance = " + getBalance(x));

        //Realizar rotacion 
        y.setLeft(x);
        x.setRight(temp);
        System.out.println("Nueva raiz despues de la rotacion es " +  y.getValue());

        //Actualizar las alturas de x y Y
        
        x.setHeight(Math.max( height(x.getLeft()) , height(x.getRight())) + 1);
        y.setHeight(Math.max(height(y.getLeft()) , height(y.getRight())));

        return y;

    }
    private Nodo RightRotation ( Nodo y ){
        Nodo x = y.getLeft();
        Nodo temp = x.getRight();

        System.out.println("Rotacion IZQ en nodo " + x.getValue() + " , con balance = " + getBalance(y));
        x.setRight(y);
        y.setLeft(temp);
        System.out.println(" Nueva raiz despues de la rotacion es " + x.getValue());
        return x;

        
    }


    
    

    
}
