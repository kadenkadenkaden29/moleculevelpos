import java.util.List;

public class BoundaryCondition {
    private double boxSize = 10.0;

    public void apply(List<Particle> particles) {
        for (Particle particle : particles) {
            double[] position = particle.getPosition();
            for (int i = 0; i < 3; i++) {
                if (position[i] < 0) position[i] += boxSize;
                if (position[i] >= boxSize) position[i] -= boxSize;
            }
            particle.setPosition(position);
        }
    }
}