public class StarTriangle {
    int wight;

  public StarTriangle(int wight){
      this.wight=wight;
  }
      public String toString(){

          return String.format("[*]\n[*][*]\n[*][*][*]\n[*][*][*][*]",wight);
      }

}
