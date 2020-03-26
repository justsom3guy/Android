public class AndroidPhone {
    private int phonePirce;
    private int screenSize;
    private double thickness;
    private boolean isAudioJackPresent;
    private String phoneName;
    private String phoneBrand;
    
    //empyt constructor
    public AndroidPhone(){};
    
    //constructor
    public AndroidPhone(int price,int size,double thickness,boolean audio,String name,String brand){
        this.phoneBrand=brand;
        this.phoneName=name;
        this.phonePirce=price;
        this.thickness=thickness;
        this.isAudioJackPresent=audio;
        this.screenSize=size;
    }

    //setters
    void setScreenSize(int size){
        this.screenSize=size;
        
    }
    void setPhoneName(String name){
        this.phoneName=name;
    }
    void setIsAudioJackPresent(boolean audio){
        this.isAudioJackPresent=audio;
        
    }
    void setThickness(double thickness){
        this.thickness=thickness;
    }
    void setphonePrice(int price){
        this.phonePirce=price;
    }
    void setphoneBrand(String brand){
        this.phoneBrand=brand;
        
    }

    //printmethod
    void myAwesomePhone(){
        System.out.println("\n \n--------------");
        System.out.println("Phone Name = " +phoneName+"\n"+"Phone brand = "+phoneBrand+"\n"+"Price = $"+phonePirce+"\n"+"Audio Jack present = "+isAudioJackPresent+"\n"+"Thickness = "+thickness+"mm \n"+"Screen Size = "+this.screenSize+" inches \n");
    }

    
    void buildPhone(int price,int size,double thickness,boolean audio,String name,String brand){
        this.phoneBrand=brand;
        this.phoneName=name;
        this.phonePirce=price;
        this.thickness=thickness;
        this.isAudioJackPresent=audio;
        this.screenSize=size;
    }

}