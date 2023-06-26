public class Main {
    public static void main(String[] args) {
        ToyQueue toyQueue = new ToyPriorityQueue();
        ToyShop toyShop = new ToyShop(toyQueue);
        toyShop.addToy(
                new String[]{"id1", "id2", "id3","id4", "id5", "id6", "id7", "id8", "id9", "id10"},
                new String[]{"Robot", "Car", "Bear", "Doll", "Plane", "Rocket", "Lego", "Sword", "Gun", "Knife"},
                new int[]{5, 3, 7, 4, 2, 8, 6, 9, 1, 10}
        );
        toyShop.save("toy_results.txt");
    }
}

