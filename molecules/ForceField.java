import java.util.List;

public class ForceField {
    public void calculateForces(List<Particle> particles) {
        for (Particle p1 : particles) {
            double[] force = new double[3];
            for (Particle p2 : particles) {
                if (p1 != p2) {
                    double[] f = calculateForceBetween(p1, p2);
                    for (int i = 0; i < 3; i++) {
                        force[i] += f[i];
                    }
                }
            }
            p1.setForce(force);
        }
    }

    private double[] calculateForceBetween(Particle p1, Particle p2) {
        double[] force = new double[3];
        double[] pos1 = p1.getPosition();
        double[] pos2 = p2.getPosition();
        double distance = 0.0;
        for (int i = 0; i < 3; i++) {
            distance += Math.pow(pos2[i] - pos1[i], 2);
        }
        distance = Math.sqrt(distance);
        double magnitude = 1.0 / Math.pow(distance, 2); // Simplified force calculation
        for (int i = 0; i < 3; i++) {
            force[i] = magnitude * (pos2[i] - pos1[i]) / distance;
        }
        return force;
    }
}