import java.util.*;

class animal{
    String name;
    double height;
    int weight,speed;

    animal(String A,Double B,int C,int D){
        name = A;
        height = B;
        weight = C;
        speed = D;
    }

    void show(){
        System.out.println(name+"\t"+height+"\t"+weight+"\t"+speed);
    }

    double distance(int x,double y){
        return x * y * speed;
    }
    
    int distance(int x){
        return x * speed;
    }

    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class human extends animal{
    String gender;

    human(String A, Double B, int C, int D, String E){
        super(A, B, C, D);
        gender = E;
    }

    double distance(int x,double y){
        return x * y * speed;
    }
    
    int distance(int x){
        return x * speed;
    }

    void show(){
        System.out.println(name+"\t"+height+"\t"+weight+"\t"+speed+"\t"+gender);
    }
}

class snow extends human{
    String snowy;

    snow(String A,Double B,int C,int D,String E,String F){
        super(A,B,C,D,E);
        snowy=F;
    }

    void show(){
        System.out.println(name+"\t"+height+"\t"+weight+"\t"+speed+"\t"+gender+"\t"+snowy);
    }

    double distance(int x,double y){
        return 2*x*y*speed;
    }
    
    int distance(int x){
        return 2*x*speed;
    }
}


public class A1103210_0331_1 {
    public static void main(String[] args) {

        animal.showinfo();
        
        animal[] Character = new animal[2];
        human[] Character2 = new human[3];
        snow[] Character3 = new snow[1];

        Character[0] = new animal("雪寶",1.1,52,100);
        
        Character[1] = new animal("驢子",1.5,99,200);

        Character2[0] = new human("阿克",1.9,80,150,"男");

        Character2[1] = new human("漢斯",1.8,78,130,"男");

        Character2[2] = new human("安那",1.7,48,120,"女");

        Character3[0] = new snow("愛沙",1.7,50,120,"女","YES");
       
        System.out.println("項目姓名 "+"身高(公尺) "+"體重(公斤) "+"速度(公尺/分鐘) "+"性別 "+"冰凍技能");

    for(int i = 0 ; i <= 1 ; i++){

        Character[i].show();

    }

    for(int i = 0 ; i <= 2 ; i++){

        Character2[i].show();

    }

   Character3[0].show();

    Scanner sc = new Scanner(System.in);

    for(int i = 0 ; i <= 1 ; i++){
        
      int x1;
      Double y1;

      System.out.println("請輸入"+Character[i].name+"的x(min):");
      x1 = sc.nextInt();
      System.out.println("請輸入"+Character[i].name+"的y(加速度)(若無則輸入0):");
      y1 = sc.nextDouble();

      if ( y1 == 0 )
      System.out.println(Character[i].name+"的跑步距離為:"+Character[i].distance(x1));
      else
      System.out.println(Character[i].name+"的跑步距離為:"+Character[i].distance(x1,y1));

    }

    for(int i = 0 ; i <= 2 ; i++){
        
        int x2;
        Double y2;
  
        System.out.println("請輸入"+Character2[i].name+"的x(min):");
        x2 = sc.nextInt();
        System.out.println("請輸入"+Character2[i].name+"的y(加速度)(若無則輸入0):");
        y2 = sc.nextDouble();
  
        if ( y2 == 0 )
        System.out.println(Character2[i].name+"的跑步距離為:"+Character2[i].distance(x2));
        else
        System.out.println(Character2[i].name+"的跑步距離為:"+Character2[i].distance(x2,y2));
  
      }
    
        
        int x3;
        Double y3;
  
        System.out.println("請輸入"+Character3[0].name+"的x(min):");
        x3 = sc.nextInt();
        System.out.println("請輸入"+Character3[0].name+"的y(加速度)(若無則輸入0):");
        y3 = sc.nextDouble();
  
        if ( y3 == 0 )
        System.out.println(Character3[0].name+"的跑步距離為:"+Character3[0].distance(x3));
        else
        System.out.println(Character3[0].name+"的跑步距離為:"+Character3[0].distance(x3,y3));
  

    sc.close();

        
    }
}
    
