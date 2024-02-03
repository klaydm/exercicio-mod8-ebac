public class MediaAluno {

    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7) {
            System.out.printf("Parabéns!\nAprovado com a média %.2f", media);
        }else {
            if(media >= 4.0 || media <= 6.0){
                System.out.printf("Você está em recuperação\nSua média foi %.2f", media);
            }else{
                System.out.printf("Infelizmente você reprovou :(\nSua média foi %.2f", media);
            }
        }

        return media;
    }
}
