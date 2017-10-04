/**
 * Created by UI on 13.09.2017.
 * @noinspection ALL
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck(){
    }
        public abstract void display();
        public void performFly(){
        flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void Swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
}