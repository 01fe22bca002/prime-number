class calculator extends shape {

  void sum(int a,int b){
      System.out.println("Sum ="+a+b);
  }

  void subs(int a,int b){
      System.out.println("diff ="+(a-b));

  }

  void prod(int a,int b){
      System.out.println("prod ="+a*b);
  }

  void div(int a,int b){
      System.out.println("Sum ="+a/b);
  }

  public static void main(String args[]){
  
      calculator c = new calculator();
      c.sum(10,20);
      c.subs(10,20);
      c.prod(10,20);
      c.div(10,20);
      System.out.println("area is "+c.area_of_triangle(2,3));
      System.out.println("area is "+c.area_of_rectangle(4,5));

      
  }


}