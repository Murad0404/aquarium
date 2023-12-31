public class Fish extends Thread {
    private int age;
    private Gender gender;
    private int x;
    private int y;

    private Aquarium aquarium;

    public Fish(Aquarium aquarium) {
        this.aquarium = aquarium;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void run() {
        while (age > 0) {
            move();
            aquarium.checkCollision(this);
            age--;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this);
        }
    }

    public void move() {
        int n = RandomUtil.getRandom(4);
        switch (n) {
            case 1: {
                if (y < Aquarium.y) {
                    y++;
                }
            }
            case 2: {
                if (x < Aquarium.x) {
                    x++;
                }
            }
            case 3:{
                if (y > 0){
                    y--;
                }
            }
            case 4:{
                if (x > 0){
                    x--;
                }
            }
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
        return "Fish{" +
                "name="+getName()+
                ", age=" + age +
                ", gender=" + gender +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
