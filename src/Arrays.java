public class Arrays {
    public int[]numbs;
    public Astronaut[]  astro;
    public static void main(String[] args) {
        System.out.println("welcome to awesome arrays");
        new Arrays();


    }
    public Arrays(){




        numbs=new int[100];
        Astronaut A1 =new Astronaut();
        astro=new Astronaut[7];


        for(int y=0;y<numbs.length; y++){
            numbs[y]=(int)(Math.random()*1834)+1;


        }
        astro[0] = new Astronaut();

        astro[0].eyes = 2;

        astro[0].name = "ben";
        astro[0].primtInfo();

        astro[1] = new Astronaut();

        astro[1].eyes = 13;

        astro[1].name = "mike";
        astro[1].primtInfo();

        astro[2] = new Astronaut();

        astro[2].eyes = 24;

        astro[2].name = "stephen b";
        astro[2].primtInfo();

        astro[3] = new Astronaut();

        astro[3].eyes = 8;

        astro[3].name = "joseph";
        astro[3].primtInfo();

        astro[4] = new Astronaut();

        astro[4].eyes = 10;

        astro[4].name = "jacob";
        astro[4].primtInfo();
        astro[5] = new Astronaut();

        astro[5].eyes = 20;

        astro[5].name = "gerald";
        astro[5].primtInfo();
        astro[6] = new Astronaut();

        astro[6].eyes = 18;

        astro[6].name = "naomi";
        astro[6].primtInfo();




        displayArray();
        summary();
        averageNum();
        MaxNum();
        MinNum();

        A1.primtInfo();



    }
    public void displayArray(){
        for (int x=0;x<numbs.length;x++) {
            System.out.println(numbs[x]);
        }

    }

    public void summary(){


        System.out.println(numbs.clone());



    }

    public void averageNum(){
        System.out.println(java.util.Arrays.stream(numbs).average());




    }
    public void MaxNum(){
        System.out.println(java.util.Arrays.stream(numbs).max());


    }
    public void MinNum(){
        System.out.println(java.util.Arrays.stream(numbs).min());

    }
}
