package myFileWorker;

/**
 * Created by Администратор on 09.11.2016.
 */
public class MySettings {

    String name;
    int decks;
    int minBet;
    int maxBet;
    int money;

    public void setName(String name) {
        this.name = name;
    }

    public void setDecks(int decks) {
        this.decks = decks;
    }

    public void setMinBet(int minBet) {
        this.minBet = minBet;
    }

    public void setMaxBet(int maxBet) {
        this.maxBet = maxBet;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getDecks() {
        return decks;
    }

    public int getMinBet() {
        return minBet;
    }

    public int getMaxBet() {
        return maxBet;
    }

    public int getMoney() {
        return money;
    }
}
