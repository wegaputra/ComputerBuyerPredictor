package predictor;

public class ComputerBuyerPredictor {
    public boolean predict (int umur, int statusPelajar,int tingkatPelunasanKredit){
        boolean potensiMenjadiCustomer  = false;
        
        if(umur == 1){
            potensiMenjadiCustomer = true;
        } else if (umur == 0 && statusPelajar == 0){
            potensiMenjadiCustomer = true;
        } else if (umur == 2 && tingkatPelunasanKredit == 0){
            potensiMenjadiCustomer = true;
        } else{
            potensiMenjadiCustomer = false;
        }
        return potensiMenjadiCustomer;
    }
}
