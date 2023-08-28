package app;

import java.util.Random;

public class SuperHero {
    private String name;
    private int health;
    private boolean isDead;

    public SuperHero(String name, int health) {
        this.name = name;
        this.health = health;
        this.isDead = false;
    }

    public void attack(SuperHero opponent) {
        Random random = new Random();
        int damage = random.nextInt(10) + 1;
        opponent.takeDamage(damage);
        System.out.println(this.name + " attacks " + opponent.name + " with damage " + damage);
        System.out.println(opponent.name + "'s health: " + opponent.health);
    }

    public boolean isDead() {
        return isDead;
    }

    private void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            isDead = true;
        }
    }
    private void determineHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            isDead = true;
        }
        
    }
    
}
