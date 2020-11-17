package io.zipcoder.casino.cardclasses;


import io.zipcoder.casino.Player;


import java.util.ArrayList;

public class CardGame {
   protected ArrayList<Player> players;
    CardDeck deck;

    public CardGame(ArrayList<Player> players) {
        this.players = players;
        deck = new CardDeck();
    }

    public CardGame() {

    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void initialCardsGiven(int gameType) {
        switch (gameType) {
            case 1: //GoFish
                goFishDecideByPlayers();
        }
        }

    private void goFishDecideByPlayers() {
        if (players.size() == 2) {
            for (Player p : players) {
                System.out.println(p.getName());
                for (int i = 0; i < 5; i++) {
                   // deck.getDeck();
                   // deck.shuffleDeck();
                    p.addCard(deck.getDeck().pop());
                    System.out.println(deck.getDeck().size());
                }
            }
        }
       else {
            for (Player p : players) {
                for (int i = 0; i < 7; i++) {
                   // deck.getDeck();
                   // deck.shuffleDeck();
                    p.addCard(deck.getDeck().pop());
                }
            }
        }
    }



    public void addPlayer(Player newPlayer) {
        players.add(newPlayer);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }
}
