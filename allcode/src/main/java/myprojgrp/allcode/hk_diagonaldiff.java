package myprojgrp.allcode;



import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result1 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	
    	if (arr.size()<1)
		return 0;
    	
    	int i=0;
    	int leftdia=0,rightdia=0;
    	while (i<arr.size()){
    		//leftdia+=arr.get(i);
    		///System.out.println(arr.get(i).get(i)+"::"+arr.get(i).get(arr.get(i).size()-(i+1)));
    		leftdia+=arr.get(i).get(i);
    		rightdia+=arr.get(i).get(arr.get(i).size()-(i+1));
    		i++;
    	}
    	return Math.abs(leftdia-rightdia);
    // Write your code here

    }

}

public class hk_diagonaldiff {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result1.diagonalDifference(arr);
        System.out.println("result"+result);
       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
