package exercisesandtests.extendexample;

public class Rectangle extends Figure {

    private String desc = "rectangle";

    public Rectangle (int a, int b, String desc){
        super(a, b);
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
