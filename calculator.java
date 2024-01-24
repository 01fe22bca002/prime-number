class calci{

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
  
      calci c = new calci();
      c.sum(10,20);
      c.subs(10,20);
      c.prod(10,20);
      c.div(10,20);
  

      
  }


}