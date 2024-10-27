import java.util.List;

public class Thermostat {
    private double targetTemperature = 300.0;

    public void apply(List<Particle> particles) {
        double currentTemperature = calculateTemperature(particles);
        double scalingFactor = Math.sqrt(targetTemperature / currentTemperature);
        for (Particle particle : particles) {
            double[] velocity = particle.getVelocity();
            for (int i = 0; i < 3; i++) {
                velocity[i] *= scalingFactor;
            }
            particle.setVelocity(velocity);
        }
    }

    private double calculateTemperature(List<Particle> particles) {
        double kineticEnergy = new KineticEnergy().calculate(particles);
        return (2.0 / 3.0) * (kineticEnergy / particles.size());
    }
}