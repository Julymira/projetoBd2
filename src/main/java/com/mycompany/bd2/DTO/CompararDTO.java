package com.mycompany.bd2.DTO;

public class CompararDTO {
    private int id;
    private int obj1Nota;
    private int obj1Peso;
    private int obj2Nota;
    private int obj2Peso;
    private int obj3Nota3;
    private int obj3Peso3;
    private int idobjComparacao;

    public CompararDTO(int obj1Nota, int obj1Peso, int obj2Nota, int obj2Peso, int obj3Nota3, int obj3Peso3, int idobjComparacao) {
        setObj1Nota(obj1Nota);
        setObj1Peso(obj1Peso);
        setObj2Nota(obj2Nota);
        setObj2Peso(obj2Peso);
        setObj3Nota3(obj3Nota3);
        setObj3Peso3(obj3Peso3);
        setIdobjComparacao(idobjComparacao);
    }

    public CompararDTO(int id, int obj1Nota, int obj1Peso, int obj2Nota, int obj2Peso, int obj3Nota3, int obj3Peso3, int idobjComparacao) {
        setId(id);
        setObj1Nota(obj1Nota);
        setObj1Peso(obj1Peso);
        setObj2Nota(obj2Nota);
        setObj2Peso(obj2Peso);
        setObj3Nota3(obj3Nota3);
        setObj3Peso3(obj3Peso3);
        setIdobjComparacao(idobjComparacao);
    }


    public CompararDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getObj1Nota() {
        return obj1Nota;
    }

    public void setObj1Nota(int obj1Nota) {
        this.obj1Nota = obj1Nota;
    }

    public int getObj1Peso() {
        return obj1Peso;
    }

    public void setObj1Peso(int obj1Peso) {
        this.obj1Peso = obj1Peso;
    }

    public int getObj2Nota() {
        return obj2Nota;
    }

    public void setObj2Nota(int obj2Nota) {
        this.obj2Nota = obj2Nota;
    }

    public int getObj2Peso() {
        return obj2Peso;
    }

    public void setObj2Peso(int obj2Peso) {
        this.obj2Peso = obj2Peso;
    }

    public int getObj3Nota3() {
        return obj3Nota3;
    }

    public void setObj3Nota3(int obj3Nota3) {
        this.obj3Nota3 = obj3Nota3;
    }

    public int getObj3Peso3() {
        return obj3Peso3;
    }

    public void setObj3Peso3(int obj3Peso3) {
        this.obj3Peso3 = obj3Peso3;
    }

    public int getIdobjComparacao() {
        return idobjComparacao;
    }

    public void setIdobjComparacao(int idobjComparacao) {
        this.idobjComparacao = idobjComparacao;
    }
}
