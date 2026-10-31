package modelo.servicios;

public class Vacunacion implements Cobrable {
    private Enfermedad enfermedad;
    private int precioVacuna;

    public Vacunacion(Enfermedad nombreEnfermedad) {
        this.enfermedad = nombreEnfermedad;
        switch (enfermedad) {
            case RABIA:
            case PARASITOSIS_INTESTINAL:
            case OTITIS:
                this.precioVacuna = 250;
                break;

            case PARVOVIROSIS:
            case MOQUILLO:
            case TOS_DE_LAS_PERRERAS:
                this.precioVacuna = 400;
                break;

            case LEUCEMIA_FELINA:
            case PANLEUCOPENIA:
                this.precioVacuna = 450;
                break;

            case NEWCASTLE:
            case PSITACOSIS:
            case CANDIDIASIS_AVIAR:
            case CIRCOVIRUS_AVIAR:
                this.precioVacuna = 300;
                break;

            case LEISHMANIOSIS:
                this.precioVacuna = 750;
                break;

            case INMUNODEFICIENCIA_FELINA:
            case PIF:
                this.precioVacuna = 800;
                break;

        }
    }

    public Enfermedad getNombreEnfermedad() {
        return enfermedad;
    }


    @Override
    public int calcularCosto() {
        return precioVacuna;
    }

    @Override
    public void generarComprobante() {
        System.out.println("Vacunacion concluida por enfermedad " + enfermedad);
    }
}