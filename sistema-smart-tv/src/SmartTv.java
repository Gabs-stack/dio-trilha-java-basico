public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;
//Aqui cumpre o primeiro requisito, que é ligar e desligar a Tv.
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
//Aqui cumpre o segundo requisito, que é aumentar e diminuir o volume.
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public	void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
//Aqui cumpre o terceiro requisito, que é mudar de canal 1 a 1 ou o número que quiser.
    public void mudarCanal (int novoCanal){
        canal=novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
