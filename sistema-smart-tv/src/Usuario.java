public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv= new SmartTv();
     //Aqui cumpre o terceiro requisito, que é mudar de canal 1 a 1 ou o número que quiser.
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
       
     //Aqui cumpre o segundo requisito, que é aumentar e diminuir o volume.
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
     //Aqui cumpre o primeiro requisito, que é ligar e desligar a Tv.
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada: " + smartTv.ligada);
    }
}
