import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimulationBigO{

    public static double addToMap(double x){
        Map<Integer, Integer> testMap = new HashMap<Integer, Integer>();
        double n = Math.pow(10,x);
        double startTime = System.currentTimeMillis();
        for(int i = 1; i<n; i++){
            testMap.put(i, 2*i);
        }
        double endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public static double averageAddToMap(double x){
        double sum = 0;
        for(int i =0; i<10; i++){
            sum = sum + addToMap(x);
        }
        return sum/10;
    }

    public static Map<Integer, Integer> createMapOfSizeN(double x){
        Map<Integer, Integer> outputMap = new HashMap<Integer,Integer>();
        for(int i = 0; i<x; i++){
            outputMap.put(i, 2*i);
        }
        return outputMap;

    }

    public static double delToMap(double x){
        double n = Math.pow(10, x);
        Map<Integer, Integer> testMap = createMapOfSizeN(n);
        double startTime = System.currentTimeMillis();
        for(int i = 0; i<n; i++){
            testMap.remove(i);
        }
        double endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public static double averageDelToMap(double x){
        double sum = 0;
        for(int i =0; i<10; i++){
            sum = sum + delToMap(x);
        }
        return sum/10;
    }

    public static double addToFrontList(double x){
        List<Integer> testList = new ArrayList<Integer>();
        double startTime = System.currentTimeMillis();
        double n = Math.pow(10, x);
        for (int i = 0; i<n; i++){
            testList.add(0,1);
        }
        double endTime = System.currentTimeMillis();
        return (endTime-startTime);
    }

    public static double averageAddToFrontList(double x){
        double sum = 0;
        for(int i =0; i<10; i++){
            sum = sum + addToFrontList(x);
        }
        return sum/10;
    }

    public static double addToMiddleList(double x){
        List<Integer> testList = new ArrayList<Integer>();
        double n = Math.pow(10, x);
        int position = 0;
        double startTime = System.currentTimeMillis();
        for(int i = 0; i<n; i++){
            testList.add(position,1);
            position = testList.size()/2;
        }
        double endTime = System.currentTimeMillis();
        return(endTime - startTime);

    }

    public static double averageAddToMiddleList(double x){
        double sum = 0;
        for(int i =0; i<10; i++){
            sum = sum + addToMiddleList(x);
        }
        return sum/10;
    }


    public static double addToEndList(double x){
        List<Integer> testList = new ArrayList<Integer>();
        double startTime = System.currentTimeMillis();
        double n = Math.pow(10, x);
        for (int i = 0; i<n; i++){
            testList.add(1);
        }
        double endTime = System.currentTimeMillis();
        return (endTime-startTime);
    }

    public static double averageAddToEndList(double x){
        double sum = 0;
        for(int i =0; i<10; i++){
            sum = sum + addToEndList(x);
        }
        return sum/10;
    }

    public static List<Integer> createListOfSizeN(double x){
        List<Integer> outputList = new ArrayList<Integer>();
        for(int i = 0; i<x; i++){
            outputList.add(1);
        }
        return outputList;
    }

    public static double delToFrontList(double x){
        double n = Math.pow(10, x);
        List<Integer> testList  = createListOfSizeN(n);
        double startTime = System.currentTimeMillis();
        while(!testList.isEmpty()){
            testList.remove(0);
        }
        double endTime = System.currentTimeMillis();
        return(endTime - startTime);
    }

    public static double averageDelToFrontList(double x){
        double sum = 0;
        for(int i =0; i<10; i++){
            sum = sum + delToFrontList(x);
        }
        return sum/10;
    }

    public static double delToMiddleList(double x){
        double n = Math.pow(10, x);
        List<Integer> testList  = createListOfSizeN(n);
        int position = testList.size()/2;
        double startTime = System.currentTimeMillis();
        while(!testList.isEmpty()){
            testList.remove(position);
            position = testList.size()/2;
        }
        double endTime = System.currentTimeMillis();
        return(endTime - startTime);
    }

    public static double averageDelToMiddleList(double x){
        double sum = 0;
        for(int i =0; i<10; i++){
            sum = sum + delToMiddleList(x);
        }
        return sum/10;
    }

    public static double delToEndList(double x){
        double n = Math.pow(10, x);
        List<Integer> testList  = createListOfSizeN(n);
        double startTime = System.currentTimeMillis();
        while(!testList.isEmpty()){
            testList.remove(testList.size()-1);
        }
        double endTime = System.currentTimeMillis();
        return(endTime - startTime);
    }

    public static double averageDelToEndList(double x){
        double sum = 0;
        for(int i =0; i<10; i++){
            sum = sum + delToEndList(x);
        }
        return sum/10;
    }



    public static void main(String[] args) {

        System.out.println("add to map");
        for(int i = 0; i<8; i++){ //when i = 8, which is n = 10^8, the OutOfMemoryError will happen.
            Double time = averageAddToMap(i);
            System.out.println("The big O of n = "+Math.pow(10, i)+" is "+ time);
        }

        System.out.println("del to map");
        for(int i = 0; i<8; i++){ //when i = 8, which is n = 10^8, the OutOfMemoryError will happen.
            Double time = averageDelToMap(i);
            System.out.println("The big O of n = "+Math.pow(10, i)+" is "+ time);
        }

        System.out.println("add to the front of list");
        for(int i = 0; i<6; i++){ // when i = 6 , which is 10^6, it takes too long time for the algorithem to run
            Double time = averageAddToFrontList(i);
            System.out.println("The big O of n = "+Math.pow(10, i)+" is "+time);
        }

        System.out.println("add to the middle of list");
        for(int i = 0; i<6; i++){// when i = 6 , which is 10^6, it takes too long time for the algorithem to run
            Double time = averageAddToMiddleList(i);
            System.out.println("The big O of n = "+Math.pow(10, i)+" is "+ time);
        }

        System.out.println("add to the end of list");
        for(int i = 0; i<9; i++){
            Double time = averageAddToEndList(i);
            System.out.println("The big O of n = "+Math.pow(10, i)+" is "+ time);
        }

        System.out.println("del from the front of list");
        for(int i = 0; i<6; i++){ // when i = 6 , which is 10^6, it takes too long time for the algorithem to run
            Double time = averageDelToFrontList(i);
            System.out.println("The big O of n = "+Math.pow(10, i)+" is "+ time);
        }

        System.out.println("del from the middle of list");
        for(int i = 0; i<6; i++){ // when i = 6 , which is 10^6, it takes too long time for the algorithem to run
            Double time = averageDelToMiddleList(i);
            System.out.println("The big O of n = "+Math.pow(10, i)+" is "+ time);
        }

        System.out.println("del from the end of list");
        for(int i = 0; i<9; i++){ 
            Double time = averageDelToEndList(i);
            System.out.println("The big O of n = "+Math.pow(10, i)+" is "+ time);
        }



    }
}