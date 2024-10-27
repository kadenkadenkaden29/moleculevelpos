import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        List<Particle> particles = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) { // Create 10 particles
            double[] position = new double[]{random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10};
            double[] velocity = new double[]{random.nextDouble() - 0.5, random.nextDouble() - 0.5, random.nextDouble() - 0.5};
            particles.add(new Particle(position, velocity, 1.0));
        }

        Simulation simulation = new Simulation(particles, 100);
        simulation.run();
    }
}