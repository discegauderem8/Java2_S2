public abstract class Athlete {
    protected int maxRunDistance;
    protected int maxJumpDistance;
    protected String name;
    protected boolean canContinue = true;

    public Athlete(int maxRunDistance, int maxJumpDistance, String name) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.name = name;
    }
    abstract void jump(int height); // Решить данную задачу через интерфейс красиво не получилось, так как мы в Program
    abstract void run(int distance);// приводим элементы к родительскому классу, то есть абстрактные методы должны быть
}                                   // заложены уже в него, и интерфейсы избыточны
