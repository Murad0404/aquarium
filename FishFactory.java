public class FishFactory {

    private static final int ageMaxFish = 15;
    private static final int ageMaxShark = 100;
    public static Fish getFish(Aquarium aquarium){
        Fish fish = new Fish(aquarium);
        fish.setAge(RandomUtil.getRandom(ageMaxFish));
        fish.setGender(RandomUtil.getBoolean()?Gender.MALE : Gender.FEMALE);
        fish.setX(RandomUtil.getRandom(Aquarium.x));
        fish.setY(RandomUtil.getRandom(Aquarium.y));
        return fish;
    }
    public static Shark getShark(){
        Shark shark = new Shark();
        shark.setAge(RandomUtil.getRandom(ageMaxShark));
        shark.setX(RandomUtil.getRandom(Aquarium.x));
        shark.setY(RandomUtil.getRandom(Aquarium.y));
        return shark;
    }
}