package Sprint_4.Övning_8;

import java.io.Serializable;

public class Response implements Serializable {
    private Kompis kompis;
    private boolean thereIsSuchKompis;

    public Response() {
    }

    public Response(Kompis kompis, boolean thereIsSuchKompis) {
        this.kompis = kompis;
        this.thereIsSuchKompis = thereIsSuchKompis;
    }

    public Kompis getKompis() {
        return kompis;
    }

    public void setKompis(Kompis kompis) {
        this.kompis = kompis;
    }

    public boolean isThereIsSuchKompis() {
        return thereIsSuchKompis;
    }

    public void setThereIsSuchKompis(boolean thereIsSuchKompis) {
        this.thereIsSuchKompis = thereIsSuchKompis;
    }

    @Override
    public String toString(){
        return getKompis().toString();
    }
}