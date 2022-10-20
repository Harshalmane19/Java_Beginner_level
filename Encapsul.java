public class Encapsul {
    private int height;
    private int width;

    public void setHt(int height)
    {
       this.height=height;
    }
    public int getHt()
    {
        return height;
    }

    public void setWt(int width)
    {
        this.width=width;
    }
    public int getWt()
    {
        return width;
    }
    public int area()
    {
        return height*width;
    }
    public int perimeter()
    {
        return (2*height)+(2*width);
    }

}

