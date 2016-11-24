package ua.itea.homework15ShapesGUI;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Администратор on 02.11.2016.
 */
public class TreeSetMemory {

    TreeSet<Shape> shapesTree;

    public TreeSetMemory(){
        shapesTree = new TreeSet<>(new Sort());
    }

    public void addShapeToTreeSet(Shape shape){
        shapesTree.add(shape);
    }

    public String getInfoAllShapes() {
        String infoShapes = "<html><table border='1'><tr><th>ID</th><th>NAME</th><th>COLOR</th><th>SQUARE</th><th>PERIMETER</th></tr>";
        int count = 0;
        for (Shape s : shapesTree) {
            infoShapes += "<tr> <td>" + ++count + "</td><td>" + s.getName() + "</td><td>" + s.getColor()
                    + "</td><td>" + s.getSquare() + "</td><td>" + s.getPerimeter() + "</td></tr>";
        }
        return infoShapes;
    }

    public void clearTree(){
        shapesTree.clear();
    }

    public TreeSet<Shape> getShapesTree() {
        return shapesTree;
    }
}

class Sort implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        Integer par1 = o1.getSquare()/o1.getPerimeter();
        Integer par2 = o2.getSquare()/o2.getPerimeter();
        if(par1 == par2){
            if(!o1.getColor().equals(o2.getColor())){
                return o1.getColor().compareTo(o2.getColor());
            } else if(!o1.getName().equals(o2.getName()));
                return o1.getName().compareTo(o2.getName());
        } else {
            return par1.compareTo(par2);
        }
    }
}
