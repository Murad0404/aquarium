public class Shark {
    private int age;
    private int x;
    private int y;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "age=" + age +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
