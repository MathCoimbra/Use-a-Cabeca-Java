package com.fridgesmagnets;

public class TestArrays {
  public static void main(String[] args) {
    String[] islands = new String[4];
    int[] index = new int[4];
    int y = 0;
    int ref;

    islands[0] = "Bermuda";
    islands[1] = "Fiji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";

    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;

    while (y < 4) {
      ref = index[y];
      System.out.print("island = ");
      System.out.println(islands[ref]);
      y = y + 1;
    }
  }
}
