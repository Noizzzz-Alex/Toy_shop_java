import java.util.Comparator;
import java.util.PriorityQueue;

class ToyPriorityQueue implements ToyQueue {
    private PriorityQueue<Toy> toyQueue;

    public ToyPriorityQueue() {
        toyQueue = new PriorityQueue<>(Comparator.comparingInt(Toy::getFrequency).reversed());
    }

    @Override
    public void addToy(Toy toy) {
        toyQueue.add(toy);
    }

    @Override
    public Toy getNextToy() {
        return toyQueue.poll();
    }
}
