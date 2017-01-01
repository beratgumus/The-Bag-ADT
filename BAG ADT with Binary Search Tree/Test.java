package com.company;

public class Test {

    public static void main(String[] args) {

        Bag myBag=new Bag();
        System.out.println(myBag);
        System.out.println("---------------------");


        myBag.add(7);
        myBag.add(7);
        myBag.add(4);
        myBag.add(2);
        myBag.add(6);
        myBag.add(9);
        myBag.add(2);
        myBag.add(13);
        myBag.add(10);
        myBag.add(11);

        System.out.println("'7','7','4','2','6' ,'9','2','13','10','11' are added to Bag ");
        System.out.print("BAG = ");
        System.out.println(myBag);
        System.out.print("BAG =  ");
        myBag.printInorder(myBag);
        System.out.println();
        System.out.println("---------------------");

        boolean isThere1=myBag.contains(10);
        System.out.println("contains '10' : "+isThere1);
        isThere1=myBag.contains(8);
        System.out.println("contains '8' : "+isThere1);
        System.out.println("---------------------");

        int distictsize1=myBag.distictSize();
        System.out.println("distictSize : "+distictsize1);
        System.out.println("---------------------");

        int elementsize1=myBag.elementSize(2);
        System.out.println("elementSize of '2' : "+elementsize1);
        System.out.println("---------------------");

        int size1=myBag.size();
        System.out.println("size of Bag : "+size1);
        System.out.println("---------------------");
        myBag.remove(2);
        myBag.remove(11);
        myBag.remove(6);
        myBag.remove(9);

        System.out.println("'2','11','6','9' are removed from Bag");
        System.out.print("BAG = ");
        System.out.println(myBag);
        System.out.println("---------------------");

        System.out.println("Tried to remove '9' from Bag,although it is not in the Bag");
        myBag.remove(9);
        System.out.println("---------------------");

        boolean isEmpty1=myBag.isEmpty();
        System.out.println("isEmpty : "+isEmpty1);

        myBag.clear();

        System.out.println("After clear function");
        isEmpty1=myBag.isEmpty();
        System.out.println("isEmpty : "+isEmpty1);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Bag myBag1 = new Bag();
        System.out.println(myBag1);
        System.out.println("---------------------");

        myBag1.add("minnesota");
        myBag1.add("florida");
        myBag1.add("california");
        myBag1.add("arizona");
        myBag1.add("california");
        myBag1.add("washington");
        myBag1.add("new york");
        myBag1.add("texas");


        System.out.println("'minnesota','florida','california','arizona','california' ,'washington','new york','texas' are added to Bag ");
        System.out.print("BAG = ");
        System.out.println(myBag1);
        System.out.println("---------------------");

        boolean isThere=myBag1.contains("california");
        System.out.println("contains 'california' : "+isThere);
        isThere=myBag1.contains("utah");
        System.out.println("contains 'utah' : "+isThere);
        System.out.println("---------------------");

        int distictsize=myBag1.distictSize();
        System.out.println("distictSize : "+distictsize);
        System.out.println("---------------------");

        int elementsize=myBag1.elementSize("california");
        System.out.println("elementSize of 'california' : "+elementsize);
        System.out.println("---------------------");

        int size=myBag1.size();
        System.out.println("size of Bag : "+size);
        System.out.println("---------------------");

        myBag1.remove("california");
        myBag1.remove("texas");
        myBag1.remove("arizona");
        myBag1.remove("minnesota");
        System.out.println("'california','texas','arizona','minnesota' are removed from Bag");
        System.out.print("BAG = ");
        System.out.println(myBag1);
        System.out.println("---------------------");


        System.out.println("Tried to remove 'texas' from Bag,although it is not in the Bag");
        myBag1.remove("texas");
        System.out.println("---------------------");

        boolean isEmpty=myBag1.isEmpty();
        System.out.println("isEmpty : "+isEmpty);

        myBag1.clear();

        System.out.println("After clear function");
        isEmpty=myBag1.isEmpty();
        System.out.println("isEmpty : "+isEmpty);

    }
}
