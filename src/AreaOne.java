import java.util.Scanner;

class AreaOne {
    int Length;
    int Breadth;

    public void setDim(int len, int bre) {
        Length = len;
        Breadth = bre;
    }

    public int getArea() {
        return Length * Breadth;
    }
}

