package com.target;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BarrenLandMain {

	private static final int GRID_SIZE = 1;
	private static final int WIDTH = 400;
	private static final int HEIGHT = 600;

	private static final int X_GRID = WIDTH / GRID_SIZE;
	private static final int Y_GRID = HEIGHT / GRID_SIZE;

	private static Grid[][] grid = new Grid[X_GRID][Y_GRID];

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] barrenLandInut=null;
        try {
    		System.out.print("Enter number of barren lands:");
			int landCount = Integer.parseInt(br.readLine());
			barrenLandInut = new String[landCount];
			System.out.println("Enter "+ landCount +" coordinates...");
			for(int i=0; i< landCount; i++) {
				barrenLandInut[i]=br.readLine();
			}
			System.out.println("Processing...");
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	//	String[] STDIN = { "0 292 399 307" };
     //   String[] STDIN = {"48 192 351 207", "48 392 351 407", "120 52 135 547", "260 52 275 547"};

        LandAnalyser analyser = new LandAnalyser(new Grid[X_GRID][Y_GRID]);
		String result = analyser.findFertileLand(barrenLandInut);
		System.out.println(result);

	}

}
