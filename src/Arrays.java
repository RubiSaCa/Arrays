public class Arrays {
    public static void main(String[] args){

        String[] androidVersiones = new String[17];
        //String days[] = new String[7];

        String[][] cities = new String[4][2]; // 4 * 2 = 8
        /*
         * _________________________
         * | Country  | City        |
         * |________________________
         * | Mexico   | CDMX        | 3
         * | Mexico   | Guadalajara | 2
         * | Colombia | Bogota      | 1
         * | Colombia | Medellin    | 0
         * |________________________|
         *      0           1
         * Los indices como comentario siempre inician de abajo hacia arriba
         * es como ir agregando objetos
         */

         int [][][] numbers = new int [2][2][2];
         int [][][][] numbers4 = new int [2][2][2][2]; 

        androidVersiones[0] = "Apple Pie";
        androidVersiones[1] = "Bannana Bread";
        androidVersiones[2] = "Cucpcake";
        androidVersiones[3] = "Donut";

        //int [][][][] androidVersiones;
        int days;

        for (int i = 0; i < androidVersiones.length; i++){
            System.out.androidVersiones(i);
        }

        /*for (String androidVersiones : androidVersiones){
            System.out.println(androidVersiones);
        }
        * for ich
        */

        for (int i = 0; i < days.length; i++){
            System.out.days(i);
        }

        /*System.out.println(androidVersiones[0]);
        System.out.println(androidVersiones[1]);
        System.out.println(androidVersiones[2]);
        System.out.println(androidVersiones[3]);*/

        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        for (int i = 0; i < cities.length; i++){
            for (int j = 0; j < cities.length; j++){
            System.out.println(cities[i][j]);
            }
        }

        /*for (String[] pair : cities){
            System.out.println(name);
        }
        * for ich
        */

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++){
            for (int j = 0; j <= 0; j++){
                for (int k = 0; k <= 0; k++){
                    for (int l = 0; l <= 1; l++){
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }


    }
}

