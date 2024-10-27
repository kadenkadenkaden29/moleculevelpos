import java.util.List;

public class Logger {
    public void log(List<Particle> particles, int step) {
        System.out.println("Step: " + step);
        for (Particle particle : particles) {
            System.out.println("Particle: Position = " + arrayToString(particle.getPosition()) + ", Velocity = " + arrayToString(particle.getVelocity()));
        }
    }

    private String arrayToString(double[] array) {
        return "[" + array[0] + ", " + array[1] + ", " + array[2] + "]";
    }
}