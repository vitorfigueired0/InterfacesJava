package Shapes.entities;

public abstract class AbstractShape implements Shape{
    private COLOR color;

    public AbstractShape(COLOR color){
        this.color = color;
    }

    public COLOR getColor() {
        return color;
    }
}
