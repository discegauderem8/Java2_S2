import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Athlete> athletes = new ArrayList<>();

        Human human1 = new Human(random.nextInt(10000, 20001), random.nextInt(1,3),"Игорь Андреевич");
        Human human2 = new Human(random.nextInt(10000, 30001), random.nextInt(1,3),"Васян");
        Cat cat1 = new Cat(random.nextInt(1000, 20001), random.nextInt(2,4),"Барсик");
        Cat cat2 = new Cat(random.nextInt(1000, 20001), random.nextInt(2,4),"Снежок");
        Robot robot1 = new Robot(100000, 100, "SteamMonster2023");
        athletes.add(human1);
        athletes.add(human2);
        athletes.add(cat1);
        athletes.add(cat2);
        athletes.add(robot1);

        ArrayList<Obstacle> obstacles = new ArrayList<>();
        Track track1 = new Track(random.nextInt(1,30001));
        obstacles.add(track1);
        Wall wall1 = new Wall(random.nextInt(1,6));
        obstacles.add(wall1);
        Track track2 = new Track(random.nextInt(1,30001));
        obstacles.add(track2);
        Wall wall2 = new Wall(random.nextInt(1,6));
        obstacles.add(wall2);
        Track track3 = new Track(random.nextInt(1,30001));
        obstacles.add(track3);
        Wall wall3 = new Wall(random.nextInt(1,6));
        obstacles.add(wall3);


        int a;
        for (Athlete subject: athletes) {
            for (Obstacle obstacle: obstacles) {
                if (obstacle instanceof Wall){
                    a = ((Wall) obstacle).getHeight();
                    subject.jump(a);
                } else{
                    a = ((Track) obstacle).getDistance();
                    subject.run(a);
                }
            }
        }

    }
}
