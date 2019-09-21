package exercisesandtests.extendexample;

public class Square extends Figure {

    private String desc = "square";

    public Square(int a, int b, String desc) {
        super(a, b);
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
