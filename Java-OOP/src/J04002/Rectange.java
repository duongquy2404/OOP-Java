
package J04002;

public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        this.height=1;
        this.width=1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        color=color.toLowerCase();
        return String.valueOf(color.charAt(0)).toUpperCase()+color.substring(1);
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return this.width*this.height;
    }
    
    public double findPerimeter(){
        return (this.width+this.height)*2;
    }
}
