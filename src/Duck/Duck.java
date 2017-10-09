package Duck;

/**
 * Created by UI on 13.09.2017.
 */
 public abstract class  Duck  {
     FlyBehavior flyBehavior;
    Quackbehavior quackbehavior;
    public void perfomQuack(){quackbehavior.quack();}
    public  void perfomFly(){
         flyBehavior.fly();
    };
    abstract public void display();
     public void setFlyBehavior(FlyBehavior fb){
          flyBehavior = fb;
     }
     public void setQuackbehavior (Quackbehavior qb){quackbehavior=qb;}

}
