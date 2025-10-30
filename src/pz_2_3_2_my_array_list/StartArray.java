package pz_2_3_2_my_array_list;
public class StartArray {
    public static void startProgram() {
        MyArrayList list = new MyArrayList();

        list.add(new Box(2, 3, 4));
        list.add(new Box(1, 1, 1));
        list.add(new Box(3, 3, 3));

        System.out.println("Після add():");
        printList(list);


        list.add(1, new Box(5, 5, 5));
        System.out.println("\nПісля add(1, new Box(5,5,5)):");
        printList(list);

        Box[] moreBoxes = {new Box(2,2,2), new Box(4,4,1)};
        list.addAll(moreBoxes);
        System.out.println("\nПісля addAll(new Box[]{...}):");
        printList(list);

        Box[] insertBoxes = {new Box(1,2,3), new Box(2,3,1)};
        list.addAll(2, insertBoxes);
        System.out.println("\nПісля addAll(2, new Box[]{...}):");
        printList(list);

        list.set(0, new Box(10, 10, 10));
        System.out.println("\nПісля set(0, new Box(10,10,10)):");
        printList(list);

        Box b = list.get(3);
        System.out.println("\nget(3): " + b);

        Box removed = list.remove(1);
        System.out.println("\nПісля remove(1), видалено: " + removed);
        printList(list);

        System.out.println("\nРозмір списку: " + list.size());
    }

    private static void printList(MyArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
