public class AlmanNotSistemi {

    public int notSistemi(int not){

        if (not<0||not>100){
            throw new IllegalArgumentException("Gecersiz Not Girdiniz");
        }if (not<50){
            return 6;
        }if (not<60){
            return 5;
        }if (not<70){
            return 4;
        }if(not<80){
            return 3;
        }if (not<90){
            return 2;

        }return 1;
    }
}
