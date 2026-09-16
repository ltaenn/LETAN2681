package letan_2681.Lec10_Encapsulation.Abstract.Exercise3;

public class Report implements Printable {
    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("[Đang in Báo Cáo]: " + title);
    }
}
