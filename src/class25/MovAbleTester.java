package class25;

public class MovAbleTester {
    public static void main(String[] args) {

     MovAble [] movAbles={new Car(),new Dog() };

        for(MovAble w:movAbles){
            w.move();
        }



    }
}

