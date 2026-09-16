package letan_2681.Lec10_Encapsulation.Abstract.Exercise4;

public class Circle implements Drawable, Colorable {
    @Override
    public void draw() {
        System.out.println("Đang vẽ hình tròn (Circle)...");
    }

    @Override
    public void fillColor() {
        System.out.println("Đang tô màu cho hình tròn (Circle)...");
    }
}
