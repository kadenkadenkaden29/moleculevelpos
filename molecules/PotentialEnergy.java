import java.util.List;

public class PotentialEnergy {
    public double calculate(List<Particle> particles) {
        double totalEnergy = 0.0;
        for (int i = 0; i < particles.size(); i++) {
            for (int j = i + 1; j < particles.size(); j++) {
                totalEnergy += calculatePairEnergy(particles.get(i), particles.get(j));
            }
        }
        return totalEnergy;
    }

    private double calculatePairEnergy(Particle p1, Particle p2) {
        double[] pos1 = p1.getPosition();
        double[] pos2 = p2.getPosition();
        double distance = 0.0;
        for (int i = 0; i < 3; i++) {
            distance += Math.pow(pos2[i] - pos1[i], 2);
        }
        distance = Math.sqrt(distance);
        return 1.0 / distance; // Simplified potential energy calculation
    }
}