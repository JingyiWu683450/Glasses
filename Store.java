public class Store {
    private int total = 0;
    private int number;
    Glasses[] glasses= new Glasses[number];
    private boolean isFull(){
        return total==glasses.length;
    }
    private boolean isEmpty(){
        return total==0;
    }

    public boolean add(Glasses Glasses) {
        if(isFull()){
            return false;
        }
        else{

            glasses[ total]=Glasses;
            int i = 0;
            total=i++;
            return true;
        }
    }
    public String listGlasses() {
        String listOfGlasses;
        if (isEmpty()) {
            return "No Glasses in the store";
        } else {
            listOfGlasses = "";
            for (int i = 0; i < total; i++) {
                listOfGlasses += i + ":" + glasses[i] + "\n";
            }
        }
        return listOfGlasses;
    }
   public Glasses cheapest(){
       int i;
       Glasses cheapest = glasses[0];
       for(i=0; i<total; i++){
            if(glasses[i].getPrice()<cheapest.getPrice())
                cheapest=glasses[i];
        }
       return cheapest;
   }


}
