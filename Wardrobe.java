public class Wardrobe {
    enum State {
        Open,
        Close
    }

    private int width = 50;
    private int length = 120;
    private int height = 170;
    private String color = "brown";
    private State state;


    public int getwidth() {
        return width;
    }

    public int getlength() {
        return length;
    }

    public int getheight() {
        return height;
    }

    public String getcolor() {
        return color;
    }

    public void door() {
        if (this.state == State.Open) {
            this.doorClose();
            this.state = State.Close;
        }
        else {
            this.doorOpen();
            this.state = State.Open;
        }
        System.out.println();
    }

    public void doorClose() {
        System.out.println("закрывает дверцы шкафа");
    }

    public void doorOpen() {
        System.out.println("открывает дверцы шкафа");
    }

}