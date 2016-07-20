package Week333.day2.state2;

import Week333.day2.state.InProcess;

/**
 * Created by Артем on 05.06.2016.
 */
public class CoffeeMashine implements State {
    State currentState;
    State makeChoice;
    State outOfOrder;
    State inProcess;
    State noMoney;

    private int coffeePrice;

    public CoffeeMashine() {

       // this.makeChoice = new MakeChoiseState(this);
       // this.outOfOrder = new OutofOrderState(this);
       // this.inProcess = new InProcessState(this);
       // this.noMoney = new NoMoneyState(this);
        this.currentState = noMoney;
        coffeePrice = 15;
    }


    @Override
    public void makeChoice() {
        currentState.makeChoice();
    }

    @Override
    public void makeDrink() {
currentState.makeDrink();
    }

    @Override
    public void cansel() {
currentState.cansel();
    }

    @Override
    public void giveMoney() {
currentState.giveMoney();
    }
}
