import java.util.List;

public class KineticEnergy {
    public double calculate(List<Particle> particles) {
        double totalEnergy = 0.0;
        for (Particle particle : particles) {
            double[] velocity = particle.getVelocity();
            double kineticEnergy = 0.5 * particle.getMass() * (Math.pow(velocity[0], 2) + Math.pow(velocity[1], 2) + Math.pow(velocity[2], 2));
            totalEnergy += kineticEnergy;
        }
        return totalEnergy;
    }
}