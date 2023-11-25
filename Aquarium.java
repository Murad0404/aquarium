import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aquarium {
    public static final int x = 5;
    public static final int y = 5;
    public static final int fishInitialBound = 10;
    public static final int sharkInitialBound = 1;

    private List<Fish> fishList;
    private List<Shark> sharkList;

    public void start() {
        addFish();
        addShark();
    }

    public void addFish(){
        fishList = new ArrayList<>();

        int fishNumber  = RandomUtil.getRandom(fishInitialBound);
        for (int i = 0; i < fishNumber; i++) {
            Fish fish = FishFactory.getFish(this);
            fish.start();
            fishList.add(fish);
        }
        System.out.println(fishList.size());
    }

    public void addShark(){
        sharkList = new ArrayList<Shark>();
        Random randomShark = new Random();
        int sharkNumber = RandomUtil.getRandom(sharkInitialBound);
        for (int i = 0; i < sharkNumber; i++) {
            sharkList.add(FishFactory.getShark());
        }
        System.out.println(sharkList.size());
        System.out.println(sharkList);
    }

    public void checkCollision(Fish fish){
        for (Fish f : fishList){
            if (f.getX() == fish.getX() && f.getY() == fish.getY() &&
                    !f.getGender().equals(fish.getGender())){
                Fish bornFish = FishFactory.getFish(this);
                System.out.println("---------------- New Fish"+ bornFish);
                bornFish.start();
                fishList.add(bornFish);
            }
        }
    }
}
