import java.io.FileWriter;
import java.io.IOException;

class ToyShop {
    private ToyQueue toys;

    public ToyShop(ToyQueue toys) {
        this.toys = toys;
    }

    public void addToy(String[] ids, String[] names, int[] frequencies) {
        int minSize = Math.min(ids.length, Math.min(names.length, frequencies.length));
        for (int i = 0; i < minSize; i++) {
            Toy toy = new Toy(ids[i], names[i], frequencies[i]);
            toys.addToy(toy);
        }
    }

    public void save(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 10; i++) {
                Toy toy = toys.getNextToy();
                if (toy != null) {
                    String result = "ID игрушки: " + toy.getId() + ", Игрушка: " + toy.getName() + "\n";
                    writer.write(result);
                    System.out.println(result);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
