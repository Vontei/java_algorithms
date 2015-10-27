public class BuildingBlock{

    public int width;
    public int length;
    public int height;
    public int volume;
    public int area;

    public Block(int[] arr){
    this.width = arr[0];
    this.length = arr[1];
    this.height = arr[2];
    this.volume = this.height*this.width*this.length;
    int a = this.height;
    int b = this.width;
    int c = this.length;
    this.area = 2*(a*b)+ 2*(b*c) + 2*(a*c);
  }

  public int getWidth(){
    return this.width;
  }

  public int getLength(){
    return this.length;
  }

  public int getHeight(){
    return this.height;
  }

  public int getVolume(){
     return this.volume;
  }

  public int getSurfaceArea(){
    return this.area;
  }


}
