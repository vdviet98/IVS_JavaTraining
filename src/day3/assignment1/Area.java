package day3.assignment1;
class Area {
    private int length;
    private int breadth;
    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int returnArea() {
        return this.length * this.breadth;
    }
}
