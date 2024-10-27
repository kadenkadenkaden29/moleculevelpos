import java.util.List;

public class Integrator {
    private double timeStep = 0.01;

    public void update(List<Particle> particles) {
        for (Particle particle : particles) {
            double[] position = particle.getPosition();
            double[] velocity = particle.getVelocity();
            double[] force = particle.getForce();
            double mass = particle.getMass();

            for (int i = 0; i < 3; i++) {
                velocity[i] += (force[i] / mass) * timeStep;
                position[i] += velocity[i] * timeStep;
            }

            particle.setPosition(position);
            particle.setVelocity(velocity);
        }
    }
}