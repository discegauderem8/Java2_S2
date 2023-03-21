public class Cat extends Athlete {
    public Cat(int maxRunLimit, int maxJumpDistance, String name) {
        super(maxRunLimit, maxJumpDistance, name);
    }

    @Override
    public void run(int distance) {
        if (!canContinue){
            return;
        }
        if (distance <= maxRunDistance){
            System.out.println(this.name + " успешно пробежал дистанцию в " + distance + " м.");
        } else {
            System.out.println(this.name + " не смог пробежать дистанцию в " + distance + " м.");
            System.out.println(this.name + " больше не может участвовать в забеге :с");
            canContinue = false;
        }
    }

    @Override
    public void jump(int height) {
        if (!canContinue){
            return;
        }
        if (height <= maxJumpDistance){
            System.out.println(this.name + " успешно перепрыгнул через стену высотой в " + height + " м.");
        } else {
            System.out.println(this.name + " не смог перепрыгнуть через стену высотой в " + height + " м.");
            System.out.println(this.name + " больше не может участвовать в забеге :с");
            canContinue = false;
        }
    }
}
