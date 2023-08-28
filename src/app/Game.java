package app;

public class Game {
    public static void main(String[] args) {
        // Create instances of Superman and Batman with random health between 1 and 1000
        Superman superman = new Superman(getRandomHealth());
        Batman batman = new Batman(getRandomHealth());

        // Game loop
        while (!superman.isDead() && !batman.isDead()) {
            superman.attack(batman); // Superman attacks Batman
            if (batman.isDead()) {
                System.out.println("Batman is defeated.");
                break;
            }

            batman.attack(superman); // Batman attacks Superman
            if (superman.isDead()) {
                System.out.println("Superman is defeated.");
                break;
            }
        }

        // Print final game results
        if (superman.isDead()) {
            System.out.println("Game Over: Superman is defeated.");
        } else if (batman.isDead()) {
            System.out.println("Game Over: Batman is defeated.");
        }
    }

    // Method to generate random health between 1 and 1000
    private static int getRandomHealth() {
        return (int) (Math.random() * 1000) + 1;
    }
}
