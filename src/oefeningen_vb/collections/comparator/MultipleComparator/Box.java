package oefeningen_vb.collections.comparator.MultipleComparator;

public class Box implements Comparable<Box>{
    private int width;
    private int height;
    private int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getVolume() {
        return width * length * height;
    }

    @Override
    public String toString() {
        return String.format("Box [width=%s, length=%s, height=%s]", width, length, height);
    }

    @Override
    public int compareTo(Box o) {
        return this.getVolume() - o.getVolume();
    }
}
