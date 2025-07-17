package array;

public class Array {

    public static void main(String[] args) {

        String[] names = new String[5];

        names[0] = "Bartek";
        System.out.println(names[0]);
        names[1] = "Marcin";
        System.out.println(names[1]);
        names[2] = "Asia";
        System.out.println(names[2]);
        names[3] = "Monika";
        System.out.println(names[3]);
        names[4] = "Tomek";
        System.out.println(names[4]);

        System.out.println("\n");

        // PĘTLA FOR - może wyświetlać określone elementy

        for (int i = 0; i < names.length; i++) {
            if (i % 2 != 0) {
                System.out.println(names[i]);
            }
        }

        System.out.println("\n");

        // PĘTLA FOREACH - wyświetla zawsze wszystkie elementy
        for (String name : names) {
            System.out.println(name);
        }


        //---
        System.out.println("\n");

        int[] numbers = new int[]{1, 2, 3, 4, 5};

        String[] friends = new String[]{"Szymon", "Tymoteusz", "Tobiasz"};
        System.out.println(friends.length);


        //---
        System.out.println("\n");

        String[] newNames = new String[]{"Zachariasz", "Jeremiasz", "Horacy"};
        System.out.println(friends.length);

        // FOREACH
        for (String newName : newNames) {
            System.out.println(newName.toUpperCase());
        }
        System.out.println(newNames[0]);

        // FOR
        for (int i = 0; i < newNames.length; i++) {
            System.out.println(newNames[i].toUpperCase());
        }


        System.out.println("\n");


        // ZADANIE REKRUTACYJNE

        int[] points = {1,2,3,4,5};
        int first = points[0];
        int last = points[points.length -1];
        points[0] = last;
        points[points.length -1] = first;
        for (int point: points) {
            System.out.println(point);
        }


    }
}
