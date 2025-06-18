package materia.models;

public class Nodo {

    private int value;
    private Nodo Left;
    private Nodo Right;
    public Nodo(int value, Nodo left, Nodo right) {
        this.value = value;
        Left = left;
        Right = right;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Nodo getLeft() {
        return Left;
    }
    public void setLeft(Nodo left) {
        Left = left;
    }
    public Nodo getRight() {
        return Right;
    }
    public void setRight(Nodo right) {
        Right = right;
    }
    @Override
    public String toString() {
        return "Nodo [value=" + value + ", Left=" + Left + ", Right=" + Right + "]";
    }

    
}
    