class Cafeteira {
    boolean ligado;
    int qtdeCafe;
    int qtdeAgua;

    public Cafeteira() {
        this.ligado = false;
        this.qtdeCafe = 0;
        this.qtdeAgua = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void encherCafe(int cafe) {
        if (cafe >= 0)
            this.qtdeCafe += cafe;
    }

    public void encherAgua(int agua) {
        if (agua > 0)
            this.qtdeAgua += agua;
    }

    public String status() {
        return "A cafeteira está ligada? " + ligado +
                "\nA quantidade de café é " + qtdeCafe + " gramas" +
                "\nA quantidade de água é " + qtdeAgua + " ml";
    }

    public boolean fazerCafe() {
        if (qtdeCafe >= 7 && qtdeAgua >= 30 && ligado) {
            qtdeAgua -= 30;
            qtdeCafe -= 7;
            return true;
        }
        return false;
    }
}
