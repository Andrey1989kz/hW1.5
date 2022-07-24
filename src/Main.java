public class Main {
    public static void main(String[] args) {


        // задание 1 и 2
        System.out.println("Задание 1 и 2");

        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.println(first[i]);
            } else {
                System.out.print(first[i] + ", ");
            }
        }

        System.out.println();

        double[] second = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < second.length; i++) {
            if (i == second.length - 1) {
                System.out.println(second[i]);
            } else {
                System.out.print(second[i] + ", ");
            }
        }

        System.out.println();

        int[] third = new int[]{332, 333, 1028, 9961, 15};
        for (int i = 0; i < third.length; i++) {
            if (i == third.length - 1) {
                System.out.println(third[i]);
            } else {
                System.out.print(third[i] + ", ");
            }
        }

        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int[] first3 = new int[]{1, 2, 3};
        for (int i = first3.length - 1; i >= 0; i--) {
            if (i == first3.length - 3) {
                System.out.print(first3[i]);
            } else {
                System.out.print(first3[i] + ", ");
            }
        }
        System.out.println();

        double[] secondThri = {1.57, 7.654, 9.986};
        for (int i = 0; i < secondThri.length; i++) {

            int counter = secondThri.length - 1;
            while (counter > 0) {
                System.out.print(secondThri[counter] + ", ");
                counter--;
            }
            System.out.println(secondThri[0]);
            break;
        }


        int[] thirdThriT = {332, 333, 1028, 9961, 15};
        for (int i = 0; i < thirdThriT.length; i++) {
            int ary = thirdThriT.length - 1;
            while (ary > 0) ;{
                System.out.print(thirdThriT[ary] + ", ");
                ary--;
                System.out.println(thirdThriT[0]);
            }
        }
        //задание 4
        System.out.println("Задание 4");
        int[] thirdThri = {332, 333, 1028, 9961, 15};
        for (int i = 0; i < thirdThri.length; i++) {
            if (thirdThri[i] % 2 != 0) thirdThri[i]++;
            System.out.print(thirdThri[i] + " ");
        }
    }
}
