package bagadt;

public class BagADTtest {

    public static void main(String[] args)
    {
        
        BagADT myBag = new BagADT();
        System.out.println(myBag);      
        myBag.display();
        System.out.println("---------------------");
        
        
        myBag.add("berat");
        myBag.add("berat");  
        myBag.add("gumus");
        myBag.add("berat");
        myBag.add("gumus");
        myBag.add("data");
        
        
        System.out.println("'berat','berat','gumus','berat','gumus' ,'data' are added to Bag ");
        System.out.println(myBag);
        myBag.display();
        System.out.println("---------------------");
        
        boolean isThere=myBag.contains("berat");
        System.out.println("contains 'berat' : "+isThere);
        isThere=myBag.contains("Berat");
        System.out.println("contains 'Berat' : "+isThere);
        System.out.println("---------------------");
        
        int distictsize=myBag.distictSize();
        System.out.println("distictSize : "+distictsize);
        System.out.println("---------------------");
        
        int elementsize=myBag.elementSize("gumus");
        System.out.println("elementSize of 'gumus' : "+elementsize);
        System.out.println("---------------------");
        
        int size=myBag.size();
        System.out.println("size of Bag : "+size);
        System.out.println("---------------------");
        
        myBag.remove("berat");  
        myBag.remove("berat");
        myBag.remove("berat");
        myBag.remove("data");
        myBag.remove("gumus");
        System.out.println("'berat','berat','berat','data','gumus' are removed from Bag");
        System.out.println(myBag);
        myBag.display();
        System.out.println("---------------------");
        
        System.out.println("Tried to remove 'berat' from Bag,although it is not in the Bag");
        myBag.remove("berat");
        System.out.println("---------------------");
        
        boolean isEmpty=myBag.isEmpty();
        System.out.println("isEmpty : "+isEmpty);
        
        myBag.clear();
        
        System.out.println("After clear function");
        isEmpty=myBag.isEmpty();
        System.out.println("isEmpty : "+isEmpty);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BagADT myBag1 = new BagADT();
        System.out.println(myBag1);      
        myBag1.display();
        System.out.println("---------------------");
        
        
        myBag1.add(5);
        myBag1.add(7);  
        myBag1.add(9);
        myBag1.add(5);
        myBag1.add(7);
        myBag1.add(5);
        
        
        System.out.println("'5','7','9','5','7' ,'5' are added to Bag ");
        System.out.println(myBag1);
        myBag1.display();
        System.out.println("---------------------");
        
        boolean isThere1=myBag1.contains(5);
        System.out.println("contains '5' : "+isThere1);
        isThere1=myBag1.contains(1);
        System.out.println("contains '1' : "+isThere1);
        System.out.println("---------------------");
        
        int distictsize1=myBag1.distictSize();
        System.out.println("distictSize : "+distictsize1);
        System.out.println("---------------------");
        
        int elementsize1=myBag1.elementSize(5);
        System.out.println("elementSize of '5' : "+elementsize1);
        System.out.println("---------------------");
        
        int size1=myBag1.size();
        System.out.println("size of Bag : "+size1);
        System.out.println("---------------------");
        
        myBag1.remove(5);  
        myBag1.remove(7);
        myBag1.remove(7);
        myBag1.remove(5);
        
        System.out.println("'5','7','7','5' are removed from Bag");
        System.out.println(myBag1);
        myBag1.display();
        System.out.println("---------------------");
        
        System.out.println("Tried to remove '7' from Bag,although it is not in the Bag");
        myBag1.remove(7);
        System.out.println("---------------------");
        
        boolean isEmpty1=myBag1.isEmpty();
        System.out.println("isEmpty : "+isEmpty1);
        
        myBag1.clear();
        
        System.out.println("After clear function");
        isEmpty1=myBag1.isEmpty();
        System.out.println("isEmpty : "+isEmpty1);
        

    }

}
