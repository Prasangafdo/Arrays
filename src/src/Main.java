package src;

/**
 * Created by Prasanga Fernando on 11/10/2017.
 * This project is to revise the knowledge of arrays.
 * It contains arrays in different formats.
 * 2D (mutidimentional) arrays also there.
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 234;
        arr[1] = 98734;
        arr[2] = 213;
        arr[3] = 4324;
        arr[4] = 76321;
                //{5, 4, 3, 2, 1};
for (int i = 0; i<arr.length;i++){
    System.out.println(arr[i]);
}
        System.out.println();

int arr2[] = {234,324,654,123,612};

        for (int i= 0; i<arr2.length;i++){
            System.out.println(arr2[i]);
            System.out.println();
        }

        //declaring and initializing 2D array
        int arr2D [][]={{1,2,3},{2,4,5},{4,4,5}};

//printing 2D array
        for(int i=0;i<3;i++){//This loop travels outside the curly braces [i][]
            for(int j=0;j<3;j++){//This loop travels inside the curly braces [][j]..
                                 //See below souts for more understandings.
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(arr2D[0][0]);//To understand
        System.out.println(arr2D[0][1]);

    }
}
