package com.driver;

public class Main {

    public static void main(String[] args) {
      Product p= new Product();

      p.product(1,1);
      p.product(2,2,2);
      p.product(3d, 3d);
    }
  }

  class Product{
    public int product(int x, int y) {
      return 1;
    }
    public int product(int x, int y, int z){
      return 2;
    }
    public double product(double x, double y) {
      return 3;
    }
  }