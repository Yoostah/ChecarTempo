
package tempos;


public class Tempos {
    //variáveis de classe
    private int reg;
    private int num_pc;
    private int equipe;
    private String hora;
    private String resto;

    //construtor completo
    public Tempos(int reg, int equipe, int num_pc, String hora, String resto) {
        this.reg = reg;
        this.num_pc = num_pc;
        this.equipe = equipe;
        setHora(hora);
        this.resto = resto;
    }
    
    //get e set

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

    public int getNum_pc() {
        return num_pc;
    }

    public void setNum_pc(int num_pc) {
        this.num_pc = num_pc;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        String h = hora.substring(0,2)+":"+hora.substring(2,4)+":"+hora.substring(4,6)+":"+hora.substring(6,8);
        //String t = hora+"ok";
        this.hora = h;
    }

    public String getResto() {
        return resto;
    }

    public void setResto(String resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "{" +reg+ " " + num_pc + " " + equipe + " " + hora + " " + resto + '}';
    }
    
    
    
}
